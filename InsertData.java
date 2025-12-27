import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee_info";
		String userName = "root";
		String pwd = "Basu199502@";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" DataBase Connected");

		}

		catch (Exception e) {
			System.out.println("Error is------>" + e.getMessage());
		}

		try {
			Connection conn = DriverManager.getConnection(url, userName, pwd);
			Statement stmnt = conn.createStatement();
			String Sql = "insert into employee_info (id,name, address) values (105,'Amit Das','Cooch Behar');";
			int data = stmnt.executeUpdate(Sql);

			if (data > 0) {
				System.out.println("Data is Succelly fully connected" + data + " no of data Is inserted ");
			}

		}

		catch (SQLException e) {
			System.out.println("Error present" + e.getMessage());
		}

	}

}
