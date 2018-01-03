package com.library.test;

import java.util.List;

import com.library.dao.bookdao.BookDao;
import com.library.dao.bookdao.BookDaoImpl;
import com.library.dao.userdao.UserDao;
import com.library.dao.userdao.UserDaoImpl;
import com.library.entity.Book;
import com.library.entity.User;

public class Test {
	//用来测试DAO能否正常操作数据库
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao dao = new BookDaoImpl();
		Book book = new Book();
		book.setName("Head First JAVA");
		book.setAuthor("Unknown");
		book.setPrice(89.5f);
		book.setOthers("计算机科学与技术");
		int n = dao.insertBook(book);
		System.out.println(n==1?"插入成功":"插入失败");
	}

}
