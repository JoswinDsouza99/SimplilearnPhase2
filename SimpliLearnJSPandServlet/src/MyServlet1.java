

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet1 extends HttpServlet {
   
	public void doGet(HttpServletRequest request, HttpServletResponse response){
     try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();

      String name = request.getParameter("userName");
      String age = request.getParameter("userAge");
      String city = request.getParameter("userCity");
      String gender = request.getParameter("userGender");
      String email = request.getParameter("userEmail");
      
      pwriter.print("Hello "+name);
      pwriter.print("\nYour Age is: "+age);
      pwriter.print("\nYour City is: "+city);
      pwriter.print("\nYour gender is: "+gender);
      pwriter.print("\nYour Email is: "+email);
      
      //creating the HttpSession below
      HttpSession session=request.getSession(); 
      
      session.setAttribute("uname",name);
      session.setAttribute("uage",age);
      session.setAttribute("ucity",city);
      session.setAttribute("ugender",gender);
      session.setAttribute("uemail",email);
      
      pwriter.print("<a href='welcome'>view details</a>");
      pwriter.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}