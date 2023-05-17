package com.ciq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/msg")
	public String loadMessage() {
		return "message";
	}

//	http://localhost:8080/00SpringMvcApp1/home/msg/message?msg=Ram
//	http://localhost:8080/00SpringMvcApp1/home/msg/message?name=anil
	@RequestMapping(value = "/msg/message", method = RequestMethod.GET)
	public String executeMsg(@RequestParam(name = "name") String name) {
		System.out.println("welcome to parameter reading..." + name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(name, "name");
		return "welcome";
	}

//	http://localhost:8080/00SpringMvcApp1/home/load/anil
	@RequestMapping(value = "/load/{name}", method = RequestMethod.GET)
	public String readMsg(@PathVariable String name) {
		System.out.println("welcome to parameter reading..." + name);
		return "about";
	}

}
