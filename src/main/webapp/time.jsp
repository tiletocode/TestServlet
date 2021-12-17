<%@ page import="java.util.*" contentType="text/html; charset=utf8" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
    <html>

    <head>
        <title> Hello JSP</title>
    </head>

    <body>
        <%
            Date now = new Date();
            SimpleDateFormat nowTime = new SimpleDateFormat("yyyy년 MM월 dd일");

            String today = nowTime.format(now);
            out.print("오늘 일자는 "+today+" 입니다.");
         %>

    </body>

    </html>