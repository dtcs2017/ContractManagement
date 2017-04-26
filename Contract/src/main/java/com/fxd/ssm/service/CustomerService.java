package com.fxd.ssm.service;

import com.fxd.ssm.entity.Customer;
import com.github.pagehelper.PageInfo;

public interface CustomerService {

	PageInfo<Customer> getCustomerList(int pageNo, int pageSize);

}
