# ProviderMicroFramework
MicroFrameWorkProvider

## Data Provider

### USAGE
DAO Repository Provider

```java
public class ElasticDataProviderDAO<T> extends DataProviderDAOImpl<T> {

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public T delete(T t) {
        return null;
    }

    @Override
    public T findById(T t) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public CriterialModel<T> findByCriterial(CriterialModel<T> criterialModel) {
        return null;
    }
}
```

Repository Switch Provider

```java
@Repository
public class ExampleRepositoryImpl extends ElasticDataProviderDAO<PojoExample> implements ExampleRepository {

}
```



## Experimental
Testing Usage


## Authors
Wauricio : maussj4@hotmail.com


