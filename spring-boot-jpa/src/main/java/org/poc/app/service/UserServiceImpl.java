package org.poc.app.service;

import java.util.List;

import org.poc.app.dao.UserDao;
import org.poc.app.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<Users> getAllUsers() {
		return userDao.getAllUsers();
	}

}
