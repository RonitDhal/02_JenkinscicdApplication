package com.cicd2.jenkinscicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinscicdApplicationTests {

	static Logger logger = Logger.getLogger(String.valueOf(JenkinscicdApplicationTests.class));

	@Test
	 void contextLoads() {
		logger.info("test case executing");
		
		assertEquals(true,true);
	}

}
