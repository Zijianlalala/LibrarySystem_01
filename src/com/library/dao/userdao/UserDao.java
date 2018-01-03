package com.library.dao.userdao;

import com.library.entity.User;

public interface UserDao {
	public int checkUser(User user); 
	public int insertUser(User user);
}
