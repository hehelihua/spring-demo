package com.example.springtestdemo.bill;

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

	@Override
	public List<BillType> queryBillTypeList() {
		return userMapper.queryBillTypeList();
	}

	@Override
	public List<Bill> queryBillList(Bill bill) {
		return userMapper.queryBillList(bill);
	}

}
