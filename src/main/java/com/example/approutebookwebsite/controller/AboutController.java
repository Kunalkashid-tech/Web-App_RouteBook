package com.example.approutebookwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
	
	@GetMapping("/about")
	public String about() {
		System.out.println("Welcome in about.html controller");
		return "html/about";
	}
	

}
