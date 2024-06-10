package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/webproject";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	private static DBconnection dbConnection;
	private Connection connection = null;

	private DBconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			if (connection != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found!");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
		}
	}

	public static DBconnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBconnection();
		}

		return dbConnection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Connection getConnection() {
		return connection;
	}

}
