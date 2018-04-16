/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Bharath Jagadeesh
 */
@WebServlet(urlPatterns = {"/RegistrationController"})
public class RegistrationController extends HttpServlet {
        public static boolean isValid(String email)
         {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                             
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
         }
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mail = request.getParameter("mail");
		String pwd = request.getParameter("pwd");	
                String pwd2 = request.getParameter("pwd2");	
                int i;
                int c=0;
		if(fname.isEmpty()||lname.isEmpty()||mail.isEmpty()||pwd.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);                        
		}
                else if(pwd.equals(pwd2))
		{
			 if (isValid(mail))
                        {
                            
                             if (pwd.length() <= 8)
                            {
                              for (i = 0; i <= pwd.length(); i++)
                              {
                                char x = pwd.charAt(i);
                                if (Character.isLetter(x))
                                {
                                  if (Character.isDigit(x))
                                  c = 1;
                                }
                                if (c == 1)
                                {
                                   RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                                    rd.forward(request, response);
                                }
                                else 
                                {
                                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                                    out.println("<font color=red>Please Enter a valid email</font>");
                                    rd.include(request, response); 
                                }
                                                          }
                            }
                        }
			 else
                        {
                            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                            out.println("<font color=red>Please Enter a Stl</font>rong Password");
                            rd.include(request, response);  
                        }               
		}
		else
		{   
                         RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			out.println("<font color=red>Password Mismatch</font>");
			rd.include(request, response);        
                       
		}
	}


}
