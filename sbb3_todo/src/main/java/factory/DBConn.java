package factory;

import java.sql.Connection;

public class DBConn {
	static Connection con;
	public static Connection getConn() {
		try {
			class.forName("com.mysql.jdbc.driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbb3_todo","root","Kamal@2004");
		}catch(Execption e) {
			e.printStackTrace();
		}
		return con;
	}

}
