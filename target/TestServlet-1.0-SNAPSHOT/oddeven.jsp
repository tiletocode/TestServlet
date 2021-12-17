<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MVC Model 1</title>
</head>
<body>
<form action="oddeven" method="get">
    <% int result = 5; %>
    <%= request.getAttribute("result") %>입니다.
</form>
</body>
</html>