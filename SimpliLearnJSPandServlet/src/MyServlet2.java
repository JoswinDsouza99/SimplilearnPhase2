

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet2 extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response){
  try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();
     
      HttpSession session=request.getSession(false);
      
      String myName=(String)session.getAttribute("uname");
      String myAge=(String)session.getAttribute("uage");
      String myCity=(String)session.getAttribute("ucity");
      String myGender=(String)session.getAttribute("ugender");
      String myEmail=(String)session.getAttribute("uemail");
      
      pwriter.println("session creation time" + session.getCreationTime());
      pwriter.println("\nsession last accessed time" +session.getLastAccessedTime());
      pwriter.println("\nsession max interval time" +session.getMaxInactiveInterval());
      pwriter.println("\nsession servelt context" +session.getServletContext());
      pwriter.println("\nsession servelt context" +session.getId());
      pwriter.println(session.isNew());
      
      pwriter.print("\nName: "+myName+"\nPass: "+myAge+"\nCity: "+myCity+"\nGender: "+myGender+"\nEmail: "+myEmail);
      pwriter.close();
  }catch(Exception exp){
      System.out.println(exp);
   }
  }
}
