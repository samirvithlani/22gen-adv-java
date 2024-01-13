package util;

public class ValidationUtil {

	public static boolean isEmpty(String param) {
		System.out.println("called.....");
		boolean flag = false;
		if (param.trim().equals("") || param.trim() == "" || param.trim() == null) {

			System.out.println("fail...");
			flag = true;
		}
		System.out.println("passed...");

		return flag;

	}
}
