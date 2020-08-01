package com.hana.test.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hana.test.dao.UserDAO;
import com.hana.test.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final String namespace ="mappers.UserMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(String userid) throws Exception {
		return sqlSession.selectOne(namespace + "getUserById", userid);
	}

	@Override
	public void addUser(User user) throws Exception {
		sqlSession.insert(namespace+"addUser", user);
	}

	@Override
	public int getUserCnt() throws Exception {
		return sqlSession.selectOne(namespace + "getUserCnt");
	}

}
