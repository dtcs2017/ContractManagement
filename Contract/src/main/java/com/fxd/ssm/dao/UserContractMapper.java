package com.fxd.ssm.dao;

import com.fxd.ssm.entity.UserContract;
import com.fxd.ssm.entity.UserContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContractMapper {
    int countByExample(UserContractExample example);

    int deleteByExample(UserContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserContract record);

    int insertSelective(UserContract record);

    List<UserContract> selectByExample(UserContractExample example);

    UserContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserContract record, @Param("example") UserContractExample example);

    int updateByExample(@Param("record") UserContract record, @Param("example") UserContractExample example);

    int updateByPrimaryKeySelective(UserContract record);

    int updateByPrimaryKey(UserContract record);
}