package com.sumant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumant.dao.UserDao;
import com.sumant.model.Login;
import com.sumant.model.User;
import com.sumant.service.UserService;

@Service ("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
