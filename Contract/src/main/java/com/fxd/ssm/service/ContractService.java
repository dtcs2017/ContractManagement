package com.fxd.ssm.service;

import com.fxd.ssm.entity.Contract;
import com.github.pagehelper.PageInfo;

public interface ContractService {

	PageInfo<Contract> getContractList(int pageNo, int pageSize);

	Contract getContractInfoById(Long contractId);

	int updateContractByRecord(Contract contract);

}
