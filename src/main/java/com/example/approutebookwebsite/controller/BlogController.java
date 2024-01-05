package com.example.approutebookwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
	
	@GetMapping("/blog")
	public String blog() {
		System.out.println("Welcome in blog.html controller");
		return "html/blog";
	}
	

}






	
	

