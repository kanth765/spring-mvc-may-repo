package com.ciq.pojo;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class PhoneFormatterEditor implements Formatter<Phone> {

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		String[] temp = text.split("-");
		Phone phone = new Phone();
		phone.setAreaCode(temp[0]);
		phone.setPrefix(temp[1]);
		phone.setNumber(temp[2]);
		System.out.println("Inside PhoneFormatter parse method: ");
		System.out.println(phone);
		return phone;
	}

	@Override
	public String print(Phone phone, Locale locale) {
//		String displayPhoneJsp = phone.getAreaCode() + "&&" + phone.getPrefix() + "**" + phone.getNumber();
//		System.out.println("Inside PhoneFormatter parse method: ");
//		System.out.println("displayPhoneJsp: " + displayPhoneJsp);
//		return displayPhoneJsp;
		return null;
	}

}
