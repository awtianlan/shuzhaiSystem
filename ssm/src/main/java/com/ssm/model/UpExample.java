package com.ssm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(Object value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(Object value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(Object value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(Object value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(Object value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(Object value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<Object> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<Object> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(Object value1, Object value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(Object value1, Object value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andNridIsNull() {
            addCriterion("NRID is null");
            return (Criteria) this;
        }

        public Criteria andNridIsNotNull() {
            addCriterion("NRID is not null");
            return (Criteria) this;
        }

        public Criteria andNridEqualTo(BigDecimal value) {
            addCriterion("NRID =", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridNotEqualTo(BigDecimal value) {
            addCriterion("NRID <>", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridGreaterThan(BigDecimal value) {
            addCriterion("NRID >", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NRID >=", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridLessThan(BigDecimal value) {
            addCriterion("NRID <", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NRID <=", value, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridIn(List<BigDecimal> values) {
            addCriterion("NRID in", values, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridNotIn(List<BigDecimal> values) {
            addCriterion("NRID not in", values, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NRID between", value1, value2, "nrid");
            return (Criteria) this;
        }

        public Criteria andNridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NRID not between", value1, value2, "nrid");
            return (Criteria) this;
        }

        public Criteria andNrridIsNull() {
            addCriterion("NRRID is null");
            return (Criteria) this;
        }

        public Criteria andNrridIsNotNull() {
            addCriterion("NRRID is not null");
            return (Criteria) this;
        }

        public Criteria andNrridEqualTo(BigDecimal value) {
            addCriterion("NRRID =", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridNotEqualTo(BigDecimal value) {
            addCriterion("NRRID <>", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridGreaterThan(BigDecimal value) {
            addCriterion("NRRID >", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NRRID >=", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridLessThan(BigDecimal value) {
            addCriterion("NRRID <", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NRRID <=", value, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridIn(List<BigDecimal> values) {
            addCriterion("NRRID in", values, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridNotIn(List<BigDecimal> values) {
            addCriterion("NRRID not in", values, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NRRID between", value1, value2, "nrrid");
            return (Criteria) this;
        }

        public Criteria andNrridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NRRID not between", value1, value2, "nrrid");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("EID is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("EID is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(BigDecimal value) {
            addCriterion("EID =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(BigDecimal value) {
            addCriterion("EID <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(BigDecimal value) {
            addCriterion("EID >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EID >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(BigDecimal value) {
            addCriterion("EID <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EID <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<BigDecimal> values) {
            addCriterion("EID in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<BigDecimal> values) {
            addCriterion("EID not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EID between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EID not between", value1, value2, "eid");
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