package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {

	@RequestMapping("/AboutUs")
	public String showAboutUs() 
	{
		System.out.println("welcome");
	return "AboutUs";
	}
	@RequestMapping("/ContactUs")
	public String showContactUs() 
	{
	return "ContactUs";
	}
	@RequestMapping("/Register")
	public String showRegister() 
	{
	return "Register";
	}
	@RequestMapping("/Login")
	public String showLogin() 
	{
	return "Login";
	}
}
