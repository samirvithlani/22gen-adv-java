package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import util.ValidationUtil;

/**
 * Servlet Filter implementation class BookValidationFilter
 */
public class BookValidationFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public BookValidationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("called....");
		String bookName = request.getParameter("txtBookName");
		String strbookPrice = request.getParameter("txtBookPrice");
		int bookPrice = 0;

		boolean isError = false;

		if (ValidationUtil.isEmpty(bookName)) {
			isError = true;
			request.setAttribute("bookNameError", "*book Name is Required...");

		}
		if (!ValidationUtil.isEmpty(strbookPrice)) {

			bookPrice = Integer.parseInt(strbookPrice);
			if (bookPrice > 1000) {
				isError = true;
				request.setAttribute("bookPriceError", "*book is over priced..");
			}
		}

		if (isError) {

			request.getRequestDispatcher("AddBook.jsp").forward(request, response);
		}
		else {

		chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
