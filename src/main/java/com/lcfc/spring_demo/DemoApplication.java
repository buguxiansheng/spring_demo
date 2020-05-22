package com.lcfc.spring_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lcfc.spring_demo.mapper")
@SpringBootApplication

// @MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")

public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
