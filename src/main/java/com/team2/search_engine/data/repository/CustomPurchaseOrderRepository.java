package com.team2.search_engine.data.repository;

import com.team2.search_engine.data.entity.PurchaseOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomPurchaseOrderRepository{
    List<PurchaseOrder> findPOExact(String type, String value);
    List<PurchaseOrder> findPOLike(String type, String value);

}
