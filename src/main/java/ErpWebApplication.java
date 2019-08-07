package com.zjiec.erp.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//org.activiti.spring.boot.SecurityAutoConfiguration.class,
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableTransactionManagement
@MapperScan(basePackages = "com.zjiec.erp.web.dao")
@ComponentScan({ "com.zjiec.erp.web.controller", "com.zjiec.erp.web.service", "com.zjiec.erp.web.config" })
public class ErpWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ErpWebApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(ErpWebApplication.class, args);

	}
}
