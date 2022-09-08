package com.team2.search_engine.data.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PurchaseOrder {
    public PurchaseOrder(){};
    public PurchaseOrder(String type, String vendor) {
        this.type = type;
        this.vendor = vendor;
    }

    public PurchaseOrder(String code,String type, String vendor, String rd, String bu, String state) {
        this.code = code;
        this.type = type;
        this.vendor = vendor;
        this.rd = rd;
        this.bu = bu;
        this.state = state;
    }

    @Id
    private String code;
    private String type;
    private String vendor;
    private String rd;
    private String bu;
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
        return rd;
    }

    public String getBU() {
        return bu;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", vendor='" + vendor + '\'' +
                ", rd='" + rd + '\'' +
                ", bu='" + bu + '\'' +
                ", state='" + state + '\'' + "} \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseOrder)) return false;
        PurchaseOrder that = (PurchaseOrder) o;
        return code.equals(that.code) && Objects.equals(type, that.type) && Objects.equals(vendor, that.vendor) && Objects.equals(rd, that.rd) && Objects.equals(bu, that.bu) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, vendor, rd, bu, state);
    }
}
