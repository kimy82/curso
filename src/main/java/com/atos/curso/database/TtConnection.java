package com.atos.curso.database;

import java.sql.Connection;
import java.sql.SQLException;

import com.timesten.jdbc.TimesTenDataSource;

public class TtConnection {

	private static TtConnection ttConnection;
	private static String DB_URL = "jdbc:timesten:direct:dsn=kimtt;LockLevel=1";
	private Connection connection;
	
	public static TtConnection getInstance() {
		if(ttConnection == null){
			ttConnection = new TtConnection();
		}
		return ttConnection;
	}
	
	private TtConnection() {
		TimesTenDataSource ds = new TimesTenDataSource();
		ds.setUrl(DB_URL);
		try {
			this.connection = ds.getConnection();
			this.connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO LOG ERROR
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
