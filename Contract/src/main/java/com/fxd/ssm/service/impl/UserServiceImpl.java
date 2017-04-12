package com.fxd.ssm.service.impl;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.entity.User;
import com.fxd.ssm.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	public User getUserByName(String username) {
		User user=userMapper.selectUserByName(username);
		return user;
	}

}
