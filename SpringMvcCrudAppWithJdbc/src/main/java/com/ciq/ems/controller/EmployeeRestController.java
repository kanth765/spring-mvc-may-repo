package com.ciq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

//@Controller
@RestController
@RequestMapping("/rest")
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

//	@ResponseBody
	@RequestMapping(value = "/hl", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
	public String hello() {
		return "hello, welcome to rest service programming!!!";
	}

	@RequestMapping(value = "/getAllEmps", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getRestEmps() {
		return employeeServiceImpl.getAllEmployees();
	}

}
