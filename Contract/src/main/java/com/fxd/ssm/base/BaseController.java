package com.fxd.ssm.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.fxd.ssm.service.UserService;

public class BaseController {
	@Autowired
	protected UserService userService;
}
