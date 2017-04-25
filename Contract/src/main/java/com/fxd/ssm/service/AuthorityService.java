package com.fxd.ssm.service;

import com.fxd.ssm.entity.Authority;
import com.github.pagehelper.PageInfo;

public interface AuthorityService {

	PageInfo<Authority> getAuthorityList(int pageNo, int pageSize);

}
