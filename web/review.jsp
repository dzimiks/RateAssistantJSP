<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Rate Assistant</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<div class="page-wrap">
    <h1>Rate Assistant</h1>

    <div id="contact-area">
        <form method="post" action="http://localhost:8080/rate">
            <label for="firstName">First name:</label>
            <input type="text" name="firstName" id="firstName"/>

            <label for="lastName">Last name:</label>
            <input type="text" name="lastName" id="lastName"/>

            <label for="rating">Rating:</label>
            <input type="number" name="rating" id="rating"/>

            <input type="submit" name="submit" value="Submit" class="submit-button"/>
        </form>
    </div>
</div>
</body>
</html>
