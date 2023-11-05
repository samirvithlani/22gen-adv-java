package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ProductBean;

/**
 * Servlet implementation class AddProductController1
 */
public class AddProductController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public static List<ProductBean> products = new ArrayList<ProductBean>();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("txtProductName");
		int productPrice = Integer.parseInt(request.getParameter("txtProductPrice"));
		String colors[] = request.getParameterValues("colors");

		ProductBean productBean = new ProductBean();
		
		//set all params to bean obj
		productBean.setpName(productName);
		productBean.setpPrice(productPrice);
		// converting string array to list...
		productBean.setColors(Arrays.asList(colors));
		
		
		//add bean obj to products list
		products.add(productBean);
		
		
		//set attribute
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("ProductList1.jsp");
		rd.forward(request, response);
		

	}

}
