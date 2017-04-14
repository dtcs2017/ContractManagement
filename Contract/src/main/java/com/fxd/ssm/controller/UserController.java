package com.fxd.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fxd.ssm.base.BaseController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@RequestMapping("/toAddUser")
	public ModelAndView createUser(){
		return new ModelAndView("user/add_user");
	}
}
