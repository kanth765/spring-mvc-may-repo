package com.ciq.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/application")
public class ApplicationScopeTest {

	@Autowired
	ServletContext servletContext;

	@GetMapping("/")
	public String setApplicationScopeTest() {
		servletContext.setAttribute("applicationName", "Model scoped Attributes");
		return "redirect:/application/display";
	}

	@GetMapping("/display")
	public String diplay() {
		return "applicationAttribute";
	}
}
