package com.example.servlet1;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns={"/maservlet"})
public class HelloServlet extends HttpServlet {
    public void service( HttpServletRequest request,
                         HttpServletResponse response )
            throws ServletException, IOException {
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><meta charset='UTF-8'></head>");
        out.println("<body>");
        out.println("<h1>Bonjour Alain Trad</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}