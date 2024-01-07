package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import dao.StudentDao;

/**
 * Servlet implementation class StudentEditController
 */
public class StudentEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sId = Integer.parseInt(request.getParameter("sid"));
		StudentBean studentBean = new StudentDao().getStudentDetailById(sId);
		request.setAttribute("student", studentBean);
		request.getRequestDispatcher("studentEdit.jsp").forward(request, response);
	}

}
