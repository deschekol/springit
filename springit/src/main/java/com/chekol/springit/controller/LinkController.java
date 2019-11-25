package com.chekol.springit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.chekol.springit.domain.Link;
import com.chekol.springit.repositary.LinkRepository;

@Controller
public class LinkController {
		
	@GetMapping("/foo")
	public String foo(Model model) {
		model.addAttribute("pageTitle","This page is FOO!");
		return "foo";
	}

}