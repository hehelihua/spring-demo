package com.example.springtestdemo;

import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.springtestdemo.*"})
public class SpringTestDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("contextLoads==");
	}

}
