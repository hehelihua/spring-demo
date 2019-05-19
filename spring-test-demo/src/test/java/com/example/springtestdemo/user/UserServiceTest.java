package com.example.springtestdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.example.springtestdemo.BaseTest;
import com.example.springtestdemo.bill.UserService;

public class UserServiceTest extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		System.out.println(userService.queryUserList().size());
	}
}
