package data.provider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class DataProvider {

	protected Connection connection;

	public boolean setupDBConnection(String url, String user, String pass) {
		boolean success = true;
		try {
			connection = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			success = false;
			e.printStackTrace();
		}
		return success;
	}
	
	protected boolean connectionSet(){
		return connection != null;
	}

	protected boolean executeQuery(PreparedStatement statement,
			List<String> arguments) throws SQLException {
		boolean success = true;
		fillPreparedStatment(statement, arguments);
		statement.executeUpdate();
		return success;
	}

	private void fillPreparedStatment(PreparedStatement statement,
			List<String> arguments) throws SQLException {
		for (int i = 0; i < arguments.size(); i++) {
			statement.setString(i, arguments.get(i));
		}
	}

	protected ResultSet executeQuery(String query) throws SQLException {
		Statement statement = connection.createStatement();
		return statement.executeQuery(query);
	}

	abstract void load() throws Exception;
}
