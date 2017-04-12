package com.fxd.ssm.dao;

import com.fxd.ssm.entity.User;

public interface UserMapper {
	User selectUserByName(String username);
}
