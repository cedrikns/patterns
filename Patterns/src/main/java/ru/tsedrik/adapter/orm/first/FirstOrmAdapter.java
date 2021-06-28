package ru.tsedrik.adapter.orm.first;

import ru.tsedrik.adapter.DbEntity;
import ru.tsedrik.adapter.orm.CommonOrm;

public class FirstOrmAdapter<T extends DbEntity> implements CommonOrm<T> {

    private FirstOrm<T> firstOrm;

    public FirstOrmAdapter (FirstOrm firstOrm){
        this.firstOrm = firstOrm;
    }

    @Override
    public void create(T entity) {
        firstOrm.create(entity);
    }

    @Override
    public T read(Long id) {
        return firstOrm.read(id.intValue());
    }

    @Override
    public void update(T entity) {
        firstOrm.update(entity);
    }

    @Override
    public void delete(T entity) {
        firstOrm.delete(entity);
    }
}
