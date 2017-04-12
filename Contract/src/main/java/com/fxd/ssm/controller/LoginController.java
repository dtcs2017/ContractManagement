package com.fxd.ssm.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fxd.ssm.base.BaseController;

@Controller
public class LoginController extends BaseController {
	
	@RequestMapping(value="index")
	public String toLogin(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username, password);
		try {
			subject.login(token);
			return "login_success";
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "index";
		}
		
	}
}
