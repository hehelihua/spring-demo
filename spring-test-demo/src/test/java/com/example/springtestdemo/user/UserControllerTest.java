package com.example.springtestdemo.user;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.testng.annotations.Test;

import com.example.springtestdemo.BaseTest;

public class UserControllerTest extends BaseTest {

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/queryUser")).andDo(MockMvcResultHandlers.print())
				.andReturn();
	}

}
