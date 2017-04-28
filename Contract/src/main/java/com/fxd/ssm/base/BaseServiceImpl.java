package com.fxd.ssm.base;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fxd.ssm.dao.AuthorityMapper;
import com.fxd.ssm.dao.ContractMapper;
import com.fxd.ssm.dao.CustomerMapper;
import com.fxd.ssm.dao.GoodsMapper;
import com.fxd.ssm.dao.RoleMapper;
import com.fxd.ssm.dao.UserMapper;

public class BaseServiceImpl implements BaseService {
	protected Logger logger=Logger.getLogger(getClass());
	@Autowired
	protected UserMapper userMapper;
	@Autowired
	protected RoleMapper roleMapper;
	@Autowired
	protected AuthorityMapper authorityMapper;
	@Autowired 
	protected CustomerMapper customerMapper;
	@Autowired
	protected GoodsMapper goodsMapper;
	@Autowired 
	protected ContractMapper contractMapper;
}
