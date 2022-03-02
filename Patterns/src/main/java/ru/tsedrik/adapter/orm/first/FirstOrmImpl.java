package ru.tsedrik.adapter.orm.first;

import ru.tsedrik.adapter.DbEntity;

import java.util.Map;

public class FirstOrmImpl<T extends DbEntity> implements FirstOrm<T>{

    Map<Long, T> dbEntities;

    public FirstOrmImpl(Map<Long, T> dbEntities) {
        this.dbEntities = dbEntities;
    }

    @Override
    public void create(T entity) {
        dbEntities.put(entity.getId(), entity);
    }

    @Override
    public T read(int id) {
        return dbEntities.get(id);
    }

    @Override
    public void update(T entity) {
        dbEntities.computeIfPresent(entity.getId(), (k, v) -> entity);
    }

    @Override
    public void delete(T entity) {
        dbEntities.remove(entity.getId());
    }
}
