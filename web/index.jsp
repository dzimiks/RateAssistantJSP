<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<head>
    <title>Index JSP</title>
</head>
<body>
<h2>
    <c:out value="${requestScope.message}"/>
</h2>
<h3>
    <a href="review.jsp">Enter new rating</a>
</h3>
<h3>
    <a href="rate">See all ratings</a>
</h3>
</body>
</html>