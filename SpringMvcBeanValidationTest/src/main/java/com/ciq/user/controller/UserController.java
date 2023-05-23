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

import com.ciq.user.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/add")
	public String getUserForm(@ModelAttribute User user, Model model) {
		Map<String, String> roleMap = new HashMap<String, String>();
		roleMap.put("Admin", "Admin");
		roleMap.put("DBA", "DBA");
//		roleMap.put("Male", "Male");
//		roleMap.put("Female", "Female");
		model.addAttribute("roles", roleMap);
		return "userForm";
	}

	@PostMapping("/add")
	public String saveUser(@Valid @ModelAttribute User user, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "userForm";
		}

		attributes.addFlashAttribute("savedUser", user);
		// used add attribute in session temporarly...
		// after success page is rendered it saved user is removed from the session
		// but in success it is avalaibe
		return "redirect:/users/userDetails";

	}

	@GetMapping("/userDetails")
	public String success() {
		return "success";
	}

}
