package com.test.springmvc.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hi(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", 2);
		mav.setViewName("home");
		return "home";
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public String bye(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return "hello";
	}
}
