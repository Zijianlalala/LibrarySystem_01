package com.library.dao.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.library.entity.User;
import com.library.util.DBConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public int checkUser(User user) {
		Connection conn = DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from users where username=? and password=? and priority=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getPriority());
			rs = ps.executeQuery();
			if(rs.next()) {
				//确实有该用户且密码正确
				return 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBConnection.closeDB(conn, ps, rs);
		}
		//用户名或密码或权限错误
		return 0;
	}

	@Override
	public int insertUser(User user) {
		Connection conn = DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into users (username,password) values(?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			int n = ps.executeUpdate();
			//插入成功
			if (n == 1) {
				return 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBConnection.closeDB(conn, ps, rs);
		}
		//插入失败,该用户已注册
		return 0;
	}

}
