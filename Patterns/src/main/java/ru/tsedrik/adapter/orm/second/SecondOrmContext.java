package ru.tsedrik.adapter.orm.second;

import ru.tsedrik.adapter.DbUserEntity;
import ru.tsedrik.adapter.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface SecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfos();

}
