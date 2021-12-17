package com.tiletocode.testservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name="oddeven", value="/oddeven")
public class Oddeven extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = 0;
        String num_ = request.getParameter("n");
        if (num_ != null && !num_.equals(""))
            num = Integer.parseInt(num_);
        String result;
        if (num%2 != 0)
            result = "홀수";
        else
            result = "짝수";

        request.setAttribute("result", result);

        RequestDispatcher dp = request.getRequestDispatcher("/oddeven.jsp");
        dp.forward(request, response);
    }
}
