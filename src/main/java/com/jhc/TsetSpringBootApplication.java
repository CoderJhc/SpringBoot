package com.jhc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jhc.dao")
public class TsetSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(TsetSpringBootApplication.class, args);
	}
}
