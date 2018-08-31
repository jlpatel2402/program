
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class form1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String txt_data = request.getParameter("txt_data");
        Cookie cookie=new Cookie("my_cookie",txt_data);
        response.addCookie(cookie);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>my cookie is set to:");
        out.println(txt_data);
        out.println("<br><br><br>");
        out.println("this page shows that the cookie hass been added");
        out.close();
        }
    }

 


