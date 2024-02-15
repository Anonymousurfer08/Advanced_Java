/**
 *
 * @author kayas
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.io.*;  
import javax.servlet.*;  
  
public class First extends GenericServlet{  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
        res.setContentType("text/html");  

        PrintWriter out=res.getWriter();  
        out.print("<html><body>");  
        out.print("<b>hello generic servlet</b>");  
        out.print("</body></html>");
    }
}
