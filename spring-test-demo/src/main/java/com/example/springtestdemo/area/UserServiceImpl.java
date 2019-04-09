package com.example.springtestdemo.area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> queryUserList() {
		return userMapper.queryUserList();
	}

}
