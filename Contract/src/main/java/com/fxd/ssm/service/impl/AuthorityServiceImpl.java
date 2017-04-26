package com.fxd.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.entity.Authority;
import com.fxd.ssm.service.AuthorityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AuthorityServiceImpl extends BaseServiceImpl implements AuthorityService {

	public PageInfo<Authority> getAuthorityList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo,pageSize);
		List<Authority> list=authorityMapper.getAuthorityList();
		return new PageInfo<Authority>(list);
	}

}
