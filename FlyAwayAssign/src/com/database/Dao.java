package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dao {
	public Connection con=null;
	public Statement st=null;

	public Dao() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","");
		System.out.println("connection established with database");
		st=con.createStatement();
	}
public List<String[]> getAvailableFlights(String f, String t, String d) {
		
		List<String[]> flights=new ArrayList<>();

		String query="SELECT * FROM flyaway.flight_details where source_city='"+f+"' and destination='"+t+"' and date_of_travel='"+d+"'";
		try {
			ResultSet rs=st.executeQuery(query);

			while(rs.next()) {
				String[] flight=new String[5];
				flight[0]=rs.getString("airline_name");
				flight[1]=rs.getString("departure_time");
				flight[2]=rs.getString("arrival_time");
				flight[3]=rs.getString("price");
				flight[4]=rs.getString("flight_no");
				flights.add(flight);
		        int size = flights.size();
		        
		        System.out.println("Size of list = " + size);
		        
			}
			return flights;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

public HashMap<String, String> checkUser(String username, String password) {
	
	HashMap<String,String> user=null;
	String query="select * from register where username='"+username+"' and password='"+password+"'";
	try {
		ResultSet rs=st.executeQuery(query);
		if(rs.next()) {
			user=new HashMap<>();
			user.put("name", rs.getString("name"));
			user.put("address",rs.getString("address"));
			user.put("age",rs.getString("age"));
			user.put("mobile",rs.getString("mobile"));
			user.put("aadhaar",rs.getString("aadhaar"));
			user.put("country",rs.getString("country"));
		}
		return user;
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return user;
}

public boolean insertUser(HashMap<String, String> user) {

	String query="INSERT INTO user (email, password, name, phno, adno) values('"+user.get("email")+"','"+user.get("password")+"','"+user.get("name")+"','"+user.get("phno")+"','"+user.get("adno")+"')";                   
	
	try {
		st.execute(query);
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

public boolean checkAdmin(String email, String password) {
	
	try {
		ResultSet rs=st.executeQuery("select * from admin where email='"+email+"' and password='"+password+"'");
		if(rs.next())
			return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

public boolean changeAdminPassword(String email, String password) {

	try {
		ResultSet rs=st.executeQuery("select * from admin where email='"+email+"'");
		if(!rs.next()) {
			return false;
		}
		st.execute("update admin set password='"+password+"' where email='"+email+"'");
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

}
