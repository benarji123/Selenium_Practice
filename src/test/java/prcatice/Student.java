package prcatice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws Exception {
		//LoginUesrInfo u=new LoginUesrInfo();
		//u.sno=1;
		//u.name="Alekh";
		//u.Password="Alekh123";
		SqlMethods m=new SqlMethods ();
		m.init();
		//m.addUserDetails(u);
//		LoginUesrInfo p = m.getUserPassword_BaseOn_UserName("Alekh");
//		System.out.println(p.Password);
		m.reSetPassword("Alekh", "Hi");



	}






}
class SqlMethods{
	static Connection c=null;
	public void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://localhost:3306/userdata";
		String username="root";
		String Password="narada";
		c=DriverManager.getConnection(Url, username, Password);
	}
	public void addUserDetails(LoginUesrInfo u) {
		try {
			String insertQuery="insert into credentials values(?,?,?)";
			PreparedStatement ps = c.prepareStatement(insertQuery);
			ps.setInt(1, u.sno);
			ps.setString(2, u.name);
			ps.setString(3, u.Password);
			int res = ps.executeUpdate();
			if(res==1) {
				System.out.println("Data Inserted Successfully");
			}else {
				System.out.println("Data insertion not succefully");
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public LoginUesrInfo getUserPassword_BaseOn_UserName(String username) {
		
		try {
			LoginUesrInfo u=new LoginUesrInfo();
			u.name=username;
			String query="select Password from credentials where UnserName=?";
			PreparedStatement st = c.prepareStatement(query);
			st.setString(1, username);
			ResultSet res = st.executeQuery();
			//String p="";
			while(res.next()) {
				u.Password=res.getString("Password");
			}
			
			return u;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
			
		
	}
	
public LoginUesrInfo reSetPassword(String username,String password) {
		
		try {
			LoginUesrInfo u=new LoginUesrInfo();
			u.name=username;
			String sql = "UPDATE credentials SET Password =?  WHERE UnserName = ?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, password);
			st.setString(2, username);
			
			int res = st.executeUpdate();
			if(res==1) {
				System.out.println("Data Update");
			}else {
				System.out.println("Data Not Update");
			}
			
			return u;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
			
		
	}




}

class LoginUesrInfo {
	int sno;
	String name;
	String Password;

}