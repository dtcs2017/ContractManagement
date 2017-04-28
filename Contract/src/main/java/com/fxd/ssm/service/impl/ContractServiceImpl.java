package com.fxd.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.entity.Contract;
import com.fxd.ssm.service.ContractService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ContractServiceImpl extends BaseServiceImpl implements ContractService {

	public PageInfo<Contract> getContractList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Contract> list=contractMapper.getContractList();
		return new PageInfo<Contract>(list);
	}

	public Contract getContractInfoById(Long contractId) {
		
		return contractMapper.selectByPrimaryKey(contractId);
		
	}

	public int updateContractByRecord(Contract record) {
		
		return contractMapper.updateByPrimaryKeySelective(record);
	}

}
