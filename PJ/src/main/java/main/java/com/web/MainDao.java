package main.java.com.web;

import org.springframework.stereotype.Repository;

@Repository
public class MainDao {
	
	public String select() {
		String test = "Hello World!";
		return test;
	}

}
