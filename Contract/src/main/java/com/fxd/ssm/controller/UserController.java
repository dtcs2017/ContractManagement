package com.fxd.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.dto.UserDTO;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	

	@RequestMapping("/toAddUser")
	public ModelAndView createUser(){
		return new ModelAndView("user/add_user");
	}
	
	@RequestMapping("userList")
	public String getUserList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<UserDTO> page=userService.getUserList(pageNo,pageSize);
		List<UserDTO> uList=page.getList();
		model.addAttribute("uList", uList);
		return "user/userList";
	}
}
