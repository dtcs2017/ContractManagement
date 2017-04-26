package com.fxd.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.fxd.ssm.base.BaseController;

@SessionAttributes("loginName")
@Controller
public class LoginController extends BaseController {
	
	@RequestMapping(value="index")
	public String toLogin(){
		return "index";
	}
	
	/**
	 * @Description: 登录方法(后期功能：若用户已经登录则先执行登出操作)
	 * @param @param username
	 * @param @param password
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author 晓东
	 * @date 2017年4月26日
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username, password);
		try {
			subject.login(token);
			return "redirect:/home";
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "index";
		}
	}
	
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request,ModelMap modelMap){
		String userName = getShiroUser();
		modelMap.addAttribute("loginName", userName);
		return new ModelAndView("home",modelMap);
	}
}
