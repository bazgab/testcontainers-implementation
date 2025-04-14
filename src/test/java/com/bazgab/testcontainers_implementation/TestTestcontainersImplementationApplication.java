package com.bazgab.testcontainers_implementation;

import org.springframework.boot.SpringApplication;

public class TestTestcontainersImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestcontainersImplementationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
