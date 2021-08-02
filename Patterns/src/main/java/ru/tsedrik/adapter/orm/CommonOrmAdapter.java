package ru.tsedrik.adapter.orm;

import ru.tsedrik.adapter.DbEntity;
import ru.tsedrik.adapter.DbUserEntity;
import ru.tsedrik.adapter.DbUserInfoEntity;
import ru.tsedrik.adapter.orm.first.FirstOrm;
import ru.tsedrik.adapter.orm.second.SecondOrm;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class CommonOrmAdapter implements CommonOrm<DbEntity>{

    private Class aClass;
    private FirstOrm<DbEntity> firstOrm;
    private SecondOrm secondOrm;

    public CommonOrmAdapter(Class aClass, Object orm){

        if (aClass.equals(FirstOrm.class)){
            firstOrm = (FirstOrm<DbEntity>) orm;
        } else if (aClass.equals(SecondOrm.class)){
            secondOrm = (SecondOrm)orm;
        } else {
            throw new IllegalArgumentException("Unknown orm class");
        }
        this.aClass = aClass;
    }

    @Override
    public void create(DbEntity entity) {
        if (aClass.equals(FirstOrm.class)){
            firstOrm.create(entity);
        } else {
            getEntities(entity.getClass()).add(entity);
        }
    }

    @Override
    public DbEntity read(Long id) {
        if (aClass.equals(FirstOrm.class)){
            return firstOrm.read(id.intValue());
        } else {
            return getEntityById(id).orElseThrow(() -> new RuntimeException("Entity with id = " + id + " wasn't found."));
        }
    }

    @Override
    public void update(DbEntity entity) {
        if (aClass.equals(FirstOrm.class)){
            firstOrm.update(entity);
        } else {
            Set<DbEntity> entities = getEntities(entity.getClass());
            Optional<DbEntity> updatedEntity = getEntityById(entity.getId());
            if (updatedEntity.isPresent()){
                entities.remove(updatedEntity);
            } else {
                throw new RuntimeException("There is not entity with id = " + entity.getId());
            }
            entities.add(entity);
        }
    }

    @Override
    public void delete(DbEntity entity) {
        if (aClass.equals(FirstOrm.class)){
            firstOrm.delete(entity);
        } else {
            getEntities(entity.getClass()).remove(entity);
        }
    }

    private Set<DbEntity> getEntities(Class<? extends DbEntity> eClass){
        Set<DbEntity> entities = new HashSet<>();
        if (eClass.equals(DbUserEntity.class)){
            for (DbEntity entity: secondOrm.getContext().getUsers()){
                entities.add(entity);
            }
        } else if (eClass.equals(DbUserInfoEntity.class)){
            for (DbEntity entity: secondOrm.getContext().getUserInfos()){
                entities.add(entity);
            }
        } else {
            throw new IllegalArgumentException("Unknown class for entity");
        }
        return entities;
    }

    private Optional<DbEntity> getEntityById(Long id){
        Stream<Set<DbEntity>> stream = Stream.of(getEntities(DbUserEntity.class), getEntities(DbUserInfoEntity.class));
        return stream.flatMap(s -> s.stream())
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }
}
