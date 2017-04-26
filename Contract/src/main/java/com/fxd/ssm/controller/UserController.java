package com.fxd.ssm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ModelAndView toAddUser(){
		return new ModelAndView("user/addUser");
	}
	
	@RequestMapping("addUser")
	@ResponseBody
	public JsonResult addUser(User user){
		user.setCreateTime(new Date());
		int result=userService.addUser(user);
		JsonResult jResult=new JsonResult();
		if(result==1){
			jResult.setResultCode(1);
			jResult.setErrormsg("新增用户成功");
		}else{
			jResult.setResultCode(0);
			jResult.setErrormsg("新增用户失败");
		}
		return jResult;
	}
	
	@RequestMapping("getUserList")
	public String getUserList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<UserDTO> page=userService.getUserList(pageNo,pageSize);
		List<UserDTO> uList=page.getList();
		model.addAttribute("uList", uList);
		model.addAttribute("page", page);
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
	@ResponseBody
	public JsonResult updateUser(User user) throws IOException{
		
		user.setModifyTime(new Date());
		int result=userService.updateByRecord(user);
		JsonResult jr=new JsonResult();
		if (result >= 1) {
			jr.setResultCode(1);
			jr.setErrormsg("修改用户信息成功！");
		} else {
			jr.setResultCode(0);
			jr.setErrormsg("修改用户信息失败！");
		}
		return jr;
	}
	
	@RequestMapping("deleteUser")
	@ResponseBody
	public JsonResult deleteUser(HttpServletRequest request,
			HttpServletResponse response,@RequestParam("userId") Long userId) throws IOException{
		int result=userService.deleteUserById(userId);
		JsonResult jr=new JsonResult();
		if (result >= 1) {
			jr.setResultCode(1);
			jr.setErrormsg("删除成功！");
		} else {
			jr.setResultCode(0);
			jr.setErrormsg("删除失败！");
		}
		String o = JSON.toJSONString(jr);
		return jr;
	}
}
