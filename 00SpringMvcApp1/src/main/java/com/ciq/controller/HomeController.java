package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/hi")
	public String home() {
//		return "/WEB-INF/views/home.jsp";
		return "home";
	}

	@RequestMapping(value = "/about")
	public String about() {
//		return "/WEB-INF/views/about.jsp";
		return "about";
	}

}
