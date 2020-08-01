package com.hana.test.dao;

import java.util.List;

import com.hana.test.domain.User;

public interface UserDAO {
	
	public List<User> getUserList() throws Exception;
	
	public User getUserById(String id) throws Exception;
	
	public void addUser(User user) throws Exception;
	
	public int getUserCnt() throws Exception;
}
