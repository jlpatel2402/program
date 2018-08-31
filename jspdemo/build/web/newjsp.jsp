

<%@page import="javafx.beans.binding.Bindings"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello Bidulog!</h1>
      <% String name=request.getParameter("uname"); 
      out.println("welcome to the world of jsp bidu  "+name);
      %><br>
      <%
      out.println("Your IP address is " + request.getRemoteAddr());
      %>
   <br>   <%=
        ("Your IP address is " + request.getRemoteAddr())
          %>
          <br>
          Current Time: <%= java.util.Calendar.getInstance().getTime()
          %>
          <%!
              int i,sum=0;
              
          %>
          <br>
          <%
          String num=request.getParameter("number");
          int a=Integer.parseInt(num);
          for (i=0;i<=a;i++)
          {
          sum=sum+i;
          
          }
          out.println("your sum is :"+sum);
          %>
    </body>
</html>

