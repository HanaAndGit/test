package com.hana.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hana.test.dao.UserDAO;
import com.hana.test.domain.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;
	
	public User getUserById(String userid) throws Exception { 
		return userDao.getUserById(userid);
	}
	
	public void addUser(User user) throws Exception { 
		userDao.addUser(user);
	}
	
	public int getUserCnt() throws Exception { 
		return userDao.getUserCnt();
	}
}

