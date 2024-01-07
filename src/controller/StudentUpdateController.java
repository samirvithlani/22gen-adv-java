package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import dao.StudentDao;

/**
 * Servlet implementation class StudentUpdateController
 */
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		int sAge = Integer.parseInt(request.getParameter("txtStudentAge"));
		int sId = Integer.parseInt(request.getParameter("txtStudentId"));

		StudentBean studentBean = new StudentBean();
		studentBean.setsId(sId);
		studentBean.setsName(sName);
		studentBean.setsEmail(sEmail);
		studentBean.setsAge(sAge);

		boolean flag = new StudentDao().updateStudent(studentBean, sId);

		if (flag) {

			response.sendRedirect("StudentListController");
		} else {
			response.sendRedirect("StudentListController");
		}

	}

}
