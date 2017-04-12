package com.fxd.ssm.base;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fxd.ssm.dao.UserMapper;

public class BaseServiceImpl implements BaseService {
	protected Logger logger=Logger.getLogger(getClass());
	@Autowired
	protected UserMapper userMapper;
}
