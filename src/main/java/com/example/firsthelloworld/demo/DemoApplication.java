package com.example.firsthelloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RestController
	@RequestMapping("/")
	class HelloWorld{
		@GetMapping(value="print/{msg}")
		public String prints(@PathVariable() String msg){
				return "Hello world this is "+msg;
		}

	}


}
