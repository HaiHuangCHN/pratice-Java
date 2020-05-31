package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PraticePreparedStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook", "root", "123456");
		System.out.println("Database connected");
		
		String queryString = "select firstName, mi, lastName from Student where ssn = ? and lastName = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(queryString);
		
	}

}
