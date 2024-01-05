package com.example.approutebookwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	
	@GetMapping("/contact")
	public String contact() {
		System.out.println("Welcome in contact.html controller");
		return "html/contact";
	}
	

}
