package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.lombokTest;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static ArrayList<lombokTest> tt = new ArrayList<lombokTest>();

	public static void main(String[] args) {
		tt.add(new lombokTest("조한제",30));
		tt.add(new lombokTest("고형균",33));
		tt.add(new lombokTest("노석수",31));
		tt.add(new lombokTest("이지우",24));
		
		SpringApplication.run(DemoApplication.class, args);
		}

		@GetMapping("/hello")
		public String hello() {
		return String.format("Hello %s!", "world");
		}
		
		@GetMapping("/lombokTest")
		public ArrayList<lombokTest> lombokTest() {
			return tt;
		}

}
