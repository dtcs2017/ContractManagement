package com.fxd.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.dto.UserDTO;
import com.fxd.ssm.entity.Role;
import com.fxd.ssm.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoleServiceImpl extends BaseServiceImpl implements RoleService {

	public PageInfo<Role> getRoleList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo,pageSize);
		List<Role> list=roleMapper.getUserList();
		return new PageInfo<Role>(list);
	}

}
