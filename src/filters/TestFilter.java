package filters;

import java.io.IOException;
import java.util.Locale;
import java.util.TimeZone;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class TestFilter
 */
public class TestFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public TestFilter() {
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
//		TimeZone defaultTimeZone = TimeZone.getDefault();
//
//        // Get the ID of the timezone (e.g., "America/New_York")
//        String timeZoneId = defaultTimeZone.getID();
//
//        // Get the display name of the timezone (e.g., "Eastern Standard Time")
//        String timeZoneDisplayName = defaultTimeZone.getDisplayName();
//
//        System.out.println("Timezone ID: " + timeZoneId);
//        System.out.println("Timezone Display Name: " + timeZoneDisplayName);
//        if(!timeZoneDisplayName.equals("India Standard Time")) {
//        
//        	chain.doFilter(request, response);
//        }
//        else {
//        	System.out.println("this url is not acc,, in your remgion...");
//        }
//  
		chain.doFilter(request, response);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
