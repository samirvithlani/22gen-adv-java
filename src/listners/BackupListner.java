package listners;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class BackupListner
 *
 */
public class BackupListner implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public BackupListner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("listner called.....");
		FileWriter fw;
		Date date = new Date();
		File file = new File("D:\\backup1.txt");

		try {
			boolean flag = file.createNewFile();
			System.out.println(flag);
			System.out.println("file created....");
			fw = new FileWriter(file);
			fw.write("hi this is written by tomcat");
			fw.write(date.toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
