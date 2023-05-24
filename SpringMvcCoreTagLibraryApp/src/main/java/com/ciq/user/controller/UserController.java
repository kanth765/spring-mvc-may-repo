package com.ciq.user.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ciq.user.pojo.User;

@Controller
//@SessionAttributes("controller level")
public class UserController {

	@Autowired
	ServletContext servletContext;

	@GetMapping("/add")
	public String loadUser(@ModelAttribute User user, Model model, HttpSession session) throws IOException {
//		String error = "error";
//		if (error.equals("error")) {
//			throw new IOException();
//		}

		Map<String, String> roles = new HashMap<String, String>();
		roles.put("Admin", "admin");
		roles.put("DBA", "dba");
		roles.put("TL", "tech Lead");
		model.addAttribute("roles", roles);
		session.setAttribute("sa", "I'm a http session");
		servletContext.setAttribute("application", "context should be avaliabe at global level");
		return "userForm";
	}

	@PostMapping("/add")
	public String regUser(@Valid @ModelAttribute User user, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "userForm";
		}

//		attributes.addFlashAttribute("user", user);

		return "redirect:/userDetails";

	}

	@GetMapping("/userDetails")
	public String success() {
		return "details-user";

	}

}
