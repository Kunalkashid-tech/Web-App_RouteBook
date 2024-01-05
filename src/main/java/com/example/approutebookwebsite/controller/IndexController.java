package com.example.approutebookwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/html")
	public String html() {
		System.out.println("Welcome in index.html controller");
		return "html/index.html";
	}
	
	
}
