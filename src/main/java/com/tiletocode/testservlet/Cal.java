package com.tiletocode.testservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cal", value = "/Cal")
public class Cal extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        int a = 0;
        int b = 0;

        String bt = req.getParameter("button");
        String a_ = req.getParameter("a");
        String b_ = req.getParameter("b");

        if (!a_.equals(""))
            a = Integer.parseInt(a_);
        if(!b_.equals(""))
            b = Integer.parseInt(b_);

        int result = switch (bt) {
            case "plus" -> a + b;
            case "minus" -> a - b;
            case "multiple" -> a * b;
            default -> a / b;
        };
        out.println("계산결과: " + result);
    }
}
