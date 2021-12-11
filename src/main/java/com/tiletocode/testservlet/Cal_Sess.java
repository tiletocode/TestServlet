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

@WebServlet(name = "Session", value = "/Cal_Sess")
public class Cal_Sess extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        String v_ = req.getParameter("v");
        String button = req.getParameter("button");

        int v = 0;
        if(!v_.equals(""))
            v = Integer.parseInt(v_);
        //Application객체
        ServletContext app = req.getServletContext();
        //Session객체
        HttpSession sess = req.getSession();
        //계산
        if (button.equals("=")) {
            //int x = (Integer)application.getAttribute("value");
            int x = (Integer)sess.getAttribute("value");
            int y = v;
            //String operator = (String)app.getAttribute("op");
            String operator = (String)sess.getAttribute("op");
            int result = 0;
            if (operator.equals("+"))
                result = x + y;
            else if (operator.equals("-"))
                result = x - y;
            else if (operator.equals("x"))
                result = x * y;
            else
                result = x / y;
            out.println("result is "+result);
        } else {
            //값 저장
            sess.setAttribute("value", v);
            sess.setAttribute("op", button);
//            app.setAttribute("value", v);
//            app.setAttribute("op", button);
        }

    }
}


