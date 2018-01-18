package com.yss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yss.dao.UserDao;
import com.yss.pojo.User;
import com.yss.service.inter.UserServiceInf;

@Service
public class UserService implements UserServiceInf {
	@Autowired
	private UserDao userdao;

	@Override
	public User getUserNameById(String id) {
		Object ob= userdao.getUserNameById("1");
       return  (User)ob;
	}

	@Override
	public void insertUser(User user) {
		userdao.insertUser(user);
		
	}

}
