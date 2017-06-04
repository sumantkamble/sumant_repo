package com.sumant.dao;

import com.sumant.model.Login;
import com.sumant.model.User;

public interface UserDao {
	
	void register(User user);

	User validateUser(Login login);
	
}