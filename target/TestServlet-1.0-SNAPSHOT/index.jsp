<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
</head>
<body>
<form action="Cal" method="post">
    <h1>계산할 값을 입력하세요</h1>
    <input name="a" type="number">
    <input name="b" type="number"><br><br>
    <input type="submit" name="button" value="plus">
    <input type="submit" name="button" value="minus"><br>
    <input type="submit" name="button" value="multiple">
    <input type="submit" name="button" value="divide">

</form>
</body>
</html>