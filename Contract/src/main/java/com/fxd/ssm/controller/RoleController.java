package com.fxd.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.entity.Role;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("role")
public class RoleController extends BaseController {
	
	@RequestMapping("getRoleList")
	public String getRoleList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<Role> page=roleService.getRoleList(pageNo,pageSize);
		List<Role> rList=page.getList();
		model.addAttribute("rList", rList);
		model.addAttribute("page", page);
		return "role/roleList";
	}
}
