package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//		// Load the JDBC driver
//		Class.forName("com.mysql.jdbc.Driver");
//		/*
//		 * Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
//		 * The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
//		 */
//		System.out.println("Driver loaded");

		// Connect to a database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook", "root", "123456");
		System.out.println("Database connected");

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute a statement
		ResultSet resultSet = statement
				.executeQuery("select firstName, mi, lastName from Student");
		

		// Iterate through the result and print the student names
		while (resultSet.next()) {

			System.out.println(resultSet.getString("firstName") + "\t" + resultSet.getString("mi") + "\t" + resultSet.getString("lastname"));

		}

		// Close the connection
		connection.close();
	}

}
