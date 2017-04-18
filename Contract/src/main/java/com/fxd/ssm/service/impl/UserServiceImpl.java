package com.fxd.ssm.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.dto.UserDTO;
import com.fxd.ssm.entity.User;
import com.fxd.ssm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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

	public PageInfo<UserDTO> getUserList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo,pageSize);
		List<UserDTO> list=userMapper.getUserList();
		return new PageInfo<UserDTO>(list);
	}

	public UserDTO getUserInfoById(Long userId) {
		UserDTO userInfo=userMapper.getUserInfoById(userId);
		return userInfo;
	}

}
