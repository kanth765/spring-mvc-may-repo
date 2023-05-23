package com.ciq.controller;

import java.beans.PropertyEditorSupport;

import org.springframework.core.env.PropertiesPropertySource;

public class CustomeNameBinder extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {

		if (name.equals("Mr.") || name.equals("Ms.")) {
			setValue(name);
		} else {
			name = "Ms." + name;
			setValue(name);
		}
	}

}
