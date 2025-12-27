import java.sql.*;

public class DataConnect {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmnt = null;
		ResultSet result = null;

		// code for get Connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Data is connected");
		} catch (Exception e) {
			System.out.println("exception is----->" + e.getMessage());
		}

		try {
			String url = "jdbc:mysql://localhost:3306/employee_info";
			String userName = "root";
			String pwd = "Basu199502@";
			conn = DriverManager.getConnection(url, userName, pwd);
			stmnt = conn.createStatement();
			String sqlQuery = "select * from employee_info";
			result = stmnt.executeQuery(sqlQuery);
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String address = result.getString("address");
				System.out.println("id------>" + id);
				System.out.println("name------>" + name);
				System.out.println("address------>" + address);
				System.out.println("###################################1");

			}

		}

		catch (Exception e) {
			System.out.println("error is---->" + e.getMessage());
		}

		finally {
			conn.close();
			stmnt.close();

		}

	}

}
