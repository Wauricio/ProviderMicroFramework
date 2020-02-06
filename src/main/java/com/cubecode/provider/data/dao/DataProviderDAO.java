    package com.cubecode.provider.data.dao;

import com.cubecode.provider.data.criterial.CriterialModel;

public interface DataProviderDAO<T> {
    T save(T entity);
    T delete(T entity);
    T findById(T entity);
    T update(T entity);
    CriterialModel<T> findByCriterial(CriterialModel<T> criterial);
}
