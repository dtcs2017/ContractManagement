package com.fxd.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private Integer customerId;

    private String customerName;

    private String customerAddress;

    private String certSerialNum;

    private String legalRepre;

    private String agent;

    private String phoneNum;

    private String mobileNum;

    private String bankName;

    private BigDecimal bankNum;

    private Date createdTime;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCertSerialNum() {
        return certSerialNum;
    }

    public void setCertSerialNum(String certSerialNum) {
        this.certSerialNum = certSerialNum == null ? null : certSerialNum.trim();
    }

    public String getLegalRepre() {
        return legalRepre;
    }

    public void setLegalRepre(String legalRepre) {
        this.legalRepre = legalRepre == null ? null : legalRepre.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum == null ? null : mobileNum.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public BigDecimal getBankNum() {
        return bankNum;
    }

    public void setBankNum(BigDecimal bankNum) {
        this.bankNum = bankNum;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}