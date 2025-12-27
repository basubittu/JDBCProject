import java.sql.*;

public class DataConnectionNew 
{

	static Connection conn = null;
	static Statement stmnt = null;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		getConnectionDB();
		selectQuery();
		insertData();
		selectQuery();
		// updateData();
		// selectQuery();

	}

	public static void getConnectionDB() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/employee_info";
		String userName = "root";
		String pwd = "Basu199502@";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DataBase is Connected");

		}

		catch (Exception e) {
			System.out.println("Data is Not connected" + e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(url, userName, pwd);
			stmnt = conn.createStatement();
		} catch (Exception e) {
			System.out.println("Exception is---->" + e.getMessage());
		}

	}

	public static void selectQuery() throws SQLException {
		String sqlQuery = "select * from  employee_info";
		ResultSet rst = stmnt.executeQuery(sqlQuery);
		while (rst.next()) {
			int id = rst.getInt("id");
			String name = rst.getString("name");
			String city = rst.getString("address");

			System.out.println("id------->" + id);
			System.out.println("name------->" + name);
			System.out.println("City---->" + city);
			System.out.println("#################");
		}

	}

	public static void insertData() throws SQLException {
		String sql = "insert into employee_info(id, name, address) values(108,'Avay Kanti','Dhaka') ";
		int data = stmnt.executeUpdate(sql);
		if (data > 0) {
			System.out.println("data inserted");
		}
	}

}
