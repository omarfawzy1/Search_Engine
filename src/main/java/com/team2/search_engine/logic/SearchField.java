package com.team2.search_engine.logic;

import com.team2.search_engine.data.entity.PurchaseOrder;

// Predicate
public class SearchField {
    private Class type; // table
    private String field; // type
    private String operator; // operate
    private String value; // target

    public SearchField(Class type, String field, String operator, String value){
        this.type=type;
        this.field=field;
        this.operator=operator;
        this.value=value;
    }

    public Class getType(){return this.type;}
    public String getField(){return this.field;}
    public String getOperator(){return this.operator;}
    public String getValue(){return this.value;}
}
