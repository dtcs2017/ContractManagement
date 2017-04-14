package com.fxd.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNull() {
            addCriterion("contract_num is null");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNotNull() {
            addCriterion("contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumEqualTo(String value) {
            addCriterion("contract_num =", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotEqualTo(String value) {
            addCriterion("contract_num <>", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThan(String value) {
            addCriterion("contract_num >", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("contract_num >=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThan(String value) {
            addCriterion("contract_num <", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThanOrEqualTo(String value) {
            addCriterion("contract_num <=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLike(String value) {
            addCriterion("contract_num like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotLike(String value) {
            addCriterion("contract_num not like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumIn(List<String> values) {
            addCriterion("contract_num in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotIn(List<String> values) {
            addCriterion("contract_num not in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumBetween(String value1, String value2) {
            addCriterion("contract_num between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotBetween(String value1, String value2) {
            addCriterion("contract_num not between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerIsNull() {
            addCriterion("purchase_checker is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerIsNotNull() {
            addCriterion("purchase_checker is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerEqualTo(String value) {
            addCriterion("purchase_checker =", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerNotEqualTo(String value) {
            addCriterion("purchase_checker <>", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerGreaterThan(String value) {
            addCriterion("purchase_checker >", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_checker >=", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerLessThan(String value) {
            addCriterion("purchase_checker <", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerLessThanOrEqualTo(String value) {
            addCriterion("purchase_checker <=", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerLike(String value) {
            addCriterion("purchase_checker like", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerNotLike(String value) {
            addCriterion("purchase_checker not like", value, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerIn(List<String> values) {
            addCriterion("purchase_checker in", values, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerNotIn(List<String> values) {
            addCriterion("purchase_checker not in", values, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerBetween(String value1, String value2) {
            addCriterion("purchase_checker between", value1, value2, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andPurchaseCheckerNotBetween(String value1, String value2) {
            addCriterion("purchase_checker not between", value1, value2, "purchaseChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerIsNull() {
            addCriterion("finance_checker is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerIsNotNull() {
            addCriterion("finance_checker is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerEqualTo(String value) {
            addCriterion("finance_checker =", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerNotEqualTo(String value) {
            addCriterion("finance_checker <>", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerGreaterThan(String value) {
            addCriterion("finance_checker >", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("finance_checker >=", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerLessThan(String value) {
            addCriterion("finance_checker <", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerLessThanOrEqualTo(String value) {
            addCriterion("finance_checker <=", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerLike(String value) {
            addCriterion("finance_checker like", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerNotLike(String value) {
            addCriterion("finance_checker not like", value, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerIn(List<String> values) {
            addCriterion("finance_checker in", values, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerNotIn(List<String> values) {
            addCriterion("finance_checker not in", values, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerBetween(String value1, String value2) {
            addCriterion("finance_checker between", value1, value2, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckerNotBetween(String value1, String value2) {
            addCriterion("finance_checker not between", value1, value2, "financeChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerIsNull() {
            addCriterion("law_checker is null");
            return (Criteria) this;
        }

        public Criteria andLawCheckerIsNotNull() {
            addCriterion("law_checker is not null");
            return (Criteria) this;
        }

        public Criteria andLawCheckerEqualTo(String value) {
            addCriterion("law_checker =", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerNotEqualTo(String value) {
            addCriterion("law_checker <>", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerGreaterThan(String value) {
            addCriterion("law_checker >", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("law_checker >=", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerLessThan(String value) {
            addCriterion("law_checker <", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerLessThanOrEqualTo(String value) {
            addCriterion("law_checker <=", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerLike(String value) {
            addCriterion("law_checker like", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerNotLike(String value) {
            addCriterion("law_checker not like", value, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerIn(List<String> values) {
            addCriterion("law_checker in", values, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerNotIn(List<String> values) {
            addCriterion("law_checker not in", values, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerBetween(String value1, String value2) {
            addCriterion("law_checker between", value1, value2, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andLawCheckerNotBetween(String value1, String value2) {
            addCriterion("law_checker not between", value1, value2, "lawChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerIsNull() {
            addCriterion("CEO_checker is null");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerIsNotNull() {
            addCriterion("CEO_checker is not null");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerEqualTo(String value) {
            addCriterion("CEO_checker =", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerNotEqualTo(String value) {
            addCriterion("CEO_checker <>", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerGreaterThan(String value) {
            addCriterion("CEO_checker >", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("CEO_checker >=", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerLessThan(String value) {
            addCriterion("CEO_checker <", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerLessThanOrEqualTo(String value) {
            addCriterion("CEO_checker <=", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerLike(String value) {
            addCriterion("CEO_checker like", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerNotLike(String value) {
            addCriterion("CEO_checker not like", value, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerIn(List<String> values) {
            addCriterion("CEO_checker in", values, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerNotIn(List<String> values) {
            addCriterion("CEO_checker not in", values, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerBetween(String value1, String value2) {
            addCriterion("CEO_checker between", value1, value2, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andCeoCheckerNotBetween(String value1, String value2) {
            addCriterion("CEO_checker not between", value1, value2, "ceoChecker");
            return (Criteria) this;
        }

        public Criteria andPartyAIsNull() {
            addCriterion("party_a is null");
            return (Criteria) this;
        }

        public Criteria andPartyAIsNotNull() {
            addCriterion("party_a is not null");
            return (Criteria) this;
        }

        public Criteria andPartyAEqualTo(String value) {
            addCriterion("party_a =", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotEqualTo(String value) {
            addCriterion("party_a <>", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAGreaterThan(String value) {
            addCriterion("party_a >", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAGreaterThanOrEqualTo(String value) {
            addCriterion("party_a >=", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALessThan(String value) {
            addCriterion("party_a <", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALessThanOrEqualTo(String value) {
            addCriterion("party_a <=", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALike(String value) {
            addCriterion("party_a like", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotLike(String value) {
            addCriterion("party_a not like", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAIn(List<String> values) {
            addCriterion("party_a in", values, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotIn(List<String> values) {
            addCriterion("party_a not in", values, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyABetween(String value1, String value2) {
            addCriterion("party_a between", value1, value2, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotBetween(String value1, String value2) {
            addCriterion("party_a not between", value1, value2, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyASeriIsNull() {
            addCriterion("party_a_seri is null");
            return (Criteria) this;
        }

        public Criteria andPartyASeriIsNotNull() {
            addCriterion("party_a_seri is not null");
            return (Criteria) this;
        }

        public Criteria andPartyASeriEqualTo(String value) {
            addCriterion("party_a_seri =", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriNotEqualTo(String value) {
            addCriterion("party_a_seri <>", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriGreaterThan(String value) {
            addCriterion("party_a_seri >", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriGreaterThanOrEqualTo(String value) {
            addCriterion("party_a_seri >=", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriLessThan(String value) {
            addCriterion("party_a_seri <", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriLessThanOrEqualTo(String value) {
            addCriterion("party_a_seri <=", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriLike(String value) {
            addCriterion("party_a_seri like", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriNotLike(String value) {
            addCriterion("party_a_seri not like", value, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriIn(List<String> values) {
            addCriterion("party_a_seri in", values, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriNotIn(List<String> values) {
            addCriterion("party_a_seri not in", values, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriBetween(String value1, String value2) {
            addCriterion("party_a_seri between", value1, value2, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyASeriNotBetween(String value1, String value2) {
            addCriterion("party_a_seri not between", value1, value2, "partyASeri");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalIsNull() {
            addCriterion("party_a_principal is null");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalIsNotNull() {
            addCriterion("party_a_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalEqualTo(String value) {
            addCriterion("party_a_principal =", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalNotEqualTo(String value) {
            addCriterion("party_a_principal <>", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalGreaterThan(String value) {
            addCriterion("party_a_principal >", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("party_a_principal >=", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalLessThan(String value) {
            addCriterion("party_a_principal <", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalLessThanOrEqualTo(String value) {
            addCriterion("party_a_principal <=", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalLike(String value) {
            addCriterion("party_a_principal like", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalNotLike(String value) {
            addCriterion("party_a_principal not like", value, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalIn(List<String> values) {
            addCriterion("party_a_principal in", values, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalNotIn(List<String> values) {
            addCriterion("party_a_principal not in", values, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalBetween(String value1, String value2) {
            addCriterion("party_a_principal between", value1, value2, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAPrincipalNotBetween(String value1, String value2) {
            addCriterion("party_a_principal not between", value1, value2, "partyAPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyAContactIsNull() {
            addCriterion("party_a_contact is null");
            return (Criteria) this;
        }

        public Criteria andPartyAContactIsNotNull() {
            addCriterion("party_a_contact is not null");
            return (Criteria) this;
        }

        public Criteria andPartyAContactEqualTo(Long value) {
            addCriterion("party_a_contact =", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactNotEqualTo(Long value) {
            addCriterion("party_a_contact <>", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactGreaterThan(Long value) {
            addCriterion("party_a_contact >", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactGreaterThanOrEqualTo(Long value) {
            addCriterion("party_a_contact >=", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactLessThan(Long value) {
            addCriterion("party_a_contact <", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactLessThanOrEqualTo(Long value) {
            addCriterion("party_a_contact <=", value, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactIn(List<Long> values) {
            addCriterion("party_a_contact in", values, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactNotIn(List<Long> values) {
            addCriterion("party_a_contact not in", values, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactBetween(Long value1, Long value2) {
            addCriterion("party_a_contact between", value1, value2, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyAContactNotBetween(Long value1, Long value2) {
            addCriterion("party_a_contact not between", value1, value2, "partyAContact");
            return (Criteria) this;
        }

        public Criteria andPartyBIsNull() {
            addCriterion("party_b is null");
            return (Criteria) this;
        }

        public Criteria andPartyBIsNotNull() {
            addCriterion("party_b is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBEqualTo(String value) {
            addCriterion("party_b =", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotEqualTo(String value) {
            addCriterion("party_b <>", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBGreaterThan(String value) {
            addCriterion("party_b >", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBGreaterThanOrEqualTo(String value) {
            addCriterion("party_b >=", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLessThan(String value) {
            addCriterion("party_b <", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLessThanOrEqualTo(String value) {
            addCriterion("party_b <=", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLike(String value) {
            addCriterion("party_b like", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotLike(String value) {
            addCriterion("party_b not like", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBIn(List<String> values) {
            addCriterion("party_b in", values, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotIn(List<String> values) {
            addCriterion("party_b not in", values, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBBetween(String value1, String value2) {
            addCriterion("party_b between", value1, value2, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotBetween(String value1, String value2) {
            addCriterion("party_b not between", value1, value2, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriIsNull() {
            addCriterion("party_b_seri is null");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriIsNotNull() {
            addCriterion("party_b_seri is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriEqualTo(String value) {
            addCriterion("party_b_seri =", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriNotEqualTo(String value) {
            addCriterion("party_b_seri <>", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriGreaterThan(String value) {
            addCriterion("party_b_seri >", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriGreaterThanOrEqualTo(String value) {
            addCriterion("party_b_seri >=", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriLessThan(String value) {
            addCriterion("party_b_seri <", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriLessThanOrEqualTo(String value) {
            addCriterion("party_b_seri <=", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriLike(String value) {
            addCriterion("party_b_seri like", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriNotLike(String value) {
            addCriterion("party_b_seri not like", value, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriIn(List<String> values) {
            addCriterion("party_b_seri in", values, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriNotIn(List<String> values) {
            addCriterion("party_b_seri not in", values, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriBetween(String value1, String value2) {
            addCriterion("party_b_seri between", value1, value2, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBSeriNotBetween(String value1, String value2) {
            addCriterion("party_b_seri not between", value1, value2, "partyBSeri");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalIsNull() {
            addCriterion("party_b_principal is null");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalIsNotNull() {
            addCriterion("party_b_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalEqualTo(String value) {
            addCriterion("party_b_principal =", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalNotEqualTo(String value) {
            addCriterion("party_b_principal <>", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalGreaterThan(String value) {
            addCriterion("party_b_principal >", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("party_b_principal >=", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalLessThan(String value) {
            addCriterion("party_b_principal <", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalLessThanOrEqualTo(String value) {
            addCriterion("party_b_principal <=", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalLike(String value) {
            addCriterion("party_b_principal like", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalNotLike(String value) {
            addCriterion("party_b_principal not like", value, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalIn(List<String> values) {
            addCriterion("party_b_principal in", values, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalNotIn(List<String> values) {
            addCriterion("party_b_principal not in", values, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalBetween(String value1, String value2) {
            addCriterion("party_b_principal between", value1, value2, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyBPrincipalNotBetween(String value1, String value2) {
            addCriterion("party_b_principal not between", value1, value2, "partyBPrincipal");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactIsNull() {
            addCriterion("partya_b_contact is null");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactIsNotNull() {
            addCriterion("partya_b_contact is not null");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactEqualTo(Long value) {
            addCriterion("partya_b_contact =", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactNotEqualTo(Long value) {
            addCriterion("partya_b_contact <>", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactGreaterThan(Long value) {
            addCriterion("partya_b_contact >", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactGreaterThanOrEqualTo(Long value) {
            addCriterion("partya_b_contact >=", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactLessThan(Long value) {
            addCriterion("partya_b_contact <", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactLessThanOrEqualTo(Long value) {
            addCriterion("partya_b_contact <=", value, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactIn(List<Long> values) {
            addCriterion("partya_b_contact in", values, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactNotIn(List<Long> values) {
            addCriterion("partya_b_contact not in", values, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactBetween(Long value1, Long value2) {
            addCriterion("partya_b_contact between", value1, value2, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andPartyaBContactNotBetween(Long value1, Long value2) {
            addCriterion("partya_b_contact not between", value1, value2, "partyaBContact");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNull() {
            addCriterion("measure_unit is null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNotNull() {
            addCriterion("measure_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitEqualTo(String value) {
            addCriterion("measure_unit =", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotEqualTo(String value) {
            addCriterion("measure_unit <>", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThan(String value) {
            addCriterion("measure_unit >", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThanOrEqualTo(String value) {
            addCriterion("measure_unit >=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThan(String value) {
            addCriterion("measure_unit <", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThanOrEqualTo(String value) {
            addCriterion("measure_unit <=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLike(String value) {
            addCriterion("measure_unit like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotLike(String value) {
            addCriterion("measure_unit not like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIn(List<String> values) {
            addCriterion("measure_unit in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotIn(List<String> values) {
            addCriterion("measure_unit not in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitBetween(String value1, String value2) {
            addCriterion("measure_unit between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotBetween(String value1, String value2) {
            addCriterion("measure_unit not between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Integer value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Integer value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Integer value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Integer value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Integer> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Integer> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNull() {
            addCriterion("contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andContractAmountIsNotNull() {
            addCriterion("contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andContractAmountEqualTo(Integer value) {
            addCriterion("contract_amount =", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotEqualTo(Integer value) {
            addCriterion("contract_amount <>", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThan(Integer value) {
            addCriterion("contract_amount >", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_amount >=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThan(Integer value) {
            addCriterion("contract_amount <", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountLessThanOrEqualTo(Integer value) {
            addCriterion("contract_amount <=", value, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountIn(List<Integer> values) {
            addCriterion("contract_amount in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotIn(List<Integer> values) {
            addCriterion("contract_amount not in", values, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountBetween(Integer value1, Integer value2) {
            addCriterion("contract_amount between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_amount not between", value1, value2, "contractAmount");
            return (Criteria) this;
        }

        public Criteria andContractStateIsNull() {
            addCriterion("contract_state is null");
            return (Criteria) this;
        }

        public Criteria andContractStateIsNotNull() {
            addCriterion("contract_state is not null");
            return (Criteria) this;
        }

        public Criteria andContractStateEqualTo(String value) {
            addCriterion("contract_state =", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotEqualTo(String value) {
            addCriterion("contract_state <>", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateGreaterThan(String value) {
            addCriterion("contract_state >", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateGreaterThanOrEqualTo(String value) {
            addCriterion("contract_state >=", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateLessThan(String value) {
            addCriterion("contract_state <", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateLessThanOrEqualTo(String value) {
            addCriterion("contract_state <=", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateLike(String value) {
            addCriterion("contract_state like", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotLike(String value) {
            addCriterion("contract_state not like", value, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateIn(List<String> values) {
            addCriterion("contract_state in", values, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotIn(List<String> values) {
            addCriterion("contract_state not in", values, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateBetween(String value1, String value2) {
            addCriterion("contract_state between", value1, value2, "contractState");
            return (Criteria) this;
        }

        public Criteria andContractStateNotBetween(String value1, String value2) {
            addCriterion("contract_state not between", value1, value2, "contractState");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("real_price is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("real_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(Integer value) {
            addCriterion("real_price =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(Integer value) {
            addCriterion("real_price <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(Integer value) {
            addCriterion("real_price >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_price >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(Integer value) {
            addCriterion("real_price <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(Integer value) {
            addCriterion("real_price <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<Integer> values) {
            addCriterion("real_price in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<Integer> values) {
            addCriterion("real_price not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(Integer value1, Integer value2) {
            addCriterion("real_price between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("real_price not between", value1, value2, "realPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}