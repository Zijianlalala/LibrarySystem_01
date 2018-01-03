package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private static String driverName = JDBCProperties.getValue("jdbc.driverClass");
	private static String dbname = JDBCProperties.getValue("jdbc.dbname");
	private static String username = JDBCProperties.getValue("jdbc.username");
	private static String password = JDBCProperties.getValue("jdbc.password");
	private static String encoding = JDBCProperties.getValue("jdbc.encoding");
	private static String url = dbname + "?user=" + username + "&password=" 
			+ password + "&" + encoding;
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeDB(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(ps!=null)
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
