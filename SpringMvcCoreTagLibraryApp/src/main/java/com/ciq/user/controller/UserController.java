package com.ciq.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ciq.user.pojo.User;

@Controller
public class UserController {

	@GetMapping("/add")
	public String loadUser(@ModelAttribute User user, Model model) {
		Map<String, String> roles = new HashMap<String, String>();
		roles.put("Admin", "admin");
		roles.put("DBA", "dba");
		roles.put("TL", "tech Lead");
		model.addAttribute("roles", roles);
		return "userForm";
	}

	@PostMapping("/add")
	public String regUser(@Valid
			@ModelAttribute User user, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "userForm";
		}
		attributes.addFlashAttribute("user", user);
		return "redirect:/userDetails";

	}

	@GetMapping("/userDetails")
	public String success() {
		return "details-user";

	}

}
