package com.yss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yss.pojo.User;
import com.yss.service.UserService;

@RestController
@RequestMapping("/login")
public class Login {

	@Autowired
	private UserService userService;
     
	@ResponseBody
	@RequestMapping("/getUserNameById")
	public User getUserNameById() {

		return userService.getUserNameById("23");
	}
	
	@ResponseBody
	@RequestMapping("/insertUser")
	public void insertUser() {
		User user=new User();
		user.setAddress("南京");
		user.setAge("18");
		user.setId("1");
		user.setName("yang");
		userService.insertUser(user);
	}

}
