package com.fxd.ssm.service;

import java.util.Date;
import java.util.Set;

import com.fxd.ssm.dto.UserDTO;
import com.fxd.ssm.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
	User getUserByName(String username);

	Set<String> getRolesByName(String userName);

	Set<String> getAuthoritisByName(String userName);

	PageInfo<UserDTO> getUserList(int pageNo, int pageSize);

	UserDTO getUserInfoById(Long userId);

	int updateByRecord(User user);

	int deleteUserById(Long userId);

	int addUser(User user);

	UserDTO getUserInfoByName(String userName);

	String getPwdByName(String userName);

	int updatePwdByName(String currUser, String newPwd);
}
