/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kayas
 */
import javax.servlet.* ;
import javax.servlet.http.*;
import java.io.*;
public class First extends HttpServlet
{
String u,p;
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
u=req.getParameter("usr");
p=req.getParameter("pwd");

Cookie c1=new Cookie("usr1","suni");
Cookie p1=new Cookie("pwd1","ani");
Cookie c2=new Cookie("usr2","abc");
Cookie p2=new Cookie("pwd2","123");
Cookie c3=new Cookie("usr3","def");
Cookie p3=new Cookie("pwd3","456");
Cookie c4=new Cookie("usr4","mno");
Cookie p4=new Cookie("pwd4","789");
res.addCookie(c1);
res.addCookie(p1);
res.addCookie(c2);
res.addCookie(p2);
res.addCookie(c3);
res.addCookie(p3);
res.addCookie(c4);
res.addCookie(p4);
out.println("COOKIE ADDED");
out.println("<br>");
int flag=0;
String user[]={c1.getValue(),c2.getValue(),c3.getValue(),c4.getValue()};
String pwd[]={p1.getValue(),p2.getValue(),p3.getValue(),p4.getValue()};
for(int i=0;i<4;i++)
{ if (user[i].equals(u)&&pwd[i].equals(p))
        flag=1;
        }
if (flag==1)
    out.println("welcome"+u.toUpperCase());
else
    out.println("Invalid user");
}
}