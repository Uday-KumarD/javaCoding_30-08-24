package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int inid = 458;
		String name = "capgemini";
		String add = "Mumbai";
		
		//1.loading the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//2.get the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept","root","100502");
		//3.create the e statement
		PreparedStatement psmt = conn.prepareStatement("insert into institute values(?,?,?)");
		//4.execute the statement
		psmt.setInt(1,inid);
		psmt.setString(2, name);
		psmt.setString(3, add);
		
		int result = psmt.executeUpdate();
		//5.close the connection
		conn.close();
		System.out.println("record inserted :"+result);
	}
}
