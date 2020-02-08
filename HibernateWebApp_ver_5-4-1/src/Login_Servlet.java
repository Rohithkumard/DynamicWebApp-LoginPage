/*
 * Rohith
 * 
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login_Servlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname = request.getParameter("username");
	String pwd = request.getParameter("password");
	
	Connection_File con = new Connection_File();
	if(con.connect2db(uname, pwd)) {
		System.out.println("Successfully done");
		request.setAttribute("emailId", con.emailId);
		request.setAttribute("gen", con.gen);
		request.setAttribute("id", con.id);
		request.setAttribute("uname", con.uname);
		request.setAttribute("pwd", con.pwd1);
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
		
	}else {
		System.out.println("No data Found");
		RequestDispatcher rd = request.getRequestDispatcher("login_page.jsp");
		rd.forward(request, response);
	}
	}
}
