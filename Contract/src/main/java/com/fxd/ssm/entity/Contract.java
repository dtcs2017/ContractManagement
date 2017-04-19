package com.fxd.ssm.entity;

public class Contract {
    private Long contractId;

    private Integer goodsId;

    private Integer customerId;

    private String contractName;

    private String contractNum;

    private String contractType;

    private String creator;

    private String modifier;

    private String purchaseChecker;

    private String financeChecker;

    private String lawChecker;

    private String ceoChecker;

    private String partyA;

    private String partyASeri;

    private String partyAPrincipal;

    private String partyAContact;

    private String partyB;

    private String partyBSeri;

    private String partyBPrincipal;

    private String partyaBContact;

    private String goodsName;

    private String measureUnit;

    private Integer unitPrice;

    private String payMethod;

    private Integer goodsCount;

    private Integer contractAmount;

    private String contractState;

    private Integer realPrice;

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getPurchaseChecker() {
        return purchaseChecker;
    }

    public void setPurchaseChecker(String purchaseChecker) {
        this.purchaseChecker = purchaseChecker == null ? null : purchaseChecker.trim();
    }

    public String getFinanceChecker() {
        return financeChecker;
    }

    public void setFinanceChecker(String financeChecker) {
        this.financeChecker = financeChecker == null ? null : financeChecker.trim();
    }

    public String getLawChecker() {
        return lawChecker;
    }

    public void setLawChecker(String lawChecker) {
        this.lawChecker = lawChecker == null ? null : lawChecker.trim();
    }

    public String getCeoChecker() {
        return ceoChecker;
    }

    public void setCeoChecker(String ceoChecker) {
        this.ceoChecker = ceoChecker == null ? null : ceoChecker.trim();
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA == null ? null : partyA.trim();
    }

    public String getPartyASeri() {
        return partyASeri;
    }

    public void setPartyASeri(String partyASeri) {
        this.partyASeri = partyASeri == null ? null : partyASeri.trim();
    }

    public String getPartyAPrincipal() {
        return partyAPrincipal;
    }

    public void setPartyAPrincipal(String partyAPrincipal) {
        this.partyAPrincipal = partyAPrincipal == null ? null : partyAPrincipal.trim();
    }

    public String getPartyAContact() {
        return partyAContact;
    }

    public void setPartyAContact(String partyAContact) {
        this.partyAContact = partyAContact == null ? null : partyAContact.trim();
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB == null ? null : partyB.trim();
    }

    public String getPartyBSeri() {
        return partyBSeri;
    }

    public void setPartyBSeri(String partyBSeri) {
        this.partyBSeri = partyBSeri == null ? null : partyBSeri.trim();
    }

    public String getPartyBPrincipal() {
        return partyBPrincipal;
    }

    public void setPartyBPrincipal(String partyBPrincipal) {
        this.partyBPrincipal = partyBPrincipal == null ? null : partyBPrincipal.trim();
    }

    public String getPartyaBContact() {
        return partyaBContact;
    }

    public void setPartyaBContact(String partyaBContact) {
        this.partyaBContact = partyaBContact == null ? null : partyaBContact.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit == null ? null : measureUnit.trim();
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Integer contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getContractState() {
        return contractState;
    }

    public void setContractState(String contractState) {
        this.contractState = contractState == null ? null : contractState.trim();
    }

    public Integer getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Integer realPrice) {
        this.realPrice = realPrice;
    }
}