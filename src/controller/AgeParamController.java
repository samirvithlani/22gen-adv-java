package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgeParamController
 */
public class AgeParamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("txtName");
		String strage = request.getParameter("txtAge");
		int age = 0;
		if (!strage.trim().equals("") && !strage.equals(null)) {

			age = Integer.parseInt(strage);
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (age < 18) {

			out.write("<font color='red'> you are not eligible  -> " + age + "</font>");
			out.write("<font color='red'> you are not eligible  -> " + name + "</font>");
		} else {
			out.write("<font color='green'> you are not eligible  -> " + age + "</font>");
			out.write("<font color='green'> you are not eligible  -> " + name + "</font>");
		}

	}

}
