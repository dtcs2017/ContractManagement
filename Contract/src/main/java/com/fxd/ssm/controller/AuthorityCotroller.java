package com.fxd.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.entity.Authority;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("authority")
public class AuthorityCotroller extends BaseController {
	
	@RequestMapping("getAuthorityList")
	public String getAuthorityList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<Authority> page=authorityService.getAuthorityList(pageNo,pageSize);
		List<Authority> aList=page.getList();
		model.addAttribute("aList", aList);
		model.addAttribute("page", page);
		return "authority/authorityList";
	}
}
