package com.fxd.ssm.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.entity.User;
import com.fxd.ssm.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	public User getUserByName(String username) {
		User user=userMapper.selectByName(username);
		return user;
	}

	public Set<String> getRolesByName(String userName) {
		return userMapper.selectRolesByUserName(userName);
	}

	public Set<String> getAuthoritisByName(String userName) {
		return userMapper.selectAuthoritiesByUserName(userName);
	}

}
