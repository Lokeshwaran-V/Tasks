package api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.net.*;

/**
 * Servlet implementation class users
 */
public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		var pw = response.getWriter();
		response.setContentType("text/html");
	
		Connection con;
		Statement stmt;
		ResultSet rs;
		ResultSetMetaData md;
		String username = "Lokesh";
		String password = "Test@123";
		
		String link = "jdbc:mysql://localhost:3306/studentS";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection(link,username,password);
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select * from users");
			
			md = rs.getMetaData();
			int count = md.getColumnCount();
			
			pw.println("<table border = 1>");
			pw.println("<tr>");
			
			for (int i=1; i<=count; i++) {
				
				pw.println("<th>");
				pw.println(md.getColumnName(i));
			}
		
			while (rs.next()) {
				pw.println("<tr>");
				pw.println("<td>"+rs.getString(1)+
						"<td>"+rs.getString(2)+
						"<td>"+rs.getString(3)+
						"<td>"+rs.getString(4)+
						"<td>"+rs.getString(5));
			}
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
