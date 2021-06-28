package ru.tsedrik.adapter.orm.second;

import ru.tsedrik.adapter.DbEntity;
import ru.tsedrik.adapter.orm.CommonOrm;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SecondOrmAdapter implements CommonOrm<DbEntity> {

    private SecondOrm secondOrm;
    private Class aClass;

    public SecondOrmAdapter (SecondOrm secondOrm, Class aClass){
        this.secondOrm = secondOrm;
        this.aClass = aClass;
    }

    @Override
    public void create(DbEntity entity) {
        getEntities().add(entity);
    }

    @Override
    public DbEntity read(Long id) {
        return getEntityById(id).orElseThrow(() -> new RuntimeException("Entity with id = " + id + " wasn't found."));
    }

    @Override
    public void update(DbEntity entity) {
        Set<DbEntity> entities = getEntities();
        Optional<DbEntity> updatedEntity = getEntityById(entity.getId());
        if (updatedEntity.isPresent()){
            entities.remove(updatedEntity);
        } else {
            throw new RuntimeException("There is not entity with id = " + entity.getId());
        }
        entities.add(entity);
    }

    @Override
    public void delete(DbEntity entity) {
        getEntities().remove(entity);
    }

    private Set<DbEntity> getEntities(){
        Set<DbEntity> entities = new HashSet<>();
        if (aClass.getName().equals("DbUserEntity")){
            for (DbEntity entity: secondOrm.getContext().getUsers()){
                entities.add(entity);
            }
        } else if (aClass.getName().equals("DbUserInfoEntity")){
            for (DbEntity entity: secondOrm.getContext().getUserInfos()){
                entities.add(entity);
            }
        } else {
            throw new IllegalArgumentException("Unknown class");
        }
        return entities;
    }

    private Optional<DbEntity> getEntityById(Long id){
        return getEntities().stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }
}
