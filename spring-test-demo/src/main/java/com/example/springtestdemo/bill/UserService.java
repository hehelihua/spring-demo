package com.example.springtestdemo.bill;

import java.util.List;

public interface UserService {
	
	public List<User> queryUserList();

	public List<BillType> queryBillTypeList();
	
	public List<Bill> queryBillList(Bill bill);
}
