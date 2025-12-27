import java.sql.*;

public class PreparedStateMntCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/employee_info";
		String username = "root";
		String pwd = "Basu199502@";
		String sql="insert into employee_info (id,name,address) values (?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Loaded");

		} catch (Exception e) {
			System.out.println("The Exception is----->" + e.getMessage());
		}
		
		try
		{
			Connection conn= DriverManager.getConnection(URL,username,pwd);
			PreparedStatement prdmnt= conn.prepareStatement(sql);
			prdmnt.setInt(1, 115);
			prdmnt.setString(2, "Basu");
			prdmnt.setString(3, "Kolkata");
			int iddata=prdmnt.executeUpdate();
			if(iddata>0)
			{
				System.out.println("Record added Successfully"+iddata+"is Updated");
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("Issue Presnt");
		}

	}

}
