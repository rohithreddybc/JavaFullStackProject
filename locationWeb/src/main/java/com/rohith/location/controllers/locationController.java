package com.rohith.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class locationController {
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation"; //jsp file name
	}
}
