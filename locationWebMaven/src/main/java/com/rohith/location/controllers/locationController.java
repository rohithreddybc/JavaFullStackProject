package com.rohith.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class locationController {
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
	@GetMapping("/showCreate")
	public String showCreate() {
		return "createLocation"; //jsp file name
	}
}
