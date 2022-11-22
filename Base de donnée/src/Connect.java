import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Connect {
	private static Connection con ;
static
{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ok");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogue","root" ,"" );
			System.out.println("Connection ok");   
		} catch (Exception e) {
			e.printStackTrace() ;
		}
		
	}
	public static Connection getConnection()
	{
		return con;
	}
}
	