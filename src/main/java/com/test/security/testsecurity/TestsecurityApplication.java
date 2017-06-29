package com.test.security.testsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {

})
public class TestsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestsecurityApplication.class, args);
	}
}
