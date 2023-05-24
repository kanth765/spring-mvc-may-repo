package com.ciq.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/session")
@SessionAttributes({ "channelName", "hello" })
public class SessionController {

	@GetMapping("/")
	public String setSessionAttribute(Model model, HttpSession session) {
		model.addAttribute("channelName", "srikanth");
		session.setAttribute("author", "srk");
		model.addAttribute("hello", "world");
		session.setAttribute("channelName", "Thankyou......");
//		session.removeAttribute("author"); it removes the author bcz @session attribute annotations
		return "redirect:/session/display";

	}

	@RequestMapping(value = "/display")
	public String display(SessionStatus sessionStatus) {
		// only remove attributes set by using @SessionAttributes
		sessionStatus.setComplete();
		return "details-session";
	}
}
