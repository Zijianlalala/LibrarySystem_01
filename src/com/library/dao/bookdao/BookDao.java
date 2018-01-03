package com.library.dao.bookdao;

import java.util.List;

import com.library.entity.Book;

public interface BookDao {
	public List<Book> findBook();
	public int insertBook(Book book);
	public int deleteBook(int id);
	public int updateBook(Book book);
}
