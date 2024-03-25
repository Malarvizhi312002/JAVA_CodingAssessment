package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn;

	public static Connection getDBConn() {
		String usernameDb = "root";
		String passwordDb = "";
		String urlDb = "jdbc:mysql://localhost:3306/career_hub";
		String driverName = "com.mysql.jdbc.Driver";

		
		try {
			Class.forName(driverName);
			// System.out.println("Driver loaded successfully..");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver could not be loaded");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(urlDb, usernameDb, passwordDb);
			// System.out.println("Connection established..");
		} catch (SQLException e) {
			System.out.println("Connection could not be established");
			e.printStackTrace();
		}

		return conn;
	}

	public static void dbClose() {
		try {
			conn.close();
			// System.out.println("Connection closed..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
