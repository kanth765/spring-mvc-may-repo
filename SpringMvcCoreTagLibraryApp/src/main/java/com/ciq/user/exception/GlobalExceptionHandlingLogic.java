package com.ciq.user.exception;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ciq.user.controller.UserNotFoundExHand;

@ControllerAdvice
public class GlobalExceptionHandlingLogic {

	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerHandling() {
		return "NullPointerException";
	}

	@ExceptionHandler(value = IOException.class)
	public String IoHandling() {
		return "IoExceptionView";
	}

	@ExceptionHandler(value = UserNotFoundExHand.class)
	public String userNotFound() {
		return "UserNotFoundException";
	}

}
