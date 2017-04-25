package com.fxd.ssm.service;

import com.fxd.ssm.entity.Role;
import com.github.pagehelper.PageInfo;

public interface RoleService {

	PageInfo<Role> getRoleList(int pageNo, int pageSize);
	
}
