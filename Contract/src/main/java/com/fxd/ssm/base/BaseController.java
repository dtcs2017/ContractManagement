package com.fxd.ssm.base;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.fxd.ssm.service.AuthorityService;
import com.fxd.ssm.service.RoleService;
import com.fxd.ssm.service.UserService;
import com.fxd.ssm.entity.User;

public class BaseController {
	
	protected static final String PAGE_NO = "1";
	protected static final String PAGE_SIZE = "10";
	
	@Autowired
	protected UserService userService;
	
	@Autowired
	protected RoleService roleService;
	
	@Autowired
	protected AuthorityService authorityService;
	
	public String getShiroUser()
	{
		return (String) SecurityUtils.getSubject().getPrincipal();
	}
}
