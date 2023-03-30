<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>

<% 
	Connection con;
	Statement stmt;
	ResultSet rs;
	ResultSetMetaData md;
	
	String url = "jdbc:mysql://localhost:3306/studentS";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
		con = DriverManager.getConnection(url,"Lokesh","Test@123");
		
		con.setAutoCommit(false);
		
		stmt = con.createStatement();
		
		rs = stmt.executeQuery("select * from users");
		
		md = rs.getMetaData();
		int count = md.getColumnCount();
		
		out.println("<table border=1>");
		out.println("<tr>");
		
		for (int i=1; i<=count; i++) {
		out.println("<th>");
		out.print(md.getColumnName(i));
		}
		
		while (rs.next()) {
			out.println("<tr>");
			out.println("<td>"+rs.getString(1)+"<td>"+rs.getString(2)+"<td>"+rs.getString(3)+"<td>"+rs.getString(4)+"<td>"+rs.getString(5));
			%><br><%
		}
	}
	catch (Exception e){
		System.out.println(e.toString());
} %>

</body>
</html>