package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class sampleHelloWorld {
	
	
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloworld() {
		
		String message = null;
		return new ModelAndView("welcome", "message", message);
	}
	@RequestMapping("/Login")
	public ModelAndView login() {
		String msg = "<br><div style='text-align:center;'><form><br>Username:<input type='text' name='uname'>"
				+ "<br>Password: <input type='password' name='pwd'><br><input type='submit'></form></div>";
		return new ModelAndView("Login", "message", msg);
	}
	

}
