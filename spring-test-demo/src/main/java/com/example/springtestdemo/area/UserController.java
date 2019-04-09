package com.example.springtestdemo.area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/queryUser")
	public List<User> queryUser() {
		List<User> list=userService.queryUserList(); 
		return list;
	}
}
