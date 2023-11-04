package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String studentName = request.getParameter("txtStudentName");
		String studentEmail = request.getParameter("txtStudentEmail");
		int studentAge = Integer.parseInt(request.getParameter("txtStudentAge"));

		String studentSkills[] = request.getParameterValues("chStudentSkills");

		System.out.println("student name" + studentName);
		System.out.println("student email " + studentEmail);
		System.out.println("student age = " + studentAge);

		// set to bean object

		StudentBean studentBean = new StudentBean();

		studentBean.setsAge(studentAge);
		studentBean.setsName(studentName);
		studentBean.setsEmail(studentEmail);
		studentBean.setsSkills(studentSkills);

		
		request.setAttribute("studentBean", studentBean);

		// redirect to jsp file and also take object...

		// requestDispatcher object....

		RequestDispatcher rd = request.getRequestDispatcher("PrintStudentDetail.jsp");
		rd.forward(request, response);

	}

}
