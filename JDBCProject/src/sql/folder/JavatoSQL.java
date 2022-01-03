package sql.folder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavatoSQL {

	private static final String url = "";
	private static final String user = "";
	private static final String password = "";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	public static void main(String args[]) {
		JavatoSQL ob = new JavatoSQL();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("========================MENU==================");
		System.out.println("1. Retrive the employees Data");
		System.out.println("2. Count number of Employees");
		System.out.println("3. Insert the new employee Record");
		System.out.println("4. Update the employee Record");
		System.out.println("=========================================");
		System.out.println("Enter your choice from (1-4):");
		
		int number = input.nextInt();
		System.out.println("Your entered option" + number);
		
		switch(number)
		{
		case 1: ob.retrieveData();
				break;
				
		case 2: ob.countEmployees();
				break;
				
		case 3: ob.insertRecord();
				break;
				
		case 4: ob.updateRecord();
				break;
		}
	}
	
	public void retrieveData()
	{
		String query1="select empid, empname, salary from emp";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, user, password);
			
			stmt = con.createStatement();
			
		rs = stmt.executeQuery(query1);
		
		while (rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String salary = rs.getString(3);
			System.out.printf("empid : %d, empname: %s, salary : %s %n", id,name,salary);
		}
		}
		catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}finally {
			try { con.close(); } catch(SQLException se) { }
			try { stmt.close(); } catch(SQLException se) { }
			try { rs.close(); } catch(SQLException se) { }
		}
	}
	
	public void countEmployees()
	{
		String query = "Select count(*) from emp";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con= DriverManager.getConnection(url, user, password);
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int count = rs.getInt(1);
				System.out.println("Total number of employees in the company: " +count);
			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {
			try { con.close(); } catch(SQLException se) { }
			try { stmt.close(); } catch(SQLException se) { }
			try { rs.close(); } catch(SQLException se) { }
		}
	}
	
	public void insertRecord()
	{
		String query = "INSERT INTO db_world.emp (empid,empname,salary) \n" +
						"VALUE (109, 'Joswin', 4000);";
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con= DriverManager.getConnection(url, user, password);
			
			stmt = con.createStatement();
			
			int v = stmt.executeUpdate(query);
			if (v==1)
			{
				System.out.println("Record is inserted");
				
			}
			else
			{
				System.out.println("Not inserted");
			}
		}catch (SQLException sqlEx) {
			//sqlEx.printStackTrace();
		} finally {
			try { con.close(); } catch(SQLException se) { }
			try { stmt.close(); } catch(SQLException se) { }
			//try { rs.close(); } catch(SQLException se) { }
		}
	}
	
	public void updateRecord()
    {
    	String query = "UPDATE db_world.emp SET salary = 90000 WHERE empid in (108, 105)";
		 try {     	
		 	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		 	
		     // opening database connection to MySQL server
		     con = DriverManager.getConnection(url, user, password);
		
		     // getting Statement object to execute query
		     stmt = con.createStatement();
		
		     // executing SELECT query
		     stmt.executeUpdate(query);
		
		 } catch (SQLException sqlEx) {
		     sqlEx.printStackTrace();
		 } finally {
		     //close connection ,stmt and resultset here
		     try { con.close(); } catch(SQLException se) { /*can't do anything */ }
		     try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
		    //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
		 }
	  }
}
