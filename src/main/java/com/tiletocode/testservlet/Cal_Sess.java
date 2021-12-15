package com.tiletocode.testservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cal_Sess")
public class Cal_Sess extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        PrintWriter out = resp.getWriter();
        String v_ = req.getParameter("v");
        String op = req.getParameter("operator");

        HttpSession sess = req.getSession();

        int v = 0;
        if(!v_.equals(""))
            v = Integer.parseInt(v_);

        if (op.equals("=")) {

            int x = (Integer)sess.getAttribute("value");
            int y = v;
            String operator = (String)sess.getAttribute("op");

            int result = switch (operator) {
                case "+" -> x + y;
                case "-" -> x - y;
                case "x" -> x * y;
                default -> x / y;
            };
            out.println("result is "+result);
        } else {
            sess.setAttribute("value", v);
            sess.setAttribute("op", op);

            resp.sendRedirect("/Session.jsp");
        }
    }
}



