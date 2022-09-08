package com.team2.search_engine.data.repository;



import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;

//
@Repository
public class CustomPurchaseOrderRepositoryImpl implements CustomPurchaseOrderRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Object> find(SearchField searchField){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> query = cb.createQuery((Class<Object>) searchField.getType());
        Root<Object> results = query.from((Class<Object>) searchField.getType());
        // building the query
        query.select(results);
        String operator = searchField.getOperator();
        Path field = results.get(searchField.getField());
        String value = searchField.getValue(); // value of the searched field

        if(operator.equals("=")){
            // the equal operator query
            query.where(cb.equal(field,value));
        }
        else if(operator.equals("~")){
            // the like operator query
            query.where(cb.like(field,"%"+value+"%"));
        }
        // returning results
        return entityManager.createQuery(query).getResultList();
    }
}
