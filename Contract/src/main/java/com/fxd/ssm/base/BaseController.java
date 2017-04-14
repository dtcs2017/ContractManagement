package com.fxd.ssm.base;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.fxd.ssm.service.UserService;
import com.fxd.ssm.entity.User;

public class BaseController {
	@Autowired
	protected UserService userService;
	
	public String getShiroUser()
	{
		return (String) SecurityUtils.getSubject().getPrincipal();
	}
}
