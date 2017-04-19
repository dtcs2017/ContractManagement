package com.fxd.ssm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.common.JsonResult;
import com.fxd.ssm.dto.UserDTO;
import com.fxd.ssm.entity.User;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	

	@RequestMapping("/toAddUser")
	public ModelAndView createUser(){
		return new ModelAndView("user/add_user");
	}
	
	@RequestMapping("getUserList")
	public String getUserList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<UserDTO> page=userService.getUserList(pageNo,pageSize);
		List<UserDTO> uList=page.getList();
		model.addAttribute("uList", uList);
		return "user/userList";
	}
	
	@RequestMapping("viewUser")
	public String getUserInfoById(HttpSession session,ModelMap model,
			@RequestParam(required = true) Long userId){
		UserDTO userInfo=userService.getUserInfoById(userId);
		model.addAttribute("userInfo", userInfo);
		return "user/userInfo";
	}
	
	@RequestMapping("toUpdateUser")
	public String toUpdateUserById(HttpSession session,ModelMap model,
			@RequestParam(required = true) Long userId){
		UserDTO userInfo=userService.getUserInfoById(userId);
		model.addAttribute("userInfo", userInfo);
		return "user/updateUser";
	}
	
	@RequestMapping("updateUser")
	public Integer updateUser(HttpServletRequest request,
			HttpServletResponse response,User user) throws IOException{
		
		user.setModifyTime(new Date());
		int result=userService.updateByRecord(user);
		JsonResult jr=new JsonResult();
		if (result >= 1) {
			jr.setResultCode(1);
			jr.setErrormsg("修改资产成功！");
		} else {
			jr.setResultCode(0);
			jr.setErrormsg("修改资产失败！");
		}
		String o = JSON.toJSONString(jr);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(o);
		return 1;
	}
}
