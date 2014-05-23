package com.laudandjolynn.sqlparser.entity;

/**
 * Author: tdhuang
 * Date: 14-5-23 下午1:43
 * Copyright: www.laudandjolynn.com
 */
public abstract class AbstractSqlFragment implements SqlFragemnt {
    @Override
    public String toString() {
        return getFragSql();
    }
}
