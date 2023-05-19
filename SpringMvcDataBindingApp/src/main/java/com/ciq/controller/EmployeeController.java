package com.ciq.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Employee;

@Controller
public class EmployeeController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "mobileNumber" });
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(formatter, false));
	}

	// creating handler method to load the register form

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegForm() {
		return "reg-emp";
	}

	@ModelAttribute
	public void addAllmodels(Model model, Employee employee) {
//		model.addAttribute("employee1", employee);
		model.addAttribute("messages", "welcome to model addtributes");
	}

	
	@RequestMapping(value = "register", method = RequestMethod.POST)
//	@ModelAttribute("employee1")

	public ModelAndView registerEmployee(@ModelAttribute("employee1") Employee employee, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("reg-emp");
		}

		ModelAndView modelAndView = new ModelAndView("reg-success");
//		modelAndView.addObject("employee1", employee);
		return modelAndView;
	}
//	public ModelAndView registerEmployee(
//			@RequestParam int id,
//			@RequestParam String name,
//			@RequestParam double salary,
//			@RequestParam long mobileNumber,
//			@RequestParam String dob
//			
//			) throws ParseException {
//		Employee employee=new Employee();
//		employee.setId(id);
//		employee.setName(name);
//		employee.setSalary(salary);
//		employee.setMobileNumber(mobileNumber);
//		SimpleDateFormat formatter=new SimpleDateFormat("yyyy/mm/dd");
//		Date parse = formatter.parse(dob);
//		employee.setDob(parse);
//		System.out.println(employee);
//		ModelAndView modelAndView = new ModelAndView("reg-success");
//		modelAndView.addObject("employee1", employee);
//		return modelAndView;
//
//	}

	
}
