package com.fxd.ssm.dao;

import com.fxd.ssm.dto.UserDTO;
import com.fxd.ssm.entity.User;
import com.fxd.ssm.entity.UserExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User selectByName(String username);
	
	Long selectRoleIdByName(String username);

	Set<String> selectRolesByUserName(String userName);

	Set<String> selectAuthoritiesByUserName(String userName);

	List<UserDTO> getUserList();
}