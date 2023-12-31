package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;

/**
 * Servlet implementation class StudentDeleteController
 */
public class StudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sId = Integer.parseInt(request.getParameter("sid"));
		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.deleteStudent(sId);
		if(flag==true) {
			
			response.sendRedirect("StudentListController");
		}
		else {
			response.sendRedirect("StudentListController");
		}
	}

}
