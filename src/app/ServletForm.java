package app;

import models.Assistant;
import models.Memory;
import models.Review;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ServletForm", urlPatterns = {"/rate"})
public class ServletForm extends HttpServlet {

	private Memory memory;

	public ServletForm() {
		this.memory = new Memory();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int rating = Integer.parseInt(request.getParameter("rating"));

		memory.addReview(new Review(new Assistant(firstName, lastName), rating));
		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
		request.setAttribute("message", "Review successfully saved!");
		disp.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<Review> reviews = memory.getReviews();
		Map<Assistant, List<Integer>> ratingsMap = new HashMap<>();

		for (Review rating : reviews) {
			if (!ratingsMap.containsKey(rating.getAssistant())) {
				ratingsMap.put(rating.getAssistant(), new ArrayList<>());
			}

			ratingsMap.get(rating.getAssistant()).add(rating.getRating());
		}

		Map<Assistant, Double> ratings = new HashMap<>();

		for (Assistant assistant : ratingsMap.keySet()) {
			int size = ratingsMap.get(assistant).size();
			double sum = 0;

			for (double rating : ratingsMap.get(assistant)) {
				sum += rating;
			}

			double avgRating = sum / size;
			ratings.put(assistant, avgRating);
		}

		RequestDispatcher disp = request.getRequestDispatcher("ratings.jsp");
		request.setAttribute("ratings", ratings);
		disp.forward(request, response);
	}
}
