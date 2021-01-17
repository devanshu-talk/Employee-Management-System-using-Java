package com.devtalk;

import java.sql.*;

public class conn {

	public Connection c;
	public Statement s;
	
	public conn() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///ems", "root", "");
			s = c.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
