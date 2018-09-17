package com.business.dao.entity.projectEntity;

import java.util.ArrayList;
import java.util.List;

public class SspPremisesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspPremisesExample() {
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

        public Criteria andPrimaryIdIsNull() {
            addCriterion("primary_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdIsNotNull() {
            addCriterion("primary_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdEqualTo(Integer value) {
            addCriterion("primary_id =", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotEqualTo(Integer value) {
            addCriterion("primary_id <>", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdGreaterThan(Integer value) {
            addCriterion("primary_id >", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_id >=", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdLessThan(Integer value) {
            addCriterion("primary_id <", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("primary_id <=", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdIn(List<Integer> values) {
            addCriterion("primary_id in", values, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotIn(List<Integer> values) {
            addCriterion("primary_id not in", values, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdBetween(Integer value1, Integer value2) {
            addCriterion("primary_id between", value1, value2, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_id not between", value1, value2, "primaryId");
            return (Criteria) this;
        }

        public Criteria andUuIdIsNull() {
            addCriterion("uu_id is null");
            return (Criteria) this;
        }

        public Criteria andUuIdIsNotNull() {
            addCriterion("uu_id is not null");
            return (Criteria) this;
        }

        public Criteria andUuIdEqualTo(String value) {
            addCriterion("uu_id =", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdNotEqualTo(String value) {
            addCriterion("uu_id <>", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdGreaterThan(String value) {
            addCriterion("uu_id >", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdGreaterThanOrEqualTo(String value) {
            addCriterion("uu_id >=", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdLessThan(String value) {
            addCriterion("uu_id <", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdLessThanOrEqualTo(String value) {
            addCriterion("uu_id <=", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdLike(String value) {
            addCriterion("uu_id like", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdNotLike(String value) {
            addCriterion("uu_id not like", value, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdIn(List<String> values) {
            addCriterion("uu_id in", values, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdNotIn(List<String> values) {
            addCriterion("uu_id not in", values, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdBetween(String value1, String value2) {
            addCriterion("uu_id between", value1, value2, "uuId");
            return (Criteria) this;
        }

        public Criteria andUuIdNotBetween(String value1, String value2) {
            addCriterion("uu_id not between", value1, value2, "uuId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(Integer value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(Integer value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(Integer value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(Integer value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(Integer value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<Integer> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<Integer> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(Integer value1, Integer value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdIsNull() {
            addCriterion("maintainer_id is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdIsNotNull() {
            addCriterion("maintainer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdEqualTo(Integer value) {
            addCriterion("maintainer_id =", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdNotEqualTo(Integer value) {
            addCriterion("maintainer_id <>", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdGreaterThan(Integer value) {
            addCriterion("maintainer_id >", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintainer_id >=", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdLessThan(Integer value) {
            addCriterion("maintainer_id <", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("maintainer_id <=", value, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdIn(List<Integer> values) {
            addCriterion("maintainer_id in", values, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdNotIn(List<Integer> values) {
            addCriterion("maintainer_id not in", values, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdBetween(Integer value1, Integer value2) {
            addCriterion("maintainer_id between", value1, value2, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maintainer_id not between", value1, value2, "maintainerId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andManagementIsNull() {
            addCriterion("management is null");
            return (Criteria) this;
        }

        public Criteria andManagementIsNotNull() {
            addCriterion("management is not null");
            return (Criteria) this;
        }

        public Criteria andManagementEqualTo(String value) {
            addCriterion("management =", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementNotEqualTo(String value) {
            addCriterion("management <>", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementGreaterThan(String value) {
            addCriterion("management >", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementGreaterThanOrEqualTo(String value) {
            addCriterion("management >=", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementLessThan(String value) {
            addCriterion("management <", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementLessThanOrEqualTo(String value) {
            addCriterion("management <=", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementLike(String value) {
            addCriterion("management like", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementNotLike(String value) {
            addCriterion("management not like", value, "management");
            return (Criteria) this;
        }

        public Criteria andManagementIn(List<String> values) {
            addCriterion("management in", values, "management");
            return (Criteria) this;
        }

        public Criteria andManagementNotIn(List<String> values) {
            addCriterion("management not in", values, "management");
            return (Criteria) this;
        }

        public Criteria andManagementBetween(String value1, String value2) {
            addCriterion("management between", value1, value2, "management");
            return (Criteria) this;
        }

        public Criteria andManagementNotBetween(String value1, String value2) {
            addCriterion("management not between", value1, value2, "management");
            return (Criteria) this;
        }

        public Criteria andBuildNumIsNull() {
            addCriterion("build_num is null");
            return (Criteria) this;
        }

        public Criteria andBuildNumIsNotNull() {
            addCriterion("build_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuildNumEqualTo(Integer value) {
            addCriterion("build_num =", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumNotEqualTo(Integer value) {
            addCriterion("build_num <>", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumGreaterThan(Integer value) {
            addCriterion("build_num >", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_num >=", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumLessThan(Integer value) {
            addCriterion("build_num <", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumLessThanOrEqualTo(Integer value) {
            addCriterion("build_num <=", value, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumIn(List<Integer> values) {
            addCriterion("build_num in", values, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumNotIn(List<Integer> values) {
            addCriterion("build_num not in", values, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumBetween(Integer value1, Integer value2) {
            addCriterion("build_num between", value1, value2, "buildNum");
            return (Criteria) this;
        }

        public Criteria andBuildNumNotBetween(Integer value1, Integer value2) {
            addCriterion("build_num not between", value1, value2, "buildNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNull() {
            addCriterion("house_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNotNull() {
            addCriterion("house_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumEqualTo(Integer value) {
            addCriterion("house_num =", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotEqualTo(Integer value) {
            addCriterion("house_num <>", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThan(Integer value) {
            addCriterion("house_num >", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_num >=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThan(Integer value) {
            addCriterion("house_num <", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThanOrEqualTo(Integer value) {
            addCriterion("house_num <=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIn(List<Integer> values) {
            addCriterion("house_num in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotIn(List<Integer> values) {
            addCriterion("house_num not in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumBetween(Integer value1, Integer value2) {
            addCriterion("house_num between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("house_num not between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andInHouseRateIsNull() {
            addCriterion("in_house_rate is null");
            return (Criteria) this;
        }

        public Criteria andInHouseRateIsNotNull() {
            addCriterion("in_house_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInHouseRateEqualTo(Float value) {
            addCriterion("in_house_rate =", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateNotEqualTo(Float value) {
            addCriterion("in_house_rate <>", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateGreaterThan(Float value) {
            addCriterion("in_house_rate >", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateGreaterThanOrEqualTo(Float value) {
            addCriterion("in_house_rate >=", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateLessThan(Float value) {
            addCriterion("in_house_rate <", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateLessThanOrEqualTo(Float value) {
            addCriterion("in_house_rate <=", value, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateIn(List<Float> values) {
            addCriterion("in_house_rate in", values, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateNotIn(List<Float> values) {
            addCriterion("in_house_rate not in", values, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateBetween(Float value1, Float value2) {
            addCriterion("in_house_rate between", value1, value2, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andInHouseRateNotBetween(Float value1, Float value2) {
            addCriterion("in_house_rate not between", value1, value2, "inHouseRate");
            return (Criteria) this;
        }

        public Criteria andUnitNumIsNull() {
            addCriterion("unit_num is null");
            return (Criteria) this;
        }

        public Criteria andUnitNumIsNotNull() {
            addCriterion("unit_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNumEqualTo(Integer value) {
            addCriterion("unit_num =", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotEqualTo(Integer value) {
            addCriterion("unit_num <>", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumGreaterThan(Integer value) {
            addCriterion("unit_num >", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_num >=", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumLessThan(Integer value) {
            addCriterion("unit_num <", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumLessThanOrEqualTo(Integer value) {
            addCriterion("unit_num <=", value, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumIn(List<Integer> values) {
            addCriterion("unit_num in", values, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotIn(List<Integer> values) {
            addCriterion("unit_num not in", values, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumBetween(Integer value1, Integer value2) {
            addCriterion("unit_num between", value1, value2, "unitNum");
            return (Criteria) this;
        }

        public Criteria andUnitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_num not between", value1, value2, "unitNum");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceIsNull() {
            addCriterion("accurate_price is null");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceIsNotNull() {
            addCriterion("accurate_price is not null");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceEqualTo(Integer value) {
            addCriterion("accurate_price =", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceNotEqualTo(Integer value) {
            addCriterion("accurate_price <>", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceGreaterThan(Integer value) {
            addCriterion("accurate_price >", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("accurate_price >=", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceLessThan(Integer value) {
            addCriterion("accurate_price <", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceLessThanOrEqualTo(Integer value) {
            addCriterion("accurate_price <=", value, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceIn(List<Integer> values) {
            addCriterion("accurate_price in", values, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceNotIn(List<Integer> values) {
            addCriterion("accurate_price not in", values, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceBetween(Integer value1, Integer value2) {
            addCriterion("accurate_price between", value1, value2, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andAccuratePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("accurate_price not between", value1, value2, "accuratePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(String value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(String value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(String value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(String value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(String value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(String value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLike(String value) {
            addCriterion("house_price like", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotLike(String value) {
            addCriterion("house_price not like", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<String> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<String> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(String value1, String value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(String value1, String value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameIsNull() {
            addCriterion("house_price_name is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameIsNotNull() {
            addCriterion("house_price_name is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameEqualTo(String value) {
            addCriterion("house_price_name =", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameNotEqualTo(String value) {
            addCriterion("house_price_name <>", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameGreaterThan(String value) {
            addCriterion("house_price_name >", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_price_name >=", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameLessThan(String value) {
            addCriterion("house_price_name <", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameLessThanOrEqualTo(String value) {
            addCriterion("house_price_name <=", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameLike(String value) {
            addCriterion("house_price_name like", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameNotLike(String value) {
            addCriterion("house_price_name not like", value, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameIn(List<String> values) {
            addCriterion("house_price_name in", values, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameNotIn(List<String> values) {
            addCriterion("house_price_name not in", values, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameBetween(String value1, String value2) {
            addCriterion("house_price_name between", value1, value2, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andHousePriceNameNotBetween(String value1, String value2) {
            addCriterion("house_price_name not between", value1, value2, "housePriceName");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNull() {
            addCriterion("rent_price is null");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNotNull() {
            addCriterion("rent_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentPriceEqualTo(String value) {
            addCriterion("rent_price =", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotEqualTo(String value) {
            addCriterion("rent_price <>", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThan(String value) {
            addCriterion("rent_price >", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThanOrEqualTo(String value) {
            addCriterion("rent_price >=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThan(String value) {
            addCriterion("rent_price <", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThanOrEqualTo(String value) {
            addCriterion("rent_price <=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLike(String value) {
            addCriterion("rent_price like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotLike(String value) {
            addCriterion("rent_price not like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceIn(List<String> values) {
            addCriterion("rent_price in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotIn(List<String> values) {
            addCriterion("rent_price not in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceBetween(String value1, String value2) {
            addCriterion("rent_price between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotBetween(String value1, String value2) {
            addCriterion("rent_price not between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceIsNull() {
            addCriterion("management_price is null");
            return (Criteria) this;
        }

        public Criteria andManagementPriceIsNotNull() {
            addCriterion("management_price is not null");
            return (Criteria) this;
        }

        public Criteria andManagementPriceEqualTo(String value) {
            addCriterion("management_price =", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceNotEqualTo(String value) {
            addCriterion("management_price <>", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceGreaterThan(String value) {
            addCriterion("management_price >", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceGreaterThanOrEqualTo(String value) {
            addCriterion("management_price >=", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceLessThan(String value) {
            addCriterion("management_price <", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceLessThanOrEqualTo(String value) {
            addCriterion("management_price <=", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceLike(String value) {
            addCriterion("management_price like", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceNotLike(String value) {
            addCriterion("management_price not like", value, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceIn(List<String> values) {
            addCriterion("management_price in", values, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceNotIn(List<String> values) {
            addCriterion("management_price not in", values, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceBetween(String value1, String value2) {
            addCriterion("management_price between", value1, value2, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andManagementPriceNotBetween(String value1, String value2) {
            addCriterion("management_price not between", value1, value2, "managementPrice");
            return (Criteria) this;
        }

        public Criteria andMaxLayerIsNull() {
            addCriterion("max_layer is null");
            return (Criteria) this;
        }

        public Criteria andMaxLayerIsNotNull() {
            addCriterion("max_layer is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLayerEqualTo(Integer value) {
            addCriterion("max_layer =", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerNotEqualTo(Integer value) {
            addCriterion("max_layer <>", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerGreaterThan(Integer value) {
            addCriterion("max_layer >", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_layer >=", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerLessThan(Integer value) {
            addCriterion("max_layer <", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerLessThanOrEqualTo(Integer value) {
            addCriterion("max_layer <=", value, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerIn(List<Integer> values) {
            addCriterion("max_layer in", values, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerNotIn(List<Integer> values) {
            addCriterion("max_layer not in", values, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerBetween(Integer value1, Integer value2) {
            addCriterion("max_layer between", value1, value2, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andMaxLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("max_layer not between", value1, value2, "maxLayer");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Long value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Long value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Long value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Long value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Long value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Long> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Long> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Long value1, Long value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Long value1, Long value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumIsNull() {
            addCriterion("sign_elevator_num is null");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumIsNotNull() {
            addCriterion("sign_elevator_num is not null");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumEqualTo(Integer value) {
            addCriterion("sign_elevator_num =", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumNotEqualTo(Integer value) {
            addCriterion("sign_elevator_num <>", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumGreaterThan(Integer value) {
            addCriterion("sign_elevator_num >", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_elevator_num >=", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumLessThan(Integer value) {
            addCriterion("sign_elevator_num <", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumLessThanOrEqualTo(Integer value) {
            addCriterion("sign_elevator_num <=", value, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumIn(List<Integer> values) {
            addCriterion("sign_elevator_num in", values, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumNotIn(List<Integer> values) {
            addCriterion("sign_elevator_num not in", values, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumBetween(Integer value1, Integer value2) {
            addCriterion("sign_elevator_num between", value1, value2, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andSignElevatorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_elevator_num not between", value1, value2, "signElevatorNum");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderIsNull() {
            addCriterion("management_leader is null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderIsNotNull() {
            addCriterion("management_leader is not null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderEqualTo(String value) {
            addCriterion("management_leader =", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotEqualTo(String value) {
            addCriterion("management_leader <>", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderGreaterThan(String value) {
            addCriterion("management_leader >", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("management_leader >=", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLessThan(String value) {
            addCriterion("management_leader <", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLessThanOrEqualTo(String value) {
            addCriterion("management_leader <=", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLike(String value) {
            addCriterion("management_leader like", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotLike(String value) {
            addCriterion("management_leader not like", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderIn(List<String> values) {
            addCriterion("management_leader in", values, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotIn(List<String> values) {
            addCriterion("management_leader not in", values, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderBetween(String value1, String value2) {
            addCriterion("management_leader between", value1, value2, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotBetween(String value1, String value2) {
            addCriterion("management_leader not between", value1, value2, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneIsNull() {
            addCriterion("management_leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneIsNotNull() {
            addCriterion("management_leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneEqualTo(String value) {
            addCriterion("management_leader_phone =", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneNotEqualTo(String value) {
            addCriterion("management_leader_phone <>", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneGreaterThan(String value) {
            addCriterion("management_leader_phone >", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("management_leader_phone >=", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneLessThan(String value) {
            addCriterion("management_leader_phone <", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("management_leader_phone <=", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneLike(String value) {
            addCriterion("management_leader_phone like", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneNotLike(String value) {
            addCriterion("management_leader_phone not like", value, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneIn(List<String> values) {
            addCriterion("management_leader_phone in", values, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneNotIn(List<String> values) {
            addCriterion("management_leader_phone not in", values, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneBetween(String value1, String value2) {
            addCriterion("management_leader_phone between", value1, value2, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("management_leader_phone not between", value1, value2, "managementLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddmanIsNull() {
            addCriterion("addman is null");
            return (Criteria) this;
        }

        public Criteria andAddmanIsNotNull() {
            addCriterion("addman is not null");
            return (Criteria) this;
        }

        public Criteria andAddmanEqualTo(String value) {
            addCriterion("addman =", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanNotEqualTo(String value) {
            addCriterion("addman <>", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanGreaterThan(String value) {
            addCriterion("addman >", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanGreaterThanOrEqualTo(String value) {
            addCriterion("addman >=", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanLessThan(String value) {
            addCriterion("addman <", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanLessThanOrEqualTo(String value) {
            addCriterion("addman <=", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanLike(String value) {
            addCriterion("addman like", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanNotLike(String value) {
            addCriterion("addman not like", value, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanIn(List<String> values) {
            addCriterion("addman in", values, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanNotIn(List<String> values) {
            addCriterion("addman not in", values, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanBetween(String value1, String value2) {
            addCriterion("addman between", value1, value2, "addman");
            return (Criteria) this;
        }

        public Criteria andAddmanNotBetween(String value1, String value2) {
            addCriterion("addman not between", value1, value2, "addman");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Integer value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Integer value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Integer value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Integer value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Integer value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Integer> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Integer> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Integer value1, Integer value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUpmanIsNull() {
            addCriterion("upman is null");
            return (Criteria) this;
        }

        public Criteria andUpmanIsNotNull() {
            addCriterion("upman is not null");
            return (Criteria) this;
        }

        public Criteria andUpmanEqualTo(String value) {
            addCriterion("upman =", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanNotEqualTo(String value) {
            addCriterion("upman <>", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanGreaterThan(String value) {
            addCriterion("upman >", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanGreaterThanOrEqualTo(String value) {
            addCriterion("upman >=", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanLessThan(String value) {
            addCriterion("upman <", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanLessThanOrEqualTo(String value) {
            addCriterion("upman <=", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanLike(String value) {
            addCriterion("upman like", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanNotLike(String value) {
            addCriterion("upman not like", value, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanIn(List<String> values) {
            addCriterion("upman in", values, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanNotIn(List<String> values) {
            addCriterion("upman not in", values, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanBetween(String value1, String value2) {
            addCriterion("upman between", value1, value2, "upman");
            return (Criteria) this;
        }

        public Criteria andUpmanNotBetween(String value1, String value2) {
            addCriterion("upman not between", value1, value2, "upman");
            return (Criteria) this;
        }

        public Criteria andPasstimeIsNull() {
            addCriterion("passtime is null");
            return (Criteria) this;
        }

        public Criteria andPasstimeIsNotNull() {
            addCriterion("passtime is not null");
            return (Criteria) this;
        }

        public Criteria andPasstimeEqualTo(Integer value) {
            addCriterion("passtime =", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotEqualTo(Integer value) {
            addCriterion("passtime <>", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeGreaterThan(Integer value) {
            addCriterion("passtime >", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("passtime >=", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeLessThan(Integer value) {
            addCriterion("passtime <", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeLessThanOrEqualTo(Integer value) {
            addCriterion("passtime <=", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeIn(List<Integer> values) {
            addCriterion("passtime in", values, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotIn(List<Integer> values) {
            addCriterion("passtime not in", values, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeBetween(Integer value1, Integer value2) {
            addCriterion("passtime between", value1, value2, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("passtime not between", value1, value2, "passtime");
            return (Criteria) this;
        }

        public Criteria andPassmanIsNull() {
            addCriterion("passman is null");
            return (Criteria) this;
        }

        public Criteria andPassmanIsNotNull() {
            addCriterion("passman is not null");
            return (Criteria) this;
        }

        public Criteria andPassmanEqualTo(String value) {
            addCriterion("passman =", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanNotEqualTo(String value) {
            addCriterion("passman <>", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanGreaterThan(String value) {
            addCriterion("passman >", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanGreaterThanOrEqualTo(String value) {
            addCriterion("passman >=", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanLessThan(String value) {
            addCriterion("passman <", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanLessThanOrEqualTo(String value) {
            addCriterion("passman <=", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanLike(String value) {
            addCriterion("passman like", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanNotLike(String value) {
            addCriterion("passman not like", value, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanIn(List<String> values) {
            addCriterion("passman in", values, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanNotIn(List<String> values) {
            addCriterion("passman not in", values, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanBetween(String value1, String value2) {
            addCriterion("passman between", value1, value2, "passman");
            return (Criteria) this;
        }

        public Criteria andPassmanNotBetween(String value1, String value2) {
            addCriterion("passman not between", value1, value2, "passman");
            return (Criteria) this;
        }

        public Criteria andPositionLngIsNull() {
            addCriterion("position_lng is null");
            return (Criteria) this;
        }

        public Criteria andPositionLngIsNotNull() {
            addCriterion("position_lng is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLngEqualTo(Double value) {
            addCriterion("position_lng =", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotEqualTo(Double value) {
            addCriterion("position_lng <>", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngGreaterThan(Double value) {
            addCriterion("position_lng >", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngGreaterThanOrEqualTo(Double value) {
            addCriterion("position_lng >=", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngLessThan(Double value) {
            addCriterion("position_lng <", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngLessThanOrEqualTo(Double value) {
            addCriterion("position_lng <=", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngIn(List<Double> values) {
            addCriterion("position_lng in", values, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotIn(List<Double> values) {
            addCriterion("position_lng not in", values, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngBetween(Double value1, Double value2) {
            addCriterion("position_lng between", value1, value2, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotBetween(Double value1, Double value2) {
            addCriterion("position_lng not between", value1, value2, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLatIsNull() {
            addCriterion("position_lat is null");
            return (Criteria) this;
        }

        public Criteria andPositionLatIsNotNull() {
            addCriterion("position_lat is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLatEqualTo(Double value) {
            addCriterion("position_lat =", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotEqualTo(Double value) {
            addCriterion("position_lat <>", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatGreaterThan(Double value) {
            addCriterion("position_lat >", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatGreaterThanOrEqualTo(Double value) {
            addCriterion("position_lat >=", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatLessThan(Double value) {
            addCriterion("position_lat <", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatLessThanOrEqualTo(Double value) {
            addCriterion("position_lat <=", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatIn(List<Double> values) {
            addCriterion("position_lat in", values, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotIn(List<Double> values) {
            addCriterion("position_lat not in", values, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatBetween(Double value1, Double value2) {
            addCriterion("position_lat between", value1, value2, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotBetween(Double value1, Double value2) {
            addCriterion("position_lat not between", value1, value2, "positionLat");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeIsNull() {
            addCriterion("expiration_time is null");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeIsNotNull() {
            addCriterion("expiration_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeEqualTo(Long value) {
            addCriterion("expiration_time =", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeNotEqualTo(Long value) {
            addCriterion("expiration_time <>", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeGreaterThan(Long value) {
            addCriterion("expiration_time >", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("expiration_time >=", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeLessThan(Long value) {
            addCriterion("expiration_time <", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeLessThanOrEqualTo(Long value) {
            addCriterion("expiration_time <=", value, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeIn(List<Long> values) {
            addCriterion("expiration_time in", values, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeNotIn(List<Long> values) {
            addCriterion("expiration_time not in", values, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeBetween(Long value1, Long value2) {
            addCriterion("expiration_time between", value1, value2, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andExpirationTimeNotBetween(Long value1, Long value2) {
            addCriterion("expiration_time not between", value1, value2, "expirationTime");
            return (Criteria) this;
        }

        public Criteria andParkingNumIsNull() {
            addCriterion("parking_num is null");
            return (Criteria) this;
        }

        public Criteria andParkingNumIsNotNull() {
            addCriterion("parking_num is not null");
            return (Criteria) this;
        }

        public Criteria andParkingNumEqualTo(Integer value) {
            addCriterion("parking_num =", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumNotEqualTo(Integer value) {
            addCriterion("parking_num <>", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumGreaterThan(Integer value) {
            addCriterion("parking_num >", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_num >=", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumLessThan(Integer value) {
            addCriterion("parking_num <", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumLessThanOrEqualTo(Integer value) {
            addCriterion("parking_num <=", value, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumIn(List<Integer> values) {
            addCriterion("parking_num in", values, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumNotIn(List<Integer> values) {
            addCriterion("parking_num not in", values, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumBetween(Integer value1, Integer value2) {
            addCriterion("parking_num between", value1, value2, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_num not between", value1, value2, "parkingNum");
            return (Criteria) this;
        }

        public Criteria andParkingPriceIsNull() {
            addCriterion("parking_price is null");
            return (Criteria) this;
        }

        public Criteria andParkingPriceIsNotNull() {
            addCriterion("parking_price is not null");
            return (Criteria) this;
        }

        public Criteria andParkingPriceEqualTo(String value) {
            addCriterion("parking_price =", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceNotEqualTo(String value) {
            addCriterion("parking_price <>", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceGreaterThan(String value) {
            addCriterion("parking_price >", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceGreaterThanOrEqualTo(String value) {
            addCriterion("parking_price >=", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceLessThan(String value) {
            addCriterion("parking_price <", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceLessThanOrEqualTo(String value) {
            addCriterion("parking_price <=", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceLike(String value) {
            addCriterion("parking_price like", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceNotLike(String value) {
            addCriterion("parking_price not like", value, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceIn(List<String> values) {
            addCriterion("parking_price in", values, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceNotIn(List<String> values) {
            addCriterion("parking_price not in", values, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceBetween(String value1, String value2) {
            addCriterion("parking_price between", value1, value2, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andParkingPriceNotBetween(String value1, String value2) {
            addCriterion("parking_price not between", value1, value2, "parkingPrice");
            return (Criteria) this;
        }

        public Criteria andCoverNumIsNull() {
            addCriterion("cover_num is null");
            return (Criteria) this;
        }

        public Criteria andCoverNumIsNotNull() {
            addCriterion("cover_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoverNumEqualTo(Integer value) {
            addCriterion("cover_num =", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumNotEqualTo(Integer value) {
            addCriterion("cover_num <>", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumGreaterThan(Integer value) {
            addCriterion("cover_num >", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cover_num >=", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumLessThan(Integer value) {
            addCriterion("cover_num <", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumLessThanOrEqualTo(Integer value) {
            addCriterion("cover_num <=", value, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumIn(List<Integer> values) {
            addCriterion("cover_num in", values, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumNotIn(List<Integer> values) {
            addCriterion("cover_num not in", values, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumBetween(Integer value1, Integer value2) {
            addCriterion("cover_num between", value1, value2, "coverNum");
            return (Criteria) this;
        }

        public Criteria andCoverNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cover_num not between", value1, value2, "coverNum");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNull() {
            addCriterion("network_type is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNotNull() {
            addCriterion("network_type is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeEqualTo(String value) {
            addCriterion("network_type =", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotEqualTo(String value) {
            addCriterion("network_type <>", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThan(String value) {
            addCriterion("network_type >", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("network_type >=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThan(String value) {
            addCriterion("network_type <", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThanOrEqualTo(String value) {
            addCriterion("network_type <=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLike(String value) {
            addCriterion("network_type like", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotLike(String value) {
            addCriterion("network_type not like", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIn(List<String> values) {
            addCriterion("network_type in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotIn(List<String> values) {
            addCriterion("network_type not in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeBetween(String value1, String value2) {
            addCriterion("network_type between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotBetween(String value1, String value2) {
            addCriterion("network_type not between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIsNull() {
            addCriterion("elevator_num is null");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIsNotNull() {
            addCriterion("elevator_num is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorNumEqualTo(Integer value) {
            addCriterion("elevator_num =", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotEqualTo(Integer value) {
            addCriterion("elevator_num <>", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumGreaterThan(Integer value) {
            addCriterion("elevator_num >", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("elevator_num >=", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumLessThan(Integer value) {
            addCriterion("elevator_num <", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumLessThanOrEqualTo(Integer value) {
            addCriterion("elevator_num <=", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIn(List<Integer> values) {
            addCriterion("elevator_num in", values, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotIn(List<Integer> values) {
            addCriterion("elevator_num not in", values, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumBetween(Integer value1, Integer value2) {
            addCriterion("elevator_num between", value1, value2, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("elevator_num not between", value1, value2, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andMinStoreyIsNull() {
            addCriterion("min_storey is null");
            return (Criteria) this;
        }

        public Criteria andMinStoreyIsNotNull() {
            addCriterion("min_storey is not null");
            return (Criteria) this;
        }

        public Criteria andMinStoreyEqualTo(Integer value) {
            addCriterion("min_storey =", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyNotEqualTo(Integer value) {
            addCriterion("min_storey <>", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyGreaterThan(Integer value) {
            addCriterion("min_storey >", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_storey >=", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyLessThan(Integer value) {
            addCriterion("min_storey <", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyLessThanOrEqualTo(Integer value) {
            addCriterion("min_storey <=", value, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyIn(List<Integer> values) {
            addCriterion("min_storey in", values, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyNotIn(List<Integer> values) {
            addCriterion("min_storey not in", values, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyBetween(Integer value1, Integer value2) {
            addCriterion("min_storey between", value1, value2, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMinStoreyNotBetween(Integer value1, Integer value2) {
            addCriterion("min_storey not between", value1, value2, "minStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyIsNull() {
            addCriterion("max_storey is null");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyIsNotNull() {
            addCriterion("max_storey is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyEqualTo(Integer value) {
            addCriterion("max_storey =", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyNotEqualTo(Integer value) {
            addCriterion("max_storey <>", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyGreaterThan(Integer value) {
            addCriterion("max_storey >", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_storey >=", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyLessThan(Integer value) {
            addCriterion("max_storey <", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyLessThanOrEqualTo(Integer value) {
            addCriterion("max_storey <=", value, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyIn(List<Integer> values) {
            addCriterion("max_storey in", values, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyNotIn(List<Integer> values) {
            addCriterion("max_storey not in", values, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyBetween(Integer value1, Integer value2) {
            addCriterion("max_storey between", value1, value2, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andMaxStoreyNotBetween(Integer value1, Integer value2) {
            addCriterion("max_storey not between", value1, value2, "maxStorey");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIsNull() {
            addCriterion("total_people is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIsNotNull() {
            addCriterion("total_people is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleEqualTo(Integer value) {
            addCriterion("total_people =", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotEqualTo(Integer value) {
            addCriterion("total_people <>", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleGreaterThan(Integer value) {
            addCriterion("total_people >", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_people >=", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleLessThan(Integer value) {
            addCriterion("total_people <", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("total_people <=", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIn(List<Integer> values) {
            addCriterion("total_people in", values, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotIn(List<Integer> values) {
            addCriterion("total_people not in", values, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleBetween(Integer value1, Integer value2) {
            addCriterion("total_people between", value1, value2, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("total_people not between", value1, value2, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIsNull() {
            addCriterion("enterprise_num is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIsNotNull() {
            addCriterion("enterprise_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumEqualTo(Integer value) {
            addCriterion("enterprise_num =", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotEqualTo(Integer value) {
            addCriterion("enterprise_num <>", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumGreaterThan(Integer value) {
            addCriterion("enterprise_num >", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_num >=", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumLessThan(Integer value) {
            addCriterion("enterprise_num <", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_num <=", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIn(List<Integer> values) {
            addCriterion("enterprise_num in", values, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotIn(List<Integer> values) {
            addCriterion("enterprise_num not in", values, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_num between", value1, value2, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_num not between", value1, value2, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateIsNull() {
            addCriterion("visitors_flowrate is null");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateIsNotNull() {
            addCriterion("visitors_flowrate is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateEqualTo(Integer value) {
            addCriterion("visitors_flowrate =", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateNotEqualTo(Integer value) {
            addCriterion("visitors_flowrate <>", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateGreaterThan(Integer value) {
            addCriterion("visitors_flowrate >", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitors_flowrate >=", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateLessThan(Integer value) {
            addCriterion("visitors_flowrate <", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateLessThanOrEqualTo(Integer value) {
            addCriterion("visitors_flowrate <=", value, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateIn(List<Integer> values) {
            addCriterion("visitors_flowrate in", values, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateNotIn(List<Integer> values) {
            addCriterion("visitors_flowrate not in", values, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateBetween(Integer value1, Integer value2) {
            addCriterion("visitors_flowrate between", value1, value2, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andVisitorsFlowrateNotBetween(Integer value1, Integer value2) {
            addCriterion("visitors_flowrate not between", value1, value2, "visitorsFlowrate");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceIsNull() {
            addCriterion("bo_up_price is null");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceIsNotNull() {
            addCriterion("bo_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceEqualTo(String value) {
            addCriterion("bo_up_price =", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceNotEqualTo(String value) {
            addCriterion("bo_up_price <>", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceGreaterThan(String value) {
            addCriterion("bo_up_price >", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceGreaterThanOrEqualTo(String value) {
            addCriterion("bo_up_price >=", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceLessThan(String value) {
            addCriterion("bo_up_price <", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceLessThanOrEqualTo(String value) {
            addCriterion("bo_up_price <=", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceLike(String value) {
            addCriterion("bo_up_price like", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceNotLike(String value) {
            addCriterion("bo_up_price not like", value, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceIn(List<String> values) {
            addCriterion("bo_up_price in", values, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceNotIn(List<String> values) {
            addCriterion("bo_up_price not in", values, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceBetween(String value1, String value2) {
            addCriterion("bo_up_price between", value1, value2, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoUpPriceNotBetween(String value1, String value2) {
            addCriterion("bo_up_price not between", value1, value2, "boUpPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceIsNull() {
            addCriterion("bo_down_price is null");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceIsNotNull() {
            addCriterion("bo_down_price is not null");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceEqualTo(String value) {
            addCriterion("bo_down_price =", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceNotEqualTo(String value) {
            addCriterion("bo_down_price <>", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceGreaterThan(String value) {
            addCriterion("bo_down_price >", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceGreaterThanOrEqualTo(String value) {
            addCriterion("bo_down_price >=", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceLessThan(String value) {
            addCriterion("bo_down_price <", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceLessThanOrEqualTo(String value) {
            addCriterion("bo_down_price <=", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceLike(String value) {
            addCriterion("bo_down_price like", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceNotLike(String value) {
            addCriterion("bo_down_price not like", value, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceIn(List<String> values) {
            addCriterion("bo_down_price in", values, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceNotIn(List<String> values) {
            addCriterion("bo_down_price not in", values, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceBetween(String value1, String value2) {
            addCriterion("bo_down_price between", value1, value2, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andBoDownPriceNotBetween(String value1, String value2) {
            addCriterion("bo_down_price not between", value1, value2, "boDownPrice");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(String value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(String value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(String value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(String value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(String value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(String value) {
            addCriterion("sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(String value) {
            addCriterion("sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<String> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<String> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(String value1, String value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(String value1, String value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNull() {
            addCriterion("building_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNotNull() {
            addCriterion("building_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaEqualTo(Integer value) {
            addCriterion("building_area =", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotEqualTo(Integer value) {
            addCriterion("building_area <>", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThan(Integer value) {
            addCriterion("building_area >", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_area >=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThan(Integer value) {
            addCriterion("building_area <", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThanOrEqualTo(Integer value) {
            addCriterion("building_area <=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIn(List<Integer> values) {
            addCriterion("building_area in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotIn(List<Integer> values) {
            addCriterion("building_area not in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaBetween(Integer value1, Integer value2) {
            addCriterion("building_area between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("building_area not between", value1, value2, "buildingArea");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNull() {
            addCriterion("acreage is null");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNotNull() {
            addCriterion("acreage is not null");
            return (Criteria) this;
        }

        public Criteria andAcreageEqualTo(String value) {
            addCriterion("acreage =", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotEqualTo(String value) {
            addCriterion("acreage <>", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThan(String value) {
            addCriterion("acreage >", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThanOrEqualTo(String value) {
            addCriterion("acreage >=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThan(String value) {
            addCriterion("acreage <", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThanOrEqualTo(String value) {
            addCriterion("acreage <=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLike(String value) {
            addCriterion("acreage like", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotLike(String value) {
            addCriterion("acreage not like", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageIn(List<String> values) {
            addCriterion("acreage in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotIn(List<String> values) {
            addCriterion("acreage not in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageBetween(String value1, String value2) {
            addCriterion("acreage between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotBetween(String value1, String value2) {
            addCriterion("acreage not between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andCubageRateIsNull() {
            addCriterion("cubage_rate is null");
            return (Criteria) this;
        }

        public Criteria andCubageRateIsNotNull() {
            addCriterion("cubage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCubageRateEqualTo(String value) {
            addCriterion("cubage_rate =", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateNotEqualTo(String value) {
            addCriterion("cubage_rate <>", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateGreaterThan(String value) {
            addCriterion("cubage_rate >", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateGreaterThanOrEqualTo(String value) {
            addCriterion("cubage_rate >=", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateLessThan(String value) {
            addCriterion("cubage_rate <", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateLessThanOrEqualTo(String value) {
            addCriterion("cubage_rate <=", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateLike(String value) {
            addCriterion("cubage_rate like", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateNotLike(String value) {
            addCriterion("cubage_rate not like", value, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateIn(List<String> values) {
            addCriterion("cubage_rate in", values, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateNotIn(List<String> values) {
            addCriterion("cubage_rate not in", values, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateBetween(String value1, String value2) {
            addCriterion("cubage_rate between", value1, value2, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andCubageRateNotBetween(String value1, String value2) {
            addCriterion("cubage_rate not between", value1, value2, "cubageRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIsNull() {
            addCriterion("greening_rate is null");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIsNotNull() {
            addCriterion("greening_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGreeningRateEqualTo(String value) {
            addCriterion("greening_rate =", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotEqualTo(String value) {
            addCriterion("greening_rate <>", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateGreaterThan(String value) {
            addCriterion("greening_rate >", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateGreaterThanOrEqualTo(String value) {
            addCriterion("greening_rate >=", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateLessThan(String value) {
            addCriterion("greening_rate <", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateLessThanOrEqualTo(String value) {
            addCriterion("greening_rate <=", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateLike(String value) {
            addCriterion("greening_rate like", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotLike(String value) {
            addCriterion("greening_rate not like", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIn(List<String> values) {
            addCriterion("greening_rate in", values, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotIn(List<String> values) {
            addCriterion("greening_rate not in", values, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateBetween(String value1, String value2) {
            addCriterion("greening_rate between", value1, value2, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotBetween(String value1, String value2) {
            addCriterion("greening_rate not between", value1, value2, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNull() {
            addCriterion("building_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNotNull() {
            addCriterion("building_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeEqualTo(String value) {
            addCriterion("building_type =", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotEqualTo(String value) {
            addCriterion("building_type <>", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThan(String value) {
            addCriterion("building_type >", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("building_type >=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThan(String value) {
            addCriterion("building_type <", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThanOrEqualTo(String value) {
            addCriterion("building_type <=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLike(String value) {
            addCriterion("building_type like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotLike(String value) {
            addCriterion("building_type not like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIn(List<String> values) {
            addCriterion("building_type in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotIn(List<String> values) {
            addCriterion("building_type not in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeBetween(String value1, String value2) {
            addCriterion("building_type between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotBetween(String value1, String value2) {
            addCriterion("building_type not between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumIsNull() {
            addCriterion("overground_parking_num is null");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumIsNotNull() {
            addCriterion("overground_parking_num is not null");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumEqualTo(Integer value) {
            addCriterion("overground_parking_num =", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumNotEqualTo(Integer value) {
            addCriterion("overground_parking_num <>", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumGreaterThan(Integer value) {
            addCriterion("overground_parking_num >", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("overground_parking_num >=", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumLessThan(Integer value) {
            addCriterion("overground_parking_num <", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumLessThanOrEqualTo(Integer value) {
            addCriterion("overground_parking_num <=", value, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumIn(List<Integer> values) {
            addCriterion("overground_parking_num in", values, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumNotIn(List<Integer> values) {
            addCriterion("overground_parking_num not in", values, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumBetween(Integer value1, Integer value2) {
            addCriterion("overground_parking_num between", value1, value2, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andOvergroundParkingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("overground_parking_num not between", value1, value2, "overgroundParkingNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumIsNull() {
            addCriterion("charging_pile_num is null");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumIsNotNull() {
            addCriterion("charging_pile_num is not null");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumEqualTo(Integer value) {
            addCriterion("charging_pile_num =", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumNotEqualTo(Integer value) {
            addCriterion("charging_pile_num <>", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumGreaterThan(Integer value) {
            addCriterion("charging_pile_num >", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_pile_num >=", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumLessThan(Integer value) {
            addCriterion("charging_pile_num <", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumLessThanOrEqualTo(Integer value) {
            addCriterion("charging_pile_num <=", value, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumIn(List<Integer> values) {
            addCriterion("charging_pile_num in", values, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumNotIn(List<Integer> values) {
            addCriterion("charging_pile_num not in", values, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumBetween(Integer value1, Integer value2) {
            addCriterion("charging_pile_num between", value1, value2, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andChargingPileNumNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_pile_num not between", value1, value2, "chargingPileNum");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIsNull() {
            addCriterion("developer_name is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIsNotNull() {
            addCriterion("developer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameEqualTo(String value) {
            addCriterion("developer_name =", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotEqualTo(String value) {
            addCriterion("developer_name <>", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameGreaterThan(String value) {
            addCriterion("developer_name >", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameGreaterThanOrEqualTo(String value) {
            addCriterion("developer_name >=", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLessThan(String value) {
            addCriterion("developer_name <", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLessThanOrEqualTo(String value) {
            addCriterion("developer_name <=", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameLike(String value) {
            addCriterion("developer_name like", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotLike(String value) {
            addCriterion("developer_name not like", value, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameIn(List<String> values) {
            addCriterion("developer_name in", values, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotIn(List<String> values) {
            addCriterion("developer_name not in", values, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameBetween(String value1, String value2) {
            addCriterion("developer_name between", value1, value2, "developerName");
            return (Criteria) this;
        }

        public Criteria andDeveloperNameNotBetween(String value1, String value2) {
            addCriterion("developer_name not between", value1, value2, "developerName");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNull() {
            addCriterion("characteristic is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNotNull() {
            addCriterion("characteristic is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicEqualTo(String value) {
            addCriterion("characteristic =", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotEqualTo(String value) {
            addCriterion("characteristic <>", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThan(String value) {
            addCriterion("characteristic >", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThanOrEqualTo(String value) {
            addCriterion("characteristic >=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThan(String value) {
            addCriterion("characteristic <", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThanOrEqualTo(String value) {
            addCriterion("characteristic <=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLike(String value) {
            addCriterion("characteristic like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotLike(String value) {
            addCriterion("characteristic not like", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIn(List<String> values) {
            addCriterion("characteristic in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotIn(List<String> values) {
            addCriterion("characteristic not in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicBetween(String value1, String value2) {
            addCriterion("characteristic between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotBetween(String value1, String value2) {
            addCriterion("characteristic not between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("deal_date is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("deal_date is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Integer value) {
            addCriterion("deal_date =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Integer value) {
            addCriterion("deal_date <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Integer value) {
            addCriterion("deal_date >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_date >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Integer value) {
            addCriterion("deal_date <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Integer value) {
            addCriterion("deal_date <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Integer> values) {
            addCriterion("deal_date in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Integer> values) {
            addCriterion("deal_date not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Integer value1, Integer value2) {
            addCriterion("deal_date between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_date not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andMixImgIsNull() {
            addCriterion("mix_img is null");
            return (Criteria) this;
        }

        public Criteria andMixImgIsNotNull() {
            addCriterion("mix_img is not null");
            return (Criteria) this;
        }

        public Criteria andMixImgEqualTo(String value) {
            addCriterion("mix_img =", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgNotEqualTo(String value) {
            addCriterion("mix_img <>", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgGreaterThan(String value) {
            addCriterion("mix_img >", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgGreaterThanOrEqualTo(String value) {
            addCriterion("mix_img >=", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgLessThan(String value) {
            addCriterion("mix_img <", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgLessThanOrEqualTo(String value) {
            addCriterion("mix_img <=", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgLike(String value) {
            addCriterion("mix_img like", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgNotLike(String value) {
            addCriterion("mix_img not like", value, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgIn(List<String> values) {
            addCriterion("mix_img in", values, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgNotIn(List<String> values) {
            addCriterion("mix_img not in", values, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgBetween(String value1, String value2) {
            addCriterion("mix_img between", value1, value2, "mixImg");
            return (Criteria) this;
        }

        public Criteria andMixImgNotBetween(String value1, String value2) {
            addCriterion("mix_img not between", value1, value2, "mixImg");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameIsNull() {
            addCriterion("developers_name is null");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameIsNotNull() {
            addCriterion("developers_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameEqualTo(String value) {
            addCriterion("developers_name =", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameNotEqualTo(String value) {
            addCriterion("developers_name <>", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameGreaterThan(String value) {
            addCriterion("developers_name >", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameGreaterThanOrEqualTo(String value) {
            addCriterion("developers_name >=", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameLessThan(String value) {
            addCriterion("developers_name <", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameLessThanOrEqualTo(String value) {
            addCriterion("developers_name <=", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameLike(String value) {
            addCriterion("developers_name like", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameNotLike(String value) {
            addCriterion("developers_name not like", value, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameIn(List<String> values) {
            addCriterion("developers_name in", values, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameNotIn(List<String> values) {
            addCriterion("developers_name not in", values, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameBetween(String value1, String value2) {
            addCriterion("developers_name between", value1, value2, "developersName");
            return (Criteria) this;
        }

        public Criteria andDevelopersNameNotBetween(String value1, String value2) {
            addCriterion("developers_name not between", value1, value2, "developersName");
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