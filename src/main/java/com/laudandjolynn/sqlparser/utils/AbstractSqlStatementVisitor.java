package com.laudandjolynn.sqlparser.utils;

import com.laudandjolynn.sqlparser.entity.SqlStatement;
import com.laudandjolynn.sqlparser.parser.Sql92BaseVisitor;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: tdhuang
 * Date: 14-5-23 上午9:38
 * Copyright: www.laudandjolynn.com
 */
public abstract class AbstractSqlStatementVisitor extends Sql92BaseVisitor<Object> {
    protected String sql = null;
    private SqlStatement statement = null;

    public AbstractSqlStatementVisitor(String sql) {
        this.sql = sql;
    }

    protected void assign(SqlStatement statement) {
        this.statement = statement;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public Object visitProg(@NotNull Sql92Parser.ProgContext ctx) {
        visitChildren(ctx);
        return statement;
    }

    @Override
    public String toString() {
        return sql;
    }
}
