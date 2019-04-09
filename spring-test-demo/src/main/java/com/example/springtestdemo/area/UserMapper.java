package com.example.springtestdemo.area;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("SELECT u.`test_id` testId,u.`test_no` testNo,u.`test_name` testName FROM t_user u ")
	public List<User> queryUserList();
}
