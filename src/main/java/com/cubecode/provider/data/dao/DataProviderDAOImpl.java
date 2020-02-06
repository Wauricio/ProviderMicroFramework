package com.cubecode.provider.data.dao;

import com.cubecode.provider.data.entity.DataProviderEntity;

import java.lang.reflect.ParameterizedType;

public abstract class DataProviderDAOImpl<T> implements DataProviderDAO<T> {
     Class<T> persistentClass= (Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];;
     DataProviderEntity entity=persistentClass.getAnnotation(DataProviderEntity.class);

    public Class<T> getPersistentClass() {  return persistentClass;  }

    public DataProviderEntity getDataProviderEntity(){
        return entity;
    }


}
