package com.fxd.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fxd.ssm.base.BaseServiceImpl;
import com.fxd.ssm.entity.Goods;
import com.fxd.ssm.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl extends BaseServiceImpl implements GoodsService {

	public PageInfo<Goods> getGoodsList(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Goods> list=goodsMapper.getGoodsList();
		return new PageInfo<Goods>(list);
	}

}
