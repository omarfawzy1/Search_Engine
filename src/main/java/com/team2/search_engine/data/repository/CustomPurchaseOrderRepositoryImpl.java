package com.team2.search_engine.data.repository;



import com.team2.search_engine.data.entity.PurchaseOrder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;
@Repository
public class CustomPurchaseOrderRepositoryImpl implements CustomPurchaseOrderRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<PurchaseOrder> findPOExact(String type, String value) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<PurchaseOrder> query = cb.createQuery(PurchaseOrder.class);
        Root<PurchaseOrder> po = query.from(PurchaseOrder.class);

        query.select(po).where(cb.equal(po.get(type),value));

        return entityManager.createQuery(query).getResultList();
    }
    @Override
    public List<PurchaseOrder> findPOLike(String type, String value) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<PurchaseOrder> query = cb.createQuery(PurchaseOrder.class);
        Root<PurchaseOrder> po = query.from(PurchaseOrder.class);
        query.select(po).where(cb.like(po.get(type),"%"+value+"%"));

        return entityManager.createQuery(query).getResultList();
    }
}
