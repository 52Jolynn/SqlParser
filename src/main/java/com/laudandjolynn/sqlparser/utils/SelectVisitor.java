package com.laudandjolynn.sqlparser.utils;

import com.laudandjolynn.sqlparser.entity.Select;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: tdhuang
 * Date: 14-5-23 上午9:38
 * Copyright: www.laudandjolynn.com
 */
public class SelectVisitor extends AbstractSqlStatementVisitor {
    public SelectVisitor(String sql) {
        super(sql);
    }

    @Override
    public Object visitSelect(@NotNull Sql92Parser.SelectContext ctx) {
        statement = new Select(sql);
        return null;
    }
}
