package com.team2.search_engine.logic;

// Predicate
public class SearchField {
    private Class type; // table
    private String field; // type
    private String operator; // operate
    private String value; // target

    public SearchField(String type, String field, String operator, String value){
        this.type = determineClassType(type);
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public SearchField() {

    }
    public Class determineClassType(String type){
        switch (type.toUpperCase()){
            case "PO":
                return new Purchase_Order().getClass();
            case "SO":
                return new Sales_Order().getClass();
        }
        return null;
    }

    public Class getType(){return this.type;}
    public String getField(){return this.field;}
    public String getOperator(){return this.operator;}
    public String getValue(){return this.value;}
}
