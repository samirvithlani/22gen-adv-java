package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ProductBean;

/**
 * Servlet implementation class AddProductController
 */
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	static List<ProductBean> products = new ArrayList<ProductBean>();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("pname");
		int price = Integer.parseInt(request.getParameter("pprice"));
		String colors[] = request.getParameterValues("colors");

		ProductBean productBean = new ProductBean();
		productBean.setpName(name);
		productBean.setpPrice(price);
//		Arrays.asList(colors);
		productBean.setColors(Arrays.asList(colors));

		products.add(productBean);

		request.setAttribute("products", products);
		request.getRequestDispatcher("productlist.jsp").forward(request, response);

	}

}
