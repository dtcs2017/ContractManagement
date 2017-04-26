package com.fxd.ssm.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.common.JsonResult;
import com.fxd.ssm.dto.UserDTO;

@Controller
@RequestMapping("myInformation")
public class MyInforController extends BaseController {
	
	@RequestMapping("personalData")
	public String personalData(HttpSession session,ModelMap model){
		String userName=getShiroUser();
		UserDTO userDTO=userService.getUserInfoByName(userName);
		model.addAttribute("userInfo", userDTO);
		return "myInformation/myData";
	}
	
	@RequestMapping("toChangePwd")
	public String toChangePwd(){
		return "myInformation/changePwd";
	}
	
	@RequestMapping("changePwd")
	@ResponseBody
	public JsonResult changePwd(@RequestParam(required=true) String oldPwd,@RequestParam(required=true) String newPwd){
		JsonResult jResult=new JsonResult();
		String currUser=getShiroUser();
		String password=userService.getPwdByName(currUser);
		if(password.equals(oldPwd)){
			int result=userService.updatePwdByName(currUser,newPwd);
			if(result>0){
				jResult.setResultCode(1);
				jResult.setErrormsg("密码更新成功");
			}else{
				jResult.setResultCode(0);
				jResult.setErrormsg("密码更新失败");
			}
		}else{
			jResult.setResultCode(0);
			jResult.setErrormsg("密码更新失败");
		}
		return jResult;
	}
}
