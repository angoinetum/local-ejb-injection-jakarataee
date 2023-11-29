package ee.mrts.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ee.mrts.service.HelloService;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @EJB
    private HelloService helloService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            final String hello = helloService.sayHello();
            out.println("<p>HelloService says: " + hello);
        }
    }

    @Override
    public String getServletInfo() {
        return "HelloServlet tests HelloService";
    }
}
