package com.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class AgeServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	String strName = (String)request.getParameter("name");
  //   	String strAge = (String)request.getParameter("age");
  //   	int year = 2020 - Integer.parseInt(strAge);
  //   	String strMessage = "Hey " + strName + ", you may be born in "
  /*   				+ Integer.toString(year);
     	request.setAttribute("message", strMessage);
			getServletConfig().getServletContext().getRequestDispatcher(
			        "/message.jsp").forward(request,response);
*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String strUsername = (String)request.getParameter("username");
     	String strPassword = (String)request.getParameter("password");
			String strMessage = "";
			if (strUsername.equals("402-user") && strPassword.equals("402-pass")){
				strMessage = "Login Success...";
			}
			else {
				strMessage = "Login Failed...";
			}
			request.setAttribute("message", strMessage);
			getServletConfig().getServletContext().getRequestDispatcher(
							"/login-status.jsp").forward(request,response);


	}

}
