package com.example.springtestdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.example.springtestdemo.BaseTest;
import com.example.springtestdemo.area.UserMapper;

public class UserMapperTest extends BaseTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test() {
		System.out.println("size="+userMapper.queryUserList().size());
	}
}
