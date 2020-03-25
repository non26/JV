package connect2MySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class connectMYSQL {
	public static void main(String[] args) {
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/world"+
					"?user=root&password=...");
			if (connect != null) {
				System.out.println("Database Connected");
			}else {
				System.out.println("Database connect failed");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		// query
		try {
		Statement stmt = connect.createStatement();
		String queryStmt = "SELECT * FROM city LIMIT 10";
		ResultSet result = stmt.executeQuery(queryStmt);
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			}
		}
		catch (SQLException  e) {
			e.printStackTrace();
		}
		try {
			if (connect != null) {
				connect.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
