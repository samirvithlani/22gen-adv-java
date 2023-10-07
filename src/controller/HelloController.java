package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloController
 */
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response..
		// mime type..
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter no 1");
//		int no1 = sc.nextInt();
//		System.out.println("enter no 2");
//		int no2 = sc.nextInt();
//		
//		int ans = no1 + no2;

		System.out.println("enter your Name :");
		String name = sc.next();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html>");
		out.write("<h1>HELLO</h1>");
//		out.write("<h2>No1  = "+no1+"</h2>");
//		out.write("<h2>No2  = "+no2+"</h2>");
//		out.write("<h2>Ans  = "+ans+"</h2>");
		out.write("<h2>Name = " + name.toUpperCase() + "</h2>");

		out.write("</html>");
		out.close();
	}

}
