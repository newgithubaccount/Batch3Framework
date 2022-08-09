package util;

public class ExcelReader {
	
	
	static String username;
	static String password;
	
	public static void readData()
	{
		username="dummyd411@gmail.com";
		password="dummy@123";
	}
	public static String getUsername() {
		readData();
		return username;
	}
	public static String getPassword() {
		readData();
		return password;
	}

}
