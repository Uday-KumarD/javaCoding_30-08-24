package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name :");
		String uname = sc.next();
		System.out.println("Enter Password :");
		String pwd = sc.next();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept","root","100502");
		
		PreparedStatement psmt = conn.prepareStatement("select * from login where username=? and password=?");
		
		psmt.setString(1, uname);
		psmt.setString(2, pwd);
		
		ResultSet result = psmt.executeQuery();
		if(result.next()) {
			System.out.println("login success");
		}else {
			System.out.println("login denied");
		}
		
		conn.close();
		
	}
}
