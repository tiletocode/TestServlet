package com.tiletocode.testservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cal_App")
public class Cal_App extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        PrintWriter out = resp.getWriter();
        String v_ = req.getParameter("v");
        String op = req.getParameter("operator");

        ServletContext app = req.getServletContext();

        int v = 0;
        if(!v_.equals(""))
            v = Integer.parseInt(v_);
        //계산
        if (op.equals("=")) {

            int x = (Integer)app.getAttribute("value");
            int y = v;
            String operator = (String)app.getAttribute("op");

            int result = switch (operator) {
                case "+" -> result = x + y;
                case "-" -> result = x - y;
                case "x" -> result = x * y;
                default -> result = x / y;
            };
            out.println("result is "+result);
        } else {
            //값 저장
            app.setAttribute("value", v);
            app.setAttribute("op", op);

            resp.sendRedirect("/Cookie.jsp");
        }
    }
}



