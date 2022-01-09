package com.example.dummydeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DummydeployApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DummydeployApplication.class, args);
	}

}
