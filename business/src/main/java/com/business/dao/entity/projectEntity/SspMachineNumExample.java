package com.business.dao.entity.projectEntity;

import java.util.ArrayList;
import java.util.List;

public class SspMachineNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspMachineNumExample() {
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

        public Criteria andMachineNumIsNull() {
            addCriterion("machine_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineNumIsNotNull() {
            addCriterion("machine_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNumEqualTo(String value) {
            addCriterion("machine_num =", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotEqualTo(String value) {
            addCriterion("machine_num <>", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumGreaterThan(String value) {
            addCriterion("machine_num >", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumGreaterThanOrEqualTo(String value) {
            addCriterion("machine_num >=", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumLessThan(String value) {
            addCriterion("machine_num <", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumLessThanOrEqualTo(String value) {
            addCriterion("machine_num <=", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumLike(String value) {
            addCriterion("machine_num like", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotLike(String value) {
            addCriterion("machine_num not like", value, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumIn(List<String> values) {
            addCriterion("machine_num in", values, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotIn(List<String> values) {
            addCriterion("machine_num not in", values, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumBetween(String value1, String value2) {
            addCriterion("machine_num between", value1, value2, "machineNum");
            return (Criteria) this;
        }

        public Criteria andMachineNumNotBetween(String value1, String value2) {
            addCriterion("machine_num not between", value1, value2, "machineNum");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andScrTypeIsNull() {
            addCriterion("scr_type is null");
            return (Criteria) this;
        }

        public Criteria andScrTypeIsNotNull() {
            addCriterion("scr_type is not null");
            return (Criteria) this;
        }

        public Criteria andScrTypeEqualTo(Integer value) {
            addCriterion("scr_type =", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeNotEqualTo(Integer value) {
            addCriterion("scr_type <>", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeGreaterThan(Integer value) {
            addCriterion("scr_type >", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scr_type >=", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeLessThan(Integer value) {
            addCriterion("scr_type <", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeLessThanOrEqualTo(Integer value) {
            addCriterion("scr_type <=", value, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeIn(List<Integer> values) {
            addCriterion("scr_type in", values, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeNotIn(List<Integer> values) {
            addCriterion("scr_type not in", values, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeBetween(Integer value1, Integer value2) {
            addCriterion("scr_type between", value1, value2, "scrType");
            return (Criteria) this;
        }

        public Criteria andScrTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("scr_type not between", value1, value2, "scrType");
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