package com.library.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.library.dao.userdao.UserDao;
import com.library.dao.userdao.UserDaoImpl;
import com.library.entity.User;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace(value="/")
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	//获得request对象 用于传给jsp错误信息msg
	private HttpServletRequest request = ServletActionContext.getRequest();
	private User user;
	private UserDao dao = new UserDaoImpl();
	
	@Action(//登录，验证用户名和密码
		value="checkUser",
		results = {
				@Result(name="success",location="/WEB-INF/jsp/welcome.jsp",type="dispatcher"),
				@Result(name="failure",location="/login.jsp",type="dispatcher")
		}
	)
	public String checkUser() throws Exception{
		String forward = "failure";
		int n = dao.checkUser(user);
		if(n == 1) {
			forward = "success";
			request.getSession().setAttribute("user", user.getUsername());
		}
		request.setAttribute("LoginMsg", "用户名或密码或权限错误");
		return forward;
	}
	
	@Action(//用户注册
			value="registerUser",
			results = {
					@Result(name="success",location="/login.jsp",type="dispatcher"),
					@Result(name="failure",location="/register.jsp",type="dispatcher")
			}
		)
	public String registerUser() throws Exception{
		String forward = "failure";
		System.out.println(user);
		int n = dao.checkUser(user);
		if (n == 1) {
			forward = "success";
			request.setAttribute("LoginMsg", "注册成功，请登录");
		}            
		System.out.println(forward);
		request.setAttribute("RegisterMsg", "注册失败，该用户已注册");
		return forward;
	}
	//setter&getter method
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
