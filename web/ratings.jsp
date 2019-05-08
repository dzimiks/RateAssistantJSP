<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Ratings</title>
</head>
<body>
<c:if test="${empty requestScope.ratings}">
    <h1>There's no rating yet!</h1>
</c:if>

<ul>
    <c:forEach var="hash" items="${requestScope.ratings}">
        <li>
            <c:out value="${hash.key}"/> =>
            <fmt:formatNumber pattern="0.00" value="${hash.value}"/>
        </li>
    </c:forEach>
</ul>

<h3>
    <a href="review.jsp">Enter new rating</a>
</h3>

<jsp:useBean id="date" class="java.util.Date"/>
<p>Date: <fmt:formatDate type="date" value="${date}"/></p>
</body>
</html>
