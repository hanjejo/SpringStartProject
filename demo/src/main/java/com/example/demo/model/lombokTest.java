package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class lombokTest {
	private String Name;
	private int Age;
	
	public lombokTest()
	{
		Name = "Test";
		Age = 30;
	}
	
	public lombokTest(String name, int age)
	{
		Name = name;
		Age = age;
	}
}
