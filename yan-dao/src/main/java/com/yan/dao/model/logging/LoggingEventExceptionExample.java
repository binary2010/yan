package com.yan.dao.model.logging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoggingEventExceptionExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public LoggingEventExceptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andIIsNull() {
            addCriterion("i is null");
            return (Criteria) this;
        }

        public Criteria andIIsNotNull() {
            addCriterion("i is not null");
            return (Criteria) this;
        }

        public Criteria andIEqualTo(Short value) {
            addCriterion("i =", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotEqualTo(Short value) {
            addCriterion("i <>", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThan(Short value) {
            addCriterion("i >", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThanOrEqualTo(Short value) {
            addCriterion("i >=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThan(Short value) {
            addCriterion("i <", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThanOrEqualTo(Short value) {
            addCriterion("i <=", value, "i");
            return (Criteria) this;
        }

        public Criteria andIIn(List<Short> values) {
            addCriterion("i in", values, "i");
            return (Criteria) this;
        }

        public Criteria andINotIn(List<Short> values) {
            addCriterion("i not in", values, "i");
            return (Criteria) this;
        }

        public Criteria andIBetween(Short value1, Short value2) {
            addCriterion("i between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andINotBetween(Short value1, Short value2) {
            addCriterion("i not between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andTraceLineIsNull() {
            addCriterion("trace_line is null");
            return (Criteria) this;
        }

        public Criteria andTraceLineIsNotNull() {
            addCriterion("trace_line is not null");
            return (Criteria) this;
        }

        public Criteria andTraceLineEqualTo(String value) {
            addCriterion("trace_line =", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineNotEqualTo(String value) {
            addCriterion("trace_line <>", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineGreaterThan(String value) {
            addCriterion("trace_line >", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineGreaterThanOrEqualTo(String value) {
            addCriterion("trace_line >=", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineLessThan(String value) {
            addCriterion("trace_line <", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineLessThanOrEqualTo(String value) {
            addCriterion("trace_line <=", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineLike(String value) {
            addCriterion("trace_line like", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineNotLike(String value) {
            addCriterion("trace_line not like", value, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineIn(List<String> values) {
            addCriterion("trace_line in", values, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineNotIn(List<String> values) {
            addCriterion("trace_line not in", values, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineBetween(String value1, String value2) {
            addCriterion("trace_line between", value1, value2, "traceLine");
            return (Criteria) this;
        }

        public Criteria andTraceLineNotBetween(String value1, String value2) {
            addCriterion("trace_line not between", value1, value2, "traceLine");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table logging_event_exception
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 07 16:05:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table logging_event_exception
     *
     * @mbg.generated Wed Feb 07 16:05:59 CST 2018
     */
    public static class Criterion implements Serializable {
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