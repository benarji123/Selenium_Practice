package prcatice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlPractice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//String query="select * from Credentials";
		int sno=6;
		String name="akdm";
	    String p="skdm1";
		String query="insert into Credentials values ("+ sno +", '"+ name +"', '"+ p +"')";
		String Url="jdbc:mysql://localhost:3306/userdata";
		String username="root";
		String Password="narada";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection(Url, username, Password);
	 Statement s=c.createStatement();
	// ResultSet r = s.executeQuery(query);
	   s.executeUpdate(query);
		
//		PreparedStatement s=c.prepareStatement(query);
//		s.setInt(1, 5);
//		s.setString(2, "narada");
//		s.setString(3, "alskw");
		//int r=s.executeUpdate();
		//System.out.println(r);
//		 while(r.next()) {
//			 System.out.println(r.getString(1)+"  "+r.getString(2)+"  "+r.getString(3));
//		}
		 
		 s.close();
		 c.close();

	}

}
