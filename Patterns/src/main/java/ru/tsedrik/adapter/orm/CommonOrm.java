package ru.tsedrik.adapter.orm;

import ru.tsedrik.adapter.DbEntity;

public interface CommonOrm <T extends DbEntity>{

    void create(T entity);

    T read(Long id);

    void update(T entity);

    void delete(T entity);

}
