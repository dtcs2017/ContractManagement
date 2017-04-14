package com.fxd.ssm.service;

import java.util.Set;

import com.fxd.ssm.entity.User;

public interface UserService {
	User getUserByName(String username);

	Set<String> getRolesByName(String userName);

	Set<String> getAuthoritisByName(String userName);
}
