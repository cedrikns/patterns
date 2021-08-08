package ru.tsedrik.adapter.orm;

import ru.tsedrik.adapter.DbUserEntity;
import ru.tsedrik.adapter.DbUserInfoEntity;
import ru.tsedrik.adapter.orm.first.FirstOrmImpl;
import ru.tsedrik.adapter.orm.second.SecondOrmContextImpl;
import ru.tsedrik.adapter.orm.second.SecondOrmImpl;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CommonOrm<DbUserEntity> orm = new CommonOrmAdapter(new FirstOrmImpl<DbUserEntity>(new HashMap<>()), DbUserEntity.class);
        CommonOrm<DbUserEntity> orm2 = new CommonOrmAdapter(new SecondOrmImpl(new SecondOrmContextImpl(new HashSet<>())), DbUserEntity.class);

        CommonOrm<DbUserInfoEntity> orm3 = new CommonOrmAdapter(new FirstOrmImpl<DbUserInfoEntity>(new HashMap<>()), DbUserInfoEntity.class);
        CommonOrm<DbUserInfoEntity> orm4 = new CommonOrmAdapter(new SecondOrmImpl(new SecondOrmContextImpl(new HashSet<>())), DbUserInfoEntity.class);

    }
}
