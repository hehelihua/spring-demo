package com.example.springtestdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = {SpringTestDemoApplicationTests.class})
@AutoConfigureMockMvc
public class BaseTest extends AbstractTestNGSpringContextTests{
	@Autowired
	protected MockMvc mockMvc;
}
