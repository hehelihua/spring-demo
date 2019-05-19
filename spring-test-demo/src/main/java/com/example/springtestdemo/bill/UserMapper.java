package com.example.springtestdemo.bill;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Select("SELECT u.`id`,u.`cellphone`,u.`real_name` realName,u.`create_time` createTime FROM h_user u")
	public List<User> queryUserList();
	
	@Select("SELECT t.id,t.`type_code` typeCode,t.`type_name` typeName FROM h_bill_type t")
	public List<BillType> queryBillTypeList();
	
	@Select("SELECT b.`id`,b.`user_id` userId,u.`cellphone`,u.`real_name` realName,b.`type_code` typeCode,t.`type_name` typeName,  " + 
			"b.`amount`,b.`remark`,DATE_FORMAT(b.`bill_time`,'%Y-%m-%d')  billTime,b.`create_time` createTime  " + 
			"FROM h_bill b  " + 
			"LEFT JOIN h_user u ON b.`user_id`=u.`id`  " + 
			"LEFT JOIN h_bill_type t ON b.`type_code`=t.`type_code`  " + 
			"ORDER BY b.`bill_time` ")
	public List<Bill> queryBillList(Bill bill);
}
