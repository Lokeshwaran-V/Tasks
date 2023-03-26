package Lokesh;

import java.sql.*;


public class MyClass {
	public static void main (String [] arg) {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
			
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();
			
			String in = "insert into register values(005,'lll',555)"; 
			stmt.executeUpdate(in);
			
			in = "insert into register values(006,'ooo',666)"; 
			stmt.executeUpdate(in);
			
			in = "insert into register values(007,'ppp',777)"; 
			stmt.executeUpdate(in);
			
			con.commit();
			ResultSet rs = stmt.executeQuery("select * from register");
			
			
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			String dl = "delete from register " + "WHERE S_Name = 'lll'"; 
			stmt.executeUpdate(dl);
			
			rs = stmt.executeQuery("select * from register");
			
			System.out.println("\n---------After deletion----------");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			String up = "update register " + "SET S_Name = 'zzz' WHERE S_no = 6"; 
			stmt.executeUpdate(up);
			
			rs = stmt.executeQuery("select * from register");
			
			System.out.println("\n---------After updation----------");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			rs = stmt.executeQuery("select * from register");
			
			System.out.println("\n---------After Roll-back----------");
			con.rollback();
			
			
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

}