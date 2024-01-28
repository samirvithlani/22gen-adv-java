package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.StudentBean;
import dao.StudentDao;

/**
 * Servlet implementation class StudentLoginController
 */
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("txtStudentPassword");

		StudentDao studentDao = new StudentDao();
		StudentBean studentBean = studentDao.loginStudent(sEmail, sPassword);
		if (studentBean != null) {

			HttpSession session = request.getSession();
			session.setAttribute("studentBean", studentBean);
			response.sendRedirect("index.jsp");

		} else {
			request.setAttribute("loginError", "Invalid Credenatials*");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}

		doGet(request, response);
	}

}
