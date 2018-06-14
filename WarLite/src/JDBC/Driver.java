package JDBC;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		try{
			
			//Get connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/war?verifyServerCertificate=false","root", "pretinha31");
			
			//Create Statement
			Statement myStmt = myConn.createStatement();
			
			//Execute Query
			ResultSet myRs = myStmt.executeQuery("select * from jogador");
			
			//Process Results Set
			while (myRs.next()) {
				System.out.println(myRs.getString("email") + ", " +myRs.getString("nome"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
