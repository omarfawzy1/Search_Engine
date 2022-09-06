package com.team2.search_engine.data.entity;

import javax.persistence.*;

@Entity
public class PurchaseOrder {
    public PurchaseOrder(){};
    public PurchaseOrder(String type, String vendor) {
        this.type = type;
        this.vendor = vendor;
    }

    public PurchaseOrder(String code,String type, String vendor, String RD, String BU, String state) {
        this.code = code;
        this.type = type;
        this.vendor = vendor;
        this.RD = RD;
        this.BU = BU;
        this.state = state;
    }

    @Id
    private String code;
    private String type;
    private String vendor;
    private String RD;
    private String BU;
    private String state;

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }

    public String getRD() {
        return RD;
    }

    public String getBU() {
        return BU;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s",code, type, vendor);
    }
}
