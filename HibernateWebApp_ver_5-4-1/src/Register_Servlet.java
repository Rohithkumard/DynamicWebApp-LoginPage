

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static String uname;
	static String pwd;
	static String email;
	static String gender;
	
    public Register_Servlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		uname = request.getParameter("uname");
		pwd = request.getParameter("pwd");
		email = request.getParameter("email");
		gender = request.getParameter("gender");
		
		Connection_File con = new Connection_File();
		NewAccount obj = con.connect2db_add(uname, pwd, email, gender);
		//NewAccount obj = new NewAccount();
		request.setAttribute("emailId", obj.getEmailId());
		request.setAttribute("gen", obj.getGender());
		request.setAttribute("id", obj.getLoginId());
		request.setAttribute("uname", obj.getName());
		request.setAttribute("pwd", obj.getPassword());
		
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	
	}

}
