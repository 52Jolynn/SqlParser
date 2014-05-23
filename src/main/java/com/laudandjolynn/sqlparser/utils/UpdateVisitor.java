package com.laudandjolynn.sqlparser.utils;

import com.laudandjolynn.sqlparser.entity.Update;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Author: tdhuang
 * Date: 14-5-23 上午11:35
 * Copyright: www.laudandjolynn.com
 */
public class UpdateVisitor extends AbstractSqlStatementVisitor {
    public UpdateVisitor(String sql) {
        super(sql);
    }

    @Override
    public Object visitUpdate(@NotNull Sql92Parser.UpdateContext ctx) {
        Update update = new Update();
        assign(update);
        return null;
    }
}
