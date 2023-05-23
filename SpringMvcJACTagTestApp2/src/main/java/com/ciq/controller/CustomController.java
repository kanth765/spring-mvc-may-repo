package com.ciq.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ciq.pojo.Country;
import com.ciq.pojo.Customer;
import com.ciq.pojo.Phone;

@Controller
public class CustomController {

//	@RequestMapping(value = "/saveCustomer", method = RequestMethod.GET)
//	public String load(@ModelAttribute Customer customer) {
//		return "customerForm";
//	}
//	OR
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.GET)
	public String load(@ModelAttribute Customer customer, Model model) {
//	1. list
//		List<String> countryList = Arrays.asList("United states", "India", "Russia");
//		model.addAttribute("countryList", countryList);

//		2.  map 

//		Map<String, String> map = new HashMap<>();
//		map.put("US", "United States");
//		map.put("IND", "India");
//		map.put("RS", "Russia");
//		model.addAttribute("myMap", map);

//		3.country
		List<Country> countryList = Arrays.asList(new Country("US", "United states"), new Country("IND", "India"),
				new Country("RS", "Russia"));
		model.addAttribute("country", countryList);
		return "customerForm";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(Customer customer) {
		return "details-customer";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editForm(Model model) {
		Phone phone = new Phone("91", "2345", "23667");
		Customer customer = new Customer(1, "ram", "ragav", phone);
		model.addAttribute("customer", customer);
		return "edit-customer";
	}

}
