package ru.tsedrik.adapter.orm;

import ru.tsedrik.adapter.DbEntity;
import ru.tsedrik.adapter.DbUserEntity;
import ru.tsedrik.adapter.orm.first.FirstOrm;
import ru.tsedrik.adapter.orm.second.SecondOrm;

import java.util.Set;

public class CommonOrmAdapter<O, T extends DbEntity> implements CommonOrm<T>{

    private O orm;
    private Class<T> eClass;

    public CommonOrmAdapter(O orm, Class eClass) {
        this.orm = orm;
        this.eClass = eClass;
    }

    @Override
    public void create(T entity) {
        if (orm instanceof FirstOrm){
            ((FirstOrm) orm).create(entity);
        } else if (orm instanceof SecondOrm){
            getEntities().add(entity);
        } else {
            throw new RuntimeException("Unknown orm class: " + orm.getClass().getName());
        }
    }

    @Override
    public T read(Long id) {
        if (orm instanceof FirstOrm){
            return (T) ((FirstOrm) orm).read(id.intValue());
        } else if (orm instanceof SecondOrm){
            return getEntities().stream()
                    .filter(e -> e.getId().equals(id))
                    .findFirst().get();
        } else {
            throw new RuntimeException("Unknown orm class: " + orm.getClass().getName());
        }
    }

    @Override
    public void update(T entity) {
        if (orm instanceof FirstOrm){
            ((FirstOrm) orm).update(entity);
        } else if (orm instanceof SecondOrm){
            Set<T> entities = getEntities();
            entities.removeIf(e -> e.getId().equals(entity.getId()));
            entities.add(entity);
        } else {
            throw new RuntimeException("Unknown orm class: " + orm.getClass().getName());
        }
    }

    @Override
    public void delete(T entity) {
        if (orm instanceof FirstOrm){
            ((FirstOrm) orm).delete(entity);
        } else if (orm instanceof SecondOrm){
            getEntities().remove(entity);
        } else {
            throw new RuntimeException("Unknown orm class: " + orm.getClass().getName());
        }
    }

    private Set<T> getEntities(){
        Set<T> entities;
        if (eClass.equals(DbUserEntity.class)){
            entities = (Set<T>) ((SecondOrm) orm).getContext().getUsers();
        } else if (eClass.equals(DbUserEntity.class)){
            entities = (Set<T>) ((SecondOrm) orm).getContext().getUserInfos();
        } else {
            throw new RuntimeException("Unknown entity class: " + eClass.getName());
        }
        return entities;
    }
}
