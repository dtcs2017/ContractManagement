package com.fxd.ssm.dao;

import com.fxd.ssm.entity.Contract;
import com.fxd.ssm.entity.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractMapper {
    int countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Long contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Long contractId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}