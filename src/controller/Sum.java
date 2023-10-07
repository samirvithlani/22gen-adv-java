package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("hello..");
		String strno1 = request.getParameter("txtNo1");
		String strno2 = request.getParameter("txtNo2");
		int no1 = 0;
		int no2 = 0;
		System.out.println("str no1..."+strno1);
		if (!strno1.equals(null) && !strno1.equals("") && !strno1.trim().equals("")) {
			no1 = Integer.parseInt(strno1);
		}
		if (!strno2.equals(null) && !strno2.equals("") && !strno2.trim().equals("")) {
			no2 = Integer.parseInt(strno2);
		}
		int sum = no1+no2;
		//System.out.println(no1 + " -" + no2);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>"+no1+"</h1>");
		out.write("<h1>"+no2+"</h1>");
		out.write("<h1> ANS = "+sum+"</h1>");
		
		
//		try {
//			int no1 = Integer.parseInt(request.getParameter("txtNo1"));
//			int no2 = Integer.parseInt(request.getParameter("txtNo2"));
//			System.out.println(no1 + " - " + no2);
//		} catch (Exception e) {
//			System.out.println("err..");
//		}

	}

}
