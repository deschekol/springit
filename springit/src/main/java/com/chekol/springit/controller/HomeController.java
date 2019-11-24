package com.chekol.springit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model, HttpServletRequest request) {
		model.addAttribute("message", "Hellow World");
		return "index";
	}

}
