package hello.servlet.basic;


import javax.servlet.http.HttpServlet;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        System.out.println("HelloServlet.service");

        System.out.println("req = " + req);
        System.out.println("resp = " + resp);

        String name = req.getParameter("username");
        System.out.println("name = " + name);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello " + name);
    }
}
