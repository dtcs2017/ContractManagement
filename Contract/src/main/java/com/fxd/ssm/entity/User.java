package com.fxd.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
	private Long id;
	private Long roleId;
	private String userName;
	private String password;
	private String realName;
	private BigDecimal phoneNum;
	private String email;
	private Date createTime;
	private Date modifyTime;
	private char userState;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public BigDecimal getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(BigDecimal phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public char getUserState() {
		return userState;
	}
	public void setUserState(char userState) {
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", roleId=" + roleId + ", userName=" + userName + ", password=" + password
				+ ", realName=" + realName + ", phoneNum=" + phoneNum + ", email=" + email + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", userState=" + userState + "]";
	}
	
}
