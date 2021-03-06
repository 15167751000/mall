package cn.dnaizn.mall.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransfersListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransfersListExample() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdIsNull() {
            addCriterion("transfers_id is null");
            return (Criteria) this;
        }

        public Criteria andTransfersIdIsNotNull() {
            addCriterion("transfers_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransfersIdEqualTo(String value) {
            addCriterion("transfers_id =", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdNotEqualTo(String value) {
            addCriterion("transfers_id <>", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdGreaterThan(String value) {
            addCriterion("transfers_id >", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdGreaterThanOrEqualTo(String value) {
            addCriterion("transfers_id >=", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdLessThan(String value) {
            addCriterion("transfers_id <", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdLessThanOrEqualTo(String value) {
            addCriterion("transfers_id <=", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdLike(String value) {
            addCriterion("transfers_id like", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdNotLike(String value) {
            addCriterion("transfers_id not like", value, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdIn(List<String> values) {
            addCriterion("transfers_id in", values, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdNotIn(List<String> values) {
            addCriterion("transfers_id not in", values, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdBetween(String value1, String value2) {
            addCriterion("transfers_id between", value1, value2, "transfersId");
            return (Criteria) this;
        }

        public Criteria andTransfersIdNotBetween(String value1, String value2) {
            addCriterion("transfers_id not between", value1, value2, "transfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdIsNull() {
            addCriterion("wx_transfers_id is null");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdIsNotNull() {
            addCriterion("wx_transfers_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdEqualTo(String value) {
            addCriterion("wx_transfers_id =", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdNotEqualTo(String value) {
            addCriterion("wx_transfers_id <>", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdGreaterThan(String value) {
            addCriterion("wx_transfers_id >", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_transfers_id >=", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdLessThan(String value) {
            addCriterion("wx_transfers_id <", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdLessThanOrEqualTo(String value) {
            addCriterion("wx_transfers_id <=", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdLike(String value) {
            addCriterion("wx_transfers_id like", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdNotLike(String value) {
            addCriterion("wx_transfers_id not like", value, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdIn(List<String> values) {
            addCriterion("wx_transfers_id in", values, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdNotIn(List<String> values) {
            addCriterion("wx_transfers_id not in", values, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdBetween(String value1, String value2) {
            addCriterion("wx_transfers_id between", value1, value2, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andWxTransfersIdNotBetween(String value1, String value2) {
            addCriterion("wx_transfers_id not between", value1, value2, "wxTransfersId");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Integer value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Integer value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Integer value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Integer value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Integer value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Integer> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Integer> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Integer value1, Integer value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRFeeIsNull() {
            addCriterion("r_fee is null");
            return (Criteria) this;
        }

        public Criteria andRFeeIsNotNull() {
            addCriterion("r_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRFeeEqualTo(BigDecimal value) {
            addCriterion("r_fee =", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeNotEqualTo(BigDecimal value) {
            addCriterion("r_fee <>", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeGreaterThan(BigDecimal value) {
            addCriterion("r_fee >", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("r_fee >=", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeLessThan(BigDecimal value) {
            addCriterion("r_fee <", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("r_fee <=", value, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeIn(List<BigDecimal> values) {
            addCriterion("r_fee in", values, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeNotIn(List<BigDecimal> values) {
            addCriterion("r_fee not in", values, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("r_fee between", value1, value2, "rFee");
            return (Criteria) this;
        }

        public Criteria andRFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("r_fee not between", value1, value2, "rFee");
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