package com.team2.search_engine.data.repository;

import com.team2.search_engine.data.entity.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class DataLoader{
    private SearchRepository cor;


    @Autowired
    public DataLoader(SearchRepository cor) {
        this.cor = cor;
        LoadData();
    }

    private void LoadData() {
        ArrayList<PurchaseOrder> pos = new ArrayList<>();
        pos.add(new PurchaseOrder("2020000048", "Local Purchase Order", "000002 - Zhejiang", null, "Signmedia", "Shipped"));
        pos.add(new PurchaseOrder("2020000047", "Service Purchase Order", "000002 - Zhejiang", "Local Purchase Order - 2018000017", "Signmedia","Confirmed"));
        pos.add(new PurchaseOrder("2021000001", "Service Purchase Order", "000001 - Zhejiang", "Local Purchase Order - 2018000017", "Signmedia","Draft"));
        cor.saveAll(pos);
    }
}
