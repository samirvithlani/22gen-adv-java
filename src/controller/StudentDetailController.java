package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import dao.StudentDao;

/**
 * Servlet implementation class StudentDetailController
 */
public class StudentDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sId = Integer.parseInt(request.getParameter("sid"));
		System.out.println(sId);

		StudentDao studentDao = new StudentDao();
		StudentBean studentBean = studentDao.getStudentDetailById(sId);

		if (studentBean != null) {
			request.setAttribute("student", studentBean);
			request.setAttribute("message", "student fetch successfully");
			request.getRequestDispatcher("studentDetail.jsp").forward(request, response);
		} else {

			request.setAttribute("student", null);
			request.setAttribute("message", "Error while fetching student");
			request.getRequestDispatcher("studentDetail.jsp").forward(request, response);
		}
	}

}
