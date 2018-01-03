package com.library.dao.bookdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.entity.Book;
import com.library.util.DBConnection;

public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> findBook() {
		Connection conn = DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>(); 
		String sql = "select * from books";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//确实有该用户且密码正确
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setOthers(rs.getString("others"));
				list.add(book);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBConnection.closeDB(conn, ps, rs);
		}
		//用户名或密码或权限错误
		
		return list;
	}

	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into books (name,author,price,others) values(?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setFloat(3, book.getPrice());
			ps.setString(4, book.getOthers());
			int n = ps.executeUpdate();
			if(n==1) return 1;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBConnection.closeDB(conn, ps, rs);
		}
		return 0;
	}

}
