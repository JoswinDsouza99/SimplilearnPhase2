package sql.folder;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmt {
	public Connection conn;
	
	public CallableStmt(String url, String uname, String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = DriverManager.getConnection(url, uname, pass);
	}
	
	public static void main(String[] args) {
		CallableStmt cs;
		try {
			cs = new CallableStmt("jdbc:mysql://localhost:3306/simplilearn", "root", "");
			CallableStatement callSt = cs.conn.prepareCall("call PRODUCT_PROC(?,?,?)");
			callSt.setInt(1, 2);
			callSt.setInt(3, 550);
			callSt.registerOutParameter(2, Types.VARCHAR);
			callSt.execute();
			System.out.println(callSt.getString(3));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
