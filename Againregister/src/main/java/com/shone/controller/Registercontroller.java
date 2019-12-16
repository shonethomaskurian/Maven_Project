package com.shone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Registercontroller {
	@RequestMapping(value="/")
	public String index() {
		return "index";
		}
	@RequestMapping(value="/login")
	public String login() {
		return "login";
		}
	@RequestMapping(value="/welcome")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response)
	{
	String username = request.getParameter("t1");
	String password = request.getParameter("t2");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("username", username);
	return mv;
	}
	@RequestMapping(value="/register")
	public String register() {
		return "register";
		}
}
