package listners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import bean.StudentBean;

/**
 * Application Lifecycle Listener implementation class SessionAttr
 *
 */
public class SessionAttr implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttr() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         
    	System.out.println("attribute added");
    	System.out.println(arg0.getName());
    	System.out.println(arg0.getSource());
    	System.out.println(arg0.getValue());
    	StudentBean studentBean = (StudentBean) arg0.getValue();
    	System.out.println(studentBean.getsName());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
