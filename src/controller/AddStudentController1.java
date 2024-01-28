package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import dao.StudentDao;
import util.ValidationUtil;

/**
 * Servlet implementation class AddStudentController1
 */
public class AddStudentController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// add data to student table in mysql database...

		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String strAge = request.getParameter("txtStudentAge");
		String sPassword = request.getParameter("txtStudentPassword");

		int sAge = 0;
		if (!strAge.equals("") || !strAge.equals(null)) {

			sAge = Integer.parseInt(strAge);

		}

		boolean isError = false;

		// if it returns true means it fails....

		if (ValidationUtil.isEmpty(sName)) {
			System.out.println("called...");
			isError = true;
			request.setAttribute("nameError", "name is reqired*");
		}
		if (ValidationUtil.isEmpty(sEmail)) {
			isError = true;
			request.setAttribute("emailError", "<font color = 'red'>email is required*</font>");
		}
		if (sAge < 18) {
			isError = true;
			request.setAttribute("ageError", "<font color = 'red'>age is not valie*</font>");
		}

		if (isError == false) {
			// CREATE STUDENTBEAN OBJECT AND SET ALL PARAM TO STUDENT BEAN OBJECT USIENG
			// SETTER METHOD....
			StudentBean studentBean = new StudentBean();
			studentBean.setsName(sName);
			studentBean.setsEmail(sEmail);
			studentBean.setsAge(sAge);
			studentBean.setsPassword(sPassword);

			// send studentbean object to dao addstudent() method to store data in db..
			// create an object of studentDao class.

			StudentDao studentDao = new StudentDao();
			boolean flag = studentDao.addStudent(studentBean); // this method is retutring boolean value...
			// if row inserted it will return true or else false....
			if (flag == true) {

				response.sendRedirect("StudentListController");
			} else {

				System.out.println("record not inserted...");
				// error.jsp..
			}

		} else {

			request.getRequestDispatcher("AddStudent.jsp").forward(request, response);
		}

	}

}
