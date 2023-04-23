package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;



public class LogTest {
	public static void main( String[] args )
    {
    	try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Logger","Logger","Admin@123");
			
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();
			
			
			String createTable = "CREATE TABLE IF NOT EXISTS LOG (INDEX_NO int(3),"
					+ "NAME VARCHAR(10),"
					+ "PHNO INT(3))";
			
			stmt.executeUpdate(createTable);
			
			String in = "INSERT INTO LOG VALUES(005,'lll',555)"; 
			stmt.executeUpdate(in);
			
			in = "INSERT INTO LOG VALUES(006,'ooo',666)"; 
			stmt.executeUpdate(in);
			
			in = "INSERT INTO LOG VALUES(007,'ppp',777)"; 
			stmt.executeUpdate(in);
			
			con.commit();
			ResultSet rs = stmt.executeQuery("SELECT * FROM LOG");
			
			
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			String dr = "DROP TABLE LOG"; 
			stmt.executeUpdate(dr);
			
			Logger logger = Logger.getLogger(LogTest.class.getName());
			logger.info("This is info message");
			
		}
		catch (Exception e){
			System.out.println(e.toString());
			System.out.println("NO");
		}
    	
    }
}
