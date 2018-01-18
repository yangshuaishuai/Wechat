package com.yss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration 
@ComponentScan
@ServletComponentScan 
public class App {
		
	public static void main(String[] args) {
		 SpringApplication.run(App.class, args);

	}

}
