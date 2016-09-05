package com.atos.database;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.timesten.jdbc.TimesTenDataSource;

public class ConnectionTest {

	@Test
	public void ConnectionTest_IsAbleToConnect() throws SQLException{
		String URL = "jdbc:timesten:direct:dsn=kimtt;LockLevel=1";
		TimesTenDataSource ds = new TimesTenDataSource();
		ds.setUrl(URL);
		Connection con = ds.getConnection();
		System.out.println("Get tt con" + con.isClosed());
	}
}
