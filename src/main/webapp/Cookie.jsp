<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Cookie</title>
</head>
<body>
<form action="Cal_Cookie" method="post">
    <div>
        <h1>계산할 값을 입력하세요</h1>
        <input name="v" type="text">
    </div>
    <div>
        <input type="submit" name="operator" value="+">
        <input type="submit" name="operator" value="-"><br>
        <input type="submit" name="operator" value="x">
        <input type="submit" name="operator" value="/"><br>
        <input type="submit" name="operator" value="=">
    </div>
</form>
</body>
</html>