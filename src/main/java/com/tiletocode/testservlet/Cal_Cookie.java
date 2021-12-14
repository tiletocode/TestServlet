package com.tiletocode.testservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cal_Cookie")
public class Cal_Cookie extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        PrintWriter out = resp.getWriter();
        String v_ = req.getParameter("v");
        String op = req.getParameter("operator");

        Cookie[] cookies = req.getCookies();

        int v = 0;
        if(!v_.equals(""))
            v = Integer.parseInt(v_);

        if (op.equals("=")) {

            int x = 0;
            String operator = "";
            for (Cookie c : cookies)
                if (c.getName().equals("value")) {
                    x = Integer.parseInt(c.getValue());
                    break;
                }
            for (Cookie c : cookies)
                if (c.getName().equals("op")) {
                    operator = c.getValue();
                    break;
                }

            int y = v;
            int result = switch (operator) {
                case "+" -> x + y;
                case "-" -> x - y;
                case "x" -> x * y;
                default -> x / y;
            };
            out.write("result is "+result);
        } else {
            Cookie vcookie = new Cookie("value", String.valueOf(v));
            Cookie ocookie = new Cookie("op", op);
            vcookie.setMaxAge(60 * 60 * 24);
            vcookie.setPath("/");
            ocookie.setPath("/");
            resp.addCookie(vcookie);
            resp.addCookie(ocookie);

            resp.sendRedirect("/Cookie.jsp");
        }
    }
}



