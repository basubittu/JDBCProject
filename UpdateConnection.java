import java.sql.*;
public class UpdateConnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   String url="jdbc:mysql://localhost:3306/employee_info";
	   String userName = "root";
	   String pwd = "Basu199502@";
	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DataBase  connected");
		} catch (Exception e) {
			System.out.println("DataBase Not connected");
		}

		try {
			Connection conn = DriverManager.getConnection(url, userName, pwd);
			Statement stmnt = conn.createStatement();
			String sql = "update employee_info  set  name='Amal' where id='103'";
			int rowNo = stmnt.executeUpdate(sql);

			if (rowNo > 0) {
				System.out.println("Successfully");
			}

		}

		catch (Exception e) 
		{
			System.out.println("The Error is---->" + e.getMessage());
		}

	}
		

	}


