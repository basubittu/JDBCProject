import java.sql.*;

public class SelectStaementByUsingPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee_info";
		String userName = "root";
		String pwd = "Basu199502@";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Loaded");
		}

		catch (Exception e) {
			System.out.println("Exception is---->" + e.getMessage());
		}

		try {
			Connection conn = DriverManager.getConnection(url, userName, pwd);
			String sql = "Select * from employee_info where id=?";
			PreparedStatement prdstmnt = conn.prepareStatement(sql);
			prdstmnt.setInt(1, 110);
			ResultSet rst = prdstmnt.executeQuery();
			while (rst.next()) {
				System.out.println("Id----->" + rst.getInt("id"));
				System.out.println("Name----->" + rst.getString("name"));
				System.out.println("Address----->" + rst.getString("address"));
			}

		} catch (SQLException e) {
			System.out.println("Exception is---->" + e.getMessage());
		}

	}

}
