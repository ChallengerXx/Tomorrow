package com.business.dao.entity.projectEntity;

import java.util.ArrayList;
import java.util.List;

public class SspSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspSupplierExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchIsNull() {
            addCriterion("sale_switch is null");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchIsNotNull() {
            addCriterion("sale_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchEqualTo(Integer value) {
            addCriterion("sale_switch =", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchNotEqualTo(Integer value) {
            addCriterion("sale_switch <>", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchGreaterThan(Integer value) {
            addCriterion("sale_switch >", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_switch >=", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchLessThan(Integer value) {
            addCriterion("sale_switch <", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("sale_switch <=", value, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchIn(List<Integer> values) {
            addCriterion("sale_switch in", values, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchNotIn(List<Integer> values) {
            addCriterion("sale_switch not in", values, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchBetween(Integer value1, Integer value2) {
            addCriterion("sale_switch between", value1, value2, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSaleSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_switch not between", value1, value2, "saleSwitch");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkIsNull() {
            addCriterion("supplier_mark is null");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkIsNotNull() {
            addCriterion("supplier_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkEqualTo(String value) {
            addCriterion("supplier_mark =", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkNotEqualTo(String value) {
            addCriterion("supplier_mark <>", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkGreaterThan(String value) {
            addCriterion("supplier_mark >", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_mark >=", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkLessThan(String value) {
            addCriterion("supplier_mark <", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkLessThanOrEqualTo(String value) {
            addCriterion("supplier_mark <=", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkLike(String value) {
            addCriterion("supplier_mark like", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkNotLike(String value) {
            addCriterion("supplier_mark not like", value, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkIn(List<String> values) {
            addCriterion("supplier_mark in", values, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkNotIn(List<String> values) {
            addCriterion("supplier_mark not in", values, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkBetween(String value1, String value2) {
            addCriterion("supplier_mark between", value1, value2, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierMarkNotBetween(String value1, String value2) {
            addCriterion("supplier_mark not between", value1, value2, "supplierMark");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andUpdateManIsNull() {
            addCriterion("update_man is null");
            return (Criteria) this;
        }

        public Criteria andUpdateManIsNotNull() {
            addCriterion("update_man is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateManEqualTo(Integer value) {
            addCriterion("update_man =", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotEqualTo(Integer value) {
            addCriterion("update_man <>", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManGreaterThan(Integer value) {
            addCriterion("update_man >", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_man >=", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManLessThan(Integer value) {
            addCriterion("update_man <", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManLessThanOrEqualTo(Integer value) {
            addCriterion("update_man <=", value, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManIn(List<Integer> values) {
            addCriterion("update_man in", values, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotIn(List<Integer> values) {
            addCriterion("update_man not in", values, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManBetween(Integer value1, Integer value2) {
            addCriterion("update_man between", value1, value2, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateManNotBetween(Integer value1, Integer value2) {
            addCriterion("update_man not between", value1, value2, "updateMan");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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