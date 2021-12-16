<%@
        page import="java.util.*"
             contentType="text/html; charset=utf8"
%>
<!DOCTYPE html>
<html>
<head>
    <title> Hello JSP</title>
</head>
<body>
JSP TEST ${2 + 7}
<% java.util.Date nowTime = new java.util.Date(); %>
<h1>현재 일자: <strong><% out.print(nowTime); %></strong></h1>

</body>
</html>
