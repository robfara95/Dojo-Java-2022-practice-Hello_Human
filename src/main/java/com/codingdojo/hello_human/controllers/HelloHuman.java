package com.codingdojo.hello_human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("")
	public String helloHuman(@RequestParam(value="name", required=false) String searchName) {
		if (searchName == null) {
			searchName = "Human";
		}
		return String.format("Hello %s", searchName);
	}
	
//	@RequestMapping("/")
//	public String helloFirstLastName(@RequestParam(value="name", required=false) String searchName,
//			@RequestParam(value="last_name", required=false) String searchLastName) {
//		if (searchName == null) {
//			searchName = "First Name";
//		}
//		if (searchLastName == null) {
//			searchLastName = "Last Name";
//		}	
//		return String.format("Hello %s %s", searchName, searchLastName);
//	}
	
//	@RequestMapping("/")
//	public String helloTimesName(@RequestParam(value="name") String searchName,
//			@RequestParam(value="times") int times) {
//		String outString = "Hello " + searchName + " ";
//
//		return String.format("%s", outString.repeat(3));
//	}
	
}
