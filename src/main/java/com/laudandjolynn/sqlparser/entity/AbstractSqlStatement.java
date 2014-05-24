package com.laudandjolynn.sqlparser.entity;

/**
 * User: tdhuang
 * Date: 14-5-23 上午9:38
 * Copyright: www.laudandjolynn.com
 */
public abstract class AbstractSqlStatement implements SqlStatement {
    protected String sql = null;

    public AbstractSqlStatement() {
    }

    public AbstractSqlStatement(String sql) {
        this.sql = sql;
    }

    @Override
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String getFragSql() {
        return sql;
    }

    @Override
    public String toString() {
        return sql;
    }
}
