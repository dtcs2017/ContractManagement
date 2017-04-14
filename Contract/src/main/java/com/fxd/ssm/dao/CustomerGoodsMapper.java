package com.fxd.ssm.dao;

import com.fxd.ssm.entity.CustomerGoods;
import com.fxd.ssm.entity.CustomerGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerGoodsMapper {
    int countByExample(CustomerGoodsExample example);

    int deleteByExample(CustomerGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerGoods record);

    int insertSelective(CustomerGoods record);

    List<CustomerGoods> selectByExample(CustomerGoodsExample example);

    CustomerGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerGoods record, @Param("example") CustomerGoodsExample example);

    int updateByExample(@Param("record") CustomerGoods record, @Param("example") CustomerGoodsExample example);

    int updateByPrimaryKeySelective(CustomerGoods record);

    int updateByPrimaryKey(CustomerGoods record);
}