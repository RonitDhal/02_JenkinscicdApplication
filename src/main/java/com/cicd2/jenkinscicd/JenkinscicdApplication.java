package com.cicd2.jenkinscicd;



import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinscicdApplication {
	static Logger logger = Logger.getLogger(String.valueOf(JenkinscicdApplication.class));

	@PostConstruct
	public  void init(){
		logger.info("application started");
	}

	public static void main(String[] args) {


		logger.info("application started");



		SpringApplication.run(JenkinscicdApplication.class, args);

       System.out.println("application");


	}

}
