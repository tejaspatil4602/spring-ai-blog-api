package com.tejas.blog;

import org.springframework.boot.SpringApplication;

public class TestSpringAiBlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAiBlogApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
