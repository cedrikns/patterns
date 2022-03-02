package ru.tsedrik.adapter.orm.second;

import ru.tsedrik.adapter.DbEntity;
import ru.tsedrik.adapter.DbUserEntity;
import ru.tsedrik.adapter.DbUserInfoEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class SecondOrmContextImpl implements SecondOrmContext{

    private Set<DbEntity> users;

    public SecondOrmContextImpl(Set<DbEntity> users) {
        this.users = users;
    }

    @Override
    public Set<DbUserEntity> getUsers() {
        return users.stream()
                .filter(e -> e.getClass().getName().equals("DbUserEntity"))
                .map(e -> (DbUserEntity)e)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfos() {
        return users.stream()
                .filter(e -> e.getClass().getName().equals("DbUserInfoEntity"))
                .map(e -> (DbUserInfoEntity)e)
                .collect(Collectors.toSet());
    }
}
