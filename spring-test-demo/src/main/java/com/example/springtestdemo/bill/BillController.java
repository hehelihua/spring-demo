package com.example.springtestdemo.bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BillController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/user")
	public String user(Model model) {
		List<User> userList=userService.queryUserList(); 
		model.addAttribute("userList", userList);
		return "user";
	}

	@RequestMapping("/bill/type")
	public String billType(Model model) {
		List<BillType> typeList=userService.queryBillTypeList();
		model.addAttribute("typeList", typeList);
		return "bill_type";
	}

	@RequestMapping("/bill/list")
	public String bill(Model model,Bill bill) {
		List<Bill> billList=userService.queryBillList(bill); 
		model.addAttribute("billList", billList);
		return "bill_list";
	}
}
