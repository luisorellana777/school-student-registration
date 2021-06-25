package com.student.studentregistration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentRegistrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
