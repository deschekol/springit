package com.chekol.springit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller

public class HomeController {
	
	@GetMapping("/link")
	public String home(Model model) {
		model.addAttribute("title", "Hello Thymleaf");
		return "home";
	}

}
