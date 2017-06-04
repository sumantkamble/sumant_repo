package com.sumant.service;

import com.sumant.model.Login;
import com.sumant.model.User;

public interface UserService {

	void register(User user);

	User validateUser(Login login);

}
