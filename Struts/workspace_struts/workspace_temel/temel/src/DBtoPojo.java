import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DBtoPojo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:derby://localhost:1527/myeclipse", "classiccars",
					"classiccars");
			Statement stmt = con.createStatement();
			String sql = "select * from employee";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int sutun = rsmd.getColumnCount();
			HashMap<String, String> typeName = new HashMap<String, String>();
			typeName.put("INTEGER", "int");
			typeName.put("DOUBLE", "double");
			typeName.put("VARCHAR", "String");
			typeName.put("CHAR", "String");
			for (int i = 1; i <= sutun; i++) {
				String sutunTipi = rsmd.getColumnTypeName(i);
				System.out.println("private " + typeName.get(sutunTipi) + "\t"
						+ rsmd.getColumnName(i).toLowerCase() + ";");
			}
			System.out.println();
			System.out.println();

			for (int i = 1; i <= sutun; i++) {
				String str = rsmd.getColumnName(i).toLowerCase();
				String str1 = "set" + str.substring(0, 1).toUpperCase()
						+ str.substring(1);
				String str2 = "employee." + str1 + "(rs.getString(\"" + str
						+ "\"));";

				System.out.println(str2);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
