package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;

/**
 * Servlet implementation class SendData
 */
public class SendData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> users = new ArrayList<String>();
		users.add("amit");
		users.add("ram");
		users.add("parth");
		users.add("neha");
		users.add("neel");
		users.add("priya");

		request.setAttribute("userList", users);

		List<EmployeeBean> employees = new ArrayList<EmployeeBean>();

		EmployeeBean employeeBean1 = new EmployeeBean();
		employeeBean1.seteId(101);
		employeeBean1.seteName("ram");
		employeeBean1.seteAge(100);

		EmployeeBean employeeBean2 = new EmployeeBean();
		employeeBean2.seteId(102);
		employeeBean2.seteName("krishna");
		employeeBean2.seteAge(90);

		employees.add(employeeBean1);
		employees.add(employeeBean2);

		request.setAttribute("empList", employees);

		// without taking data just redirect..
		// response.sendRedirect("data.jsp");

		// req,session,application
		request.setAttribute("name", "raj");
		// create object of requestDispacther
		RequestDispatcher rd = request.getRequestDispatcher("data.jsp");
		rd.forward(request, response);

	}

}
