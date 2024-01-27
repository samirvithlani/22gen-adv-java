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
 * Servlet Filter implementation class AddStudentValidation
 */
public class AddStudentValidation implements Filter {

    /**
     * Default constructor. 
     */
    public AddStudentValidation() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		
		boolean isError = false;
		
		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String strAge = request.getParameter("txtStudentAge");
		
		if(ValidationUtil.isEmpty(sName)) {
			isError = true;
			request.setAttribute("nameError", "name is reqired error message from filter..*");
		}
		
		
		if(isError==true) {
			
			request.getRequestDispatcher("AddStudent.jsp").forward(request, response);
		}
		else {
			chain.doFilter(request, response);
		}
		System.out.println("filter activated....");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
