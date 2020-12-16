package com.macro.mall.malllearning.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UdcHousesCustomerExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UdcHousesCustomerExtExample() {
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

        public Criteria andDcIdIsNull() {
            addCriterion("dc_id is null");
            return (Criteria) this;
        }

        public Criteria andDcIdIsNotNull() {
            addCriterion("dc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDcIdEqualTo(Integer value) {
            addCriterion("dc_id =", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotEqualTo(Integer value) {
            addCriterion("dc_id <>", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThan(Integer value) {
            addCriterion("dc_id >", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dc_id >=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThan(Integer value) {
            addCriterion("dc_id <", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThanOrEqualTo(Integer value) {
            addCriterion("dc_id <=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdIn(List<Integer> values) {
            addCriterion("dc_id in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotIn(List<Integer> values) {
            addCriterion("dc_id not in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdBetween(Integer value1, Integer value2) {
            addCriterion("dc_id between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dc_id not between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andCstGuidIsNull() {
            addCriterion("cst_guid is null");
            return (Criteria) this;
        }

        public Criteria andCstGuidIsNotNull() {
            addCriterion("cst_guid is not null");
            return (Criteria) this;
        }

        public Criteria andCstGuidEqualTo(String value) {
            addCriterion("cst_guid =", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidNotEqualTo(String value) {
            addCriterion("cst_guid <>", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidGreaterThan(String value) {
            addCriterion("cst_guid >", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidGreaterThanOrEqualTo(String value) {
            addCriterion("cst_guid >=", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidLessThan(String value) {
            addCriterion("cst_guid <", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidLessThanOrEqualTo(String value) {
            addCriterion("cst_guid <=", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidLike(String value) {
            addCriterion("cst_guid like", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidNotLike(String value) {
            addCriterion("cst_guid not like", value, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidIn(List<String> values) {
            addCriterion("cst_guid in", values, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidNotIn(List<String> values) {
            addCriterion("cst_guid not in", values, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidBetween(String value1, String value2) {
            addCriterion("cst_guid between", value1, value2, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstGuidNotBetween(String value1, String value2) {
            addCriterion("cst_guid not between", value1, value2, "cstGuid");
            return (Criteria) this;
        }

        public Criteria andCstNameIsNull() {
            addCriterion("cst_name is null");
            return (Criteria) this;
        }

        public Criteria andCstNameIsNotNull() {
            addCriterion("cst_name is not null");
            return (Criteria) this;
        }

        public Criteria andCstNameEqualTo(String value) {
            addCriterion("cst_name =", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotEqualTo(String value) {
            addCriterion("cst_name <>", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameGreaterThan(String value) {
            addCriterion("cst_name >", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameGreaterThanOrEqualTo(String value) {
            addCriterion("cst_name >=", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLessThan(String value) {
            addCriterion("cst_name <", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLessThanOrEqualTo(String value) {
            addCriterion("cst_name <=", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLike(String value) {
            addCriterion("cst_name like", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotLike(String value) {
            addCriterion("cst_name not like", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameIn(List<String> values) {
            addCriterion("cst_name in", values, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotIn(List<String> values) {
            addCriterion("cst_name not in", values, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameBetween(String value1, String value2) {
            addCriterion("cst_name between", value1, value2, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotBetween(String value1, String value2) {
            addCriterion("cst_name not between", value1, value2, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstTelIsNull() {
            addCriterion("cst_tel is null");
            return (Criteria) this;
        }

        public Criteria andCstTelIsNotNull() {
            addCriterion("cst_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCstTelEqualTo(String value) {
            addCriterion("cst_tel =", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelNotEqualTo(String value) {
            addCriterion("cst_tel <>", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelGreaterThan(String value) {
            addCriterion("cst_tel >", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelGreaterThanOrEqualTo(String value) {
            addCriterion("cst_tel >=", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelLessThan(String value) {
            addCriterion("cst_tel <", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelLessThanOrEqualTo(String value) {
            addCriterion("cst_tel <=", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelLike(String value) {
            addCriterion("cst_tel like", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelNotLike(String value) {
            addCriterion("cst_tel not like", value, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelIn(List<String> values) {
            addCriterion("cst_tel in", values, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelNotIn(List<String> values) {
            addCriterion("cst_tel not in", values, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelBetween(String value1, String value2) {
            addCriterion("cst_tel between", value1, value2, "cstTel");
            return (Criteria) this;
        }

        public Criteria andCstTelNotBetween(String value1, String value2) {
            addCriterion("cst_tel not between", value1, value2, "cstTel");
            return (Criteria) this;
        }

        public Criteria andProjCodeIsNull() {
            addCriterion("proj_code is null");
            return (Criteria) this;
        }

        public Criteria andProjCodeIsNotNull() {
            addCriterion("proj_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjCodeEqualTo(String value) {
            addCriterion("proj_code =", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeNotEqualTo(String value) {
            addCriterion("proj_code <>", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeGreaterThan(String value) {
            addCriterion("proj_code >", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("proj_code >=", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeLessThan(String value) {
            addCriterion("proj_code <", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeLessThanOrEqualTo(String value) {
            addCriterion("proj_code <=", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeLike(String value) {
            addCriterion("proj_code like", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeNotLike(String value) {
            addCriterion("proj_code not like", value, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeIn(List<String> values) {
            addCriterion("proj_code in", values, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeNotIn(List<String> values) {
            addCriterion("proj_code not in", values, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeBetween(String value1, String value2) {
            addCriterion("proj_code between", value1, value2, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjCodeNotBetween(String value1, String value2) {
            addCriterion("proj_code not between", value1, value2, "projCode");
            return (Criteria) this;
        }

        public Criteria andProjGuidIsNull() {
            addCriterion("proj_guid is null");
            return (Criteria) this;
        }

        public Criteria andProjGuidIsNotNull() {
            addCriterion("proj_guid is not null");
            return (Criteria) this;
        }

        public Criteria andProjGuidEqualTo(String value) {
            addCriterion("proj_guid =", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidNotEqualTo(String value) {
            addCriterion("proj_guid <>", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidGreaterThan(String value) {
            addCriterion("proj_guid >", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidGreaterThanOrEqualTo(String value) {
            addCriterion("proj_guid >=", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidLessThan(String value) {
            addCriterion("proj_guid <", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidLessThanOrEqualTo(String value) {
            addCriterion("proj_guid <=", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidLike(String value) {
            addCriterion("proj_guid like", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidNotLike(String value) {
            addCriterion("proj_guid not like", value, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidIn(List<String> values) {
            addCriterion("proj_guid in", values, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidNotIn(List<String> values) {
            addCriterion("proj_guid not in", values, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidBetween(String value1, String value2) {
            addCriterion("proj_guid between", value1, value2, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjGuidNotBetween(String value1, String value2) {
            addCriterion("proj_guid not between", value1, value2, "projGuid");
            return (Criteria) this;
        }

        public Criteria andProjNameIsNull() {
            addCriterion("proj_name is null");
            return (Criteria) this;
        }

        public Criteria andProjNameIsNotNull() {
            addCriterion("proj_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjNameEqualTo(String value) {
            addCriterion("proj_name =", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotEqualTo(String value) {
            addCriterion("proj_name <>", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameGreaterThan(String value) {
            addCriterion("proj_name >", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameGreaterThanOrEqualTo(String value) {
            addCriterion("proj_name >=", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLessThan(String value) {
            addCriterion("proj_name <", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLessThanOrEqualTo(String value) {
            addCriterion("proj_name <=", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLike(String value) {
            addCriterion("proj_name like", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotLike(String value) {
            addCriterion("proj_name not like", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameIn(List<String> values) {
            addCriterion("proj_name in", values, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotIn(List<String> values) {
            addCriterion("proj_name not in", values, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameBetween(String value1, String value2) {
            addCriterion("proj_name between", value1, value2, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotBetween(String value1, String value2) {
            addCriterion("proj_name not between", value1, value2, "projName");
            return (Criteria) this;
        }

        public Criteria andStageCodeIsNull() {
            addCriterion("stage_code is null");
            return (Criteria) this;
        }

        public Criteria andStageCodeIsNotNull() {
            addCriterion("stage_code is not null");
            return (Criteria) this;
        }

        public Criteria andStageCodeEqualTo(String value) {
            addCriterion("stage_code =", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotEqualTo(String value) {
            addCriterion("stage_code <>", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeGreaterThan(String value) {
            addCriterion("stage_code >", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stage_code >=", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeLessThan(String value) {
            addCriterion("stage_code <", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeLessThanOrEqualTo(String value) {
            addCriterion("stage_code <=", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeLike(String value) {
            addCriterion("stage_code like", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotLike(String value) {
            addCriterion("stage_code not like", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeIn(List<String> values) {
            addCriterion("stage_code in", values, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotIn(List<String> values) {
            addCriterion("stage_code not in", values, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeBetween(String value1, String value2) {
            addCriterion("stage_code between", value1, value2, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotBetween(String value1, String value2) {
            addCriterion("stage_code not between", value1, value2, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageGuidIsNull() {
            addCriterion("stage_guid is null");
            return (Criteria) this;
        }

        public Criteria andStageGuidIsNotNull() {
            addCriterion("stage_guid is not null");
            return (Criteria) this;
        }

        public Criteria andStageGuidEqualTo(String value) {
            addCriterion("stage_guid =", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidNotEqualTo(String value) {
            addCriterion("stage_guid <>", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidGreaterThan(String value) {
            addCriterion("stage_guid >", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidGreaterThanOrEqualTo(String value) {
            addCriterion("stage_guid >=", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidLessThan(String value) {
            addCriterion("stage_guid <", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidLessThanOrEqualTo(String value) {
            addCriterion("stage_guid <=", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidLike(String value) {
            addCriterion("stage_guid like", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidNotLike(String value) {
            addCriterion("stage_guid not like", value, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidIn(List<String> values) {
            addCriterion("stage_guid in", values, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidNotIn(List<String> values) {
            addCriterion("stage_guid not in", values, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidBetween(String value1, String value2) {
            addCriterion("stage_guid between", value1, value2, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageGuidNotBetween(String value1, String value2) {
            addCriterion("stage_guid not between", value1, value2, "stageGuid");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNull() {
            addCriterion("stage_name is null");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNotNull() {
            addCriterion("stage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStageNameEqualTo(String value) {
            addCriterion("stage_name =", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotEqualTo(String value) {
            addCriterion("stage_name <>", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThan(String value) {
            addCriterion("stage_name >", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("stage_name >=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThan(String value) {
            addCriterion("stage_name <", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThanOrEqualTo(String value) {
            addCriterion("stage_name <=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLike(String value) {
            addCriterion("stage_name like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotLike(String value) {
            addCriterion("stage_name not like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameIn(List<String> values) {
            addCriterion("stage_name in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotIn(List<String> values) {
            addCriterion("stage_name not in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameBetween(String value1, String value2) {
            addCriterion("stage_name between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotBetween(String value1, String value2) {
            addCriterion("stage_name not between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andOppGuidIsNull() {
            addCriterion("opp_guid is null");
            return (Criteria) this;
        }

        public Criteria andOppGuidIsNotNull() {
            addCriterion("opp_guid is not null");
            return (Criteria) this;
        }

        public Criteria andOppGuidEqualTo(String value) {
            addCriterion("opp_guid =", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidNotEqualTo(String value) {
            addCriterion("opp_guid <>", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidGreaterThan(String value) {
            addCriterion("opp_guid >", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidGreaterThanOrEqualTo(String value) {
            addCriterion("opp_guid >=", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidLessThan(String value) {
            addCriterion("opp_guid <", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidLessThanOrEqualTo(String value) {
            addCriterion("opp_guid <=", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidLike(String value) {
            addCriterion("opp_guid like", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidNotLike(String value) {
            addCriterion("opp_guid not like", value, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidIn(List<String> values) {
            addCriterion("opp_guid in", values, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidNotIn(List<String> values) {
            addCriterion("opp_guid not in", values, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidBetween(String value1, String value2) {
            addCriterion("opp_guid between", value1, value2, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andOppGuidNotBetween(String value1, String value2) {
            addCriterion("opp_guid not between", value1, value2, "oppGuid");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(String value) {
            addCriterion("sale_type =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(String value) {
            addCriterion("sale_type <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(String value) {
            addCriterion("sale_type >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(String value) {
            addCriterion("sale_type <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("sale_type <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLike(String value) {
            addCriterion("sale_type like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotLike(String value) {
            addCriterion("sale_type not like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<String> values) {
            addCriterion("sale_type in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<String> values) {
            addCriterion("sale_type not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(String value1, String value2) {
            addCriterion("sale_type between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(String value1, String value2) {
            addCriterion("sale_type not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(String value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(String value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(String value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(String value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(String value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLike(String value) {
            addCriterion("sale_status like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotLike(String value) {
            addCriterion("sale_status not like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<String> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<String> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(String value1, String value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(String value1, String value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andIsMockIsNull() {
            addCriterion("is_mock is null");
            return (Criteria) this;
        }

        public Criteria andIsMockIsNotNull() {
            addCriterion("is_mock is not null");
            return (Criteria) this;
        }

        public Criteria andIsMockEqualTo(Integer value) {
            addCriterion("is_mock =", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockNotEqualTo(Integer value) {
            addCriterion("is_mock <>", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockGreaterThan(Integer value) {
            addCriterion("is_mock >", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mock >=", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockLessThan(Integer value) {
            addCriterion("is_mock <", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockLessThanOrEqualTo(Integer value) {
            addCriterion("is_mock <=", value, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockIn(List<Integer> values) {
            addCriterion("is_mock in", values, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockNotIn(List<Integer> values) {
            addCriterion("is_mock not in", values, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockBetween(Integer value1, Integer value2) {
            addCriterion("is_mock between", value1, value2, "isMock");
            return (Criteria) this;
        }

        public Criteria andIsMockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mock not between", value1, value2, "isMock");
            return (Criteria) this;
        }

        public Criteria andGjGuidIsNull() {
            addCriterion("gj_guid is null");
            return (Criteria) this;
        }

        public Criteria andGjGuidIsNotNull() {
            addCriterion("gj_guid is not null");
            return (Criteria) this;
        }

        public Criteria andGjGuidEqualTo(String value) {
            addCriterion("gj_guid =", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidNotEqualTo(String value) {
            addCriterion("gj_guid <>", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidGreaterThan(String value) {
            addCriterion("gj_guid >", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidGreaterThanOrEqualTo(String value) {
            addCriterion("gj_guid >=", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidLessThan(String value) {
            addCriterion("gj_guid <", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidLessThanOrEqualTo(String value) {
            addCriterion("gj_guid <=", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidLike(String value) {
            addCriterion("gj_guid like", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidNotLike(String value) {
            addCriterion("gj_guid not like", value, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidIn(List<String> values) {
            addCriterion("gj_guid in", values, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidNotIn(List<String> values) {
            addCriterion("gj_guid not in", values, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidBetween(String value1, String value2) {
            addCriterion("gj_guid between", value1, value2, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjGuidNotBetween(String value1, String value2) {
            addCriterion("gj_guid not between", value1, value2, "gjGuid");
            return (Criteria) this;
        }

        public Criteria andGjDateIsNull() {
            addCriterion("gj_date is null");
            return (Criteria) this;
        }

        public Criteria andGjDateIsNotNull() {
            addCriterion("gj_date is not null");
            return (Criteria) this;
        }

        public Criteria andGjDateEqualTo(Date value) {
            addCriterion("gj_date =", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateNotEqualTo(Date value) {
            addCriterion("gj_date <>", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateGreaterThan(Date value) {
            addCriterion("gj_date >", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gj_date >=", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateLessThan(Date value) {
            addCriterion("gj_date <", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateLessThanOrEqualTo(Date value) {
            addCriterion("gj_date <=", value, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateIn(List<Date> values) {
            addCriterion("gj_date in", values, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateNotIn(List<Date> values) {
            addCriterion("gj_date not in", values, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateBetween(Date value1, Date value2) {
            addCriterion("gj_date between", value1, value2, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjDateNotBetween(Date value1, Date value2) {
            addCriterion("gj_date not between", value1, value2, "gjDate");
            return (Criteria) this;
        }

        public Criteria andGjfsIsNull() {
            addCriterion("gjfs is null");
            return (Criteria) this;
        }

        public Criteria andGjfsIsNotNull() {
            addCriterion("gjfs is not null");
            return (Criteria) this;
        }

        public Criteria andGjfsEqualTo(String value) {
            addCriterion("gjfs =", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsNotEqualTo(String value) {
            addCriterion("gjfs <>", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsGreaterThan(String value) {
            addCriterion("gjfs >", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsGreaterThanOrEqualTo(String value) {
            addCriterion("gjfs >=", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsLessThan(String value) {
            addCriterion("gjfs <", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsLessThanOrEqualTo(String value) {
            addCriterion("gjfs <=", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsLike(String value) {
            addCriterion("gjfs like", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsNotLike(String value) {
            addCriterion("gjfs not like", value, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsIn(List<String> values) {
            addCriterion("gjfs in", values, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsNotIn(List<String> values) {
            addCriterion("gjfs not in", values, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsBetween(String value1, String value2) {
            addCriterion("gjfs between", value1, value2, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjfsNotBetween(String value1, String value2) {
            addCriterion("gjfs not between", value1, value2, "gjfs");
            return (Criteria) this;
        }

        public Criteria andGjMemoIsNull() {
            addCriterion("gj_memo is null");
            return (Criteria) this;
        }

        public Criteria andGjMemoIsNotNull() {
            addCriterion("gj_memo is not null");
            return (Criteria) this;
        }

        public Criteria andGjMemoEqualTo(String value) {
            addCriterion("gj_memo =", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoNotEqualTo(String value) {
            addCriterion("gj_memo <>", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoGreaterThan(String value) {
            addCriterion("gj_memo >", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoGreaterThanOrEqualTo(String value) {
            addCriterion("gj_memo >=", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoLessThan(String value) {
            addCriterion("gj_memo <", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoLessThanOrEqualTo(String value) {
            addCriterion("gj_memo <=", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoLike(String value) {
            addCriterion("gj_memo like", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoNotLike(String value) {
            addCriterion("gj_memo not like", value, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoIn(List<String> values) {
            addCriterion("gj_memo in", values, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoNotIn(List<String> values) {
            addCriterion("gj_memo not in", values, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoBetween(String value1, String value2) {
            addCriterion("gj_memo between", value1, value2, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andGjMemoNotBetween(String value1, String value2) {
            addCriterion("gj_memo not between", value1, value2, "gjMemo");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNull() {
            addCriterion("datachange_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNotNull() {
            addCriterion("datachange_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeEqualTo(Date value) {
            addCriterion("datachange_lasttime =", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotEqualTo(Date value) {
            addCriterion("datachange_lasttime <>", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThan(Date value) {
            addCriterion("datachange_lasttime >", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datachange_lasttime >=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThan(Date value) {
            addCriterion("datachange_lasttime <", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("datachange_lasttime <=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIn(List<Date> values) {
            addCriterion("datachange_lasttime in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotIn(List<Date> values) {
            addCriterion("datachange_lasttime not in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeBetween(Date value1, Date value2) {
            addCriterion("datachange_lasttime between", value1, value2, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("datachange_lasttime not between", value1, value2, "datachangeLasttime");
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