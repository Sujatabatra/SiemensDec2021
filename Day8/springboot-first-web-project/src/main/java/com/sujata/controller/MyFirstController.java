package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	//Mapping Handler
	@RequestMapping("/first")
	public ModelAndView myFirstController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("myview");
		mv.addObject("message", "Welcome to the world of Spring from First Controller");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("myview");
		mv.addObject("message", "Welcome to the world of Spring from Second Controller!");
		return mv;
	}
}
