package com.fxd.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.dao.CustomerMapper;
import com.fxd.ssm.entity.Customer;
import com.fxd.ssm.service.CustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CustomerServiceImpl extends BaseServiceImpl implements CustomerService {

	public PageInfo<Customer> getCustomerList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Customer> list=customerMapper.getCustomerList();
		return new PageInfo<Customer>(list);
	}
}
