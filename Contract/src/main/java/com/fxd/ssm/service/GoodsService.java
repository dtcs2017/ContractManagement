package com.fxd.ssm.service;

import com.fxd.ssm.entity.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> getGoodsList(int pageNo, int pageSize);

}
