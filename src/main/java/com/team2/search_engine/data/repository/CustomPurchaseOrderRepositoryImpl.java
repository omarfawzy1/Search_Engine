package com.team2.search_engine.data.repository;



import com.team2.search_engine.data.model.SearchField;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;
@Repository
public class CustomPurchaseOrderRepositoryImpl implements CustomPurchaseOrderRepository {
    @PersistenceContext
    private EntityManager entityManager;
//
//    @Override
//    public List<PurchaseOrder> findPOExact(String type, String value) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<PurchaseOrder> query = cb.createQuery(PurchaseOrder.class);
//        Root<PurchaseOrder> po = query.from(PurchaseOrder.class);
//
//        query.select(po).where(cb.equal(po.get(type),value));
//
//        return entityManager.createQuery(query).getResultList();
//    }
//    @Override
//    public List<PurchaseOrder> findPOLike(String type, String value) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<PurchaseOrder> query = cb.createQuery(PurchaseOrder.class);
//        Root<PurchaseOrder> po = query.from(PurchaseOrder.class);
//        query.select(po).where(cb.like(po.get(type),"%"+value+"%"));
//
//        return entityManager.createQuery(query).getResultList();
//    }
    @Override
    public List<Object> find(SearchField searchField){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> query = cb.createQuery((Class<Object>) searchField.getType());
        Root<Object> results = query.from((Class<Object>) searchField.getType());
        query.select(results);
        String operator = searchField.getOperator();
        Path field = results.get(searchField.getField());
        String value = searchField.getValue();
        if(operator.equals("=")){
            query.where(cb.equal(field,value));
        }
        else if(operator.equals("~")){
            query.where(cb.like(field,"%"+value+"%"));
        }
        return entityManager.createQuery(query).getResultList();
    }
}
