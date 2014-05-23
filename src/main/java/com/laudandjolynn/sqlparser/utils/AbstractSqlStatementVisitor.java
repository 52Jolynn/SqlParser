package com.laudandjolynn.sqlparser.utils;

import com.laudandjolynn.sqlparser.entity.SqlStatement;
import com.laudandjolynn.sqlparser.parser.Sql92BaseVisitor;

/**
 * User: tdhuang
 * Date: 14-5-23 上午9:38
 * Copyright: www.laudandjolynn.com
 */
public abstract class AbstractSqlStatementVisitor extends Sql92BaseVisitor<Object> {
    protected String sql = null;
    protected SqlStatement statement = null;

    public AbstractSqlStatementVisitor(String sql) {
        this.sql = sql;
    }

    public SqlStatement getStatement() {
        return statement;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return sql;
    }
}
