package com.ciq.ems.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

//	@RequestMapping
	@GetMapping(value = { "/", "/save" })
	public String loadEmp() {
		return "emp-save";
	}

//	@RequestMapping(value = "/save" ,method = RequestMethod.POST)
	@PostMapping(value = "/save")
	public ModelAndView saveEmp(@ModelAttribute Employee employee, BindingResult result) {

//		if (result.hasErrors()) {
//			return new ModelAndView("emp-save");
//		}
		ModelAndView modelAndView = new ModelAndView();
		employeeServiceImpl.save(employee);
		System.out.println(employee);
		modelAndView.setViewName("redirect:/listEmps");
		return modelAndView;

	}

//	@GetMapping(value = "/home")
//	public String home() {
//		return "home";
//	}

	@RequestMapping(value = "/listEmps", method = RequestMethod.GET)
	public ModelAndView getAllEmps() throws IOException {
		return new ModelAndView("emp-list", "emps", employeeServiceImpl.getAllEmployees());
	}

//	updateEmp
	@GetMapping("/updateEmp")
	public ModelAndView update(@RequestParam("id") int id, Employee employee) {
		employee = employeeServiceImpl.getById(id);
		ModelAndView modelAndView = new ModelAndView("emp-update");
		modelAndView.addObject(employee);
		return modelAndView;
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("employee") Employee employee) {
		employeeServiceImpl.update(employee);
		return "redirect:/listEmps";
	}
	
	
	@GetMapping("/deleteEmp")
	public String delete(int id) {
		employeeServiceImpl.delete(id);
		return "redirect:/listEmps";
	}

}
