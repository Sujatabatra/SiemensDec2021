package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@RequestMapping("/my")
	public ModelAndView myFirstController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("myview");
		mv.addObject("message", "Welcome to the world of Spring");
		return mv;
	}
}
