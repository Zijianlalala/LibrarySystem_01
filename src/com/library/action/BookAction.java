package com.library.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.library.dao.bookdao.BookDao;
import com.library.dao.bookdao.BookDaoImpl;
import com.library.entity.Book;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace(value="/")
public class BookAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private HttpServletRequest request = ServletActionContext.getRequest();
	private Book book;
	private int id;
	private BookDao dao = new BookDaoImpl();
	
	@Action(//查询所有图书
			value="findBook",
			results = {
					@Result(name="success",location="/WEB-INF/jsp/findBook.jsp",type="dispatcher")
			}
		)
	public String findBook() throws Exception{
			String forward = "success";
			List<Book> list = dao.findBook();
//			System.out.println(list);
			request.setAttribute("books", list);
			return forward;
	}
	
	@Action(//跳转到增加图书页面
			value="toAddBook",
			results = {
					@Result(name="success",location="/WEB-INF/jsp/addBook.jsp",type="dispatcher")
			}
		)
	public String toAddBook() {
		return "success";
	}
	
	@Action(//添加图书
			value="addBook",
			results = {
					@Result(name="success",location="findBook",type="chain"),
					@Result(name="failure",location="/WEB-INF/jsp/addBook.jsp",type="dispatcher")
			}
		)
	public String addBook() {
//		System.out.println("跳转到BookAction.addBook啦");
//		System.out.println(book);
		String forward = "failure";
		int n = dao.insertBook(book);
		if(n == 1) forward = "success";
		else {
			request.setAttribute("addMsg", "添加图书失败");
		}	
		return forward;
	}
	
	@Action(//删除图书
			value="deleteBook",
			results = {
					@Result(name="success",location="findBook",type="chain")
			}
		)
	public String deleteBook() {
		String forward = "failure";
//		System.out.println("跳转到BookAction.deleteBook中啦!");
		int n = dao.deleteBook(id);
		if(n == 1) forward = "success";
		else {
			request.setAttribute("deleteMsg", "删除操作失败");
		}
		
		return forward;
	}
	
	
	@Action(//跳转到增加图书页面
			value="toUpdateBook",
			results = {
					@Result(name="success",location="/WEB-INF/jsp/updateBook.jsp",type="dispatcher")
			}
		)
	public String toUpdateBook() {
		return "success";
	}
	@Action(//更新图书信息
			value="updateBook",
			results = {
					@Result(name="success",location="findBook",type="chain")
					}
		)
	public String updateBook() {
		String forward = "success";
		int n = dao.updateBook(book);
		if (n == 1) {
			//修改成功
		}
		return forward;
	}
	
	
	
	//setter&getter method
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
