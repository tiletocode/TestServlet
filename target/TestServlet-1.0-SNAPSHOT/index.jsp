<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
</head>
<body>
<form action="Cal" method="post">
    <div>
        <h1>계산할 값을 입력하세요</h1>
        <input name="a" type="number">
        <input name="b" type="number">
    </div>
    <div>
        <input type="submit" name="button" value="+">
        <input type="submit" name="button" value="-"><br>
        <input type="submit" name="button" value="x">
        <input type="submit" name="button" value="/">
    </div>
</form>
</body>
</html>