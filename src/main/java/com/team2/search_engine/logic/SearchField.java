package com.team2.search_engine.logic;

// Predicate
public class SearchField {
    private final Class<?> type; // table
    private final String field; // type
    private final String operator; // operate
    private final String value; // target

    public SearchField(String type, String field, String operator, String value) {
        this.type = determineClassType(type);
        this.field = field;
        this.operator = operator;
        this.value = value;
    }


    public Class<?> determineClassType(String type) {
        return  Purchase_Order.class;
    }

    public Class<?> getType() {
        return this.type;
    }

    public String getField() {
        return this.field;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getValue() {
        return this.value;
    }
}
