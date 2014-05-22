package com.laudandjolynn.sqlparser.entity;

import com.laudandjolynn.sqlparser.parser.Sql92BaseVisitor;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: tdhuang
 * Date: 14-5-22
 * Time: 下午3:12
 * To change this template use File | Settings | File Templates.
 */
public class SqlStatementVisitor extends Sql92BaseVisitor<SqlFragemnt> {
    private String sql = null;
    private SqlStatement statement = null;

    public SqlStatementVisitor(String sql) {
        this.sql = sql;
    }

    @Override
    public SqlFragemnt visitDirect_select_statement_multiple_rows(@NotNull Sql92Parser.Direct_select_statement_multiple_rowsContext ctx) {
        statement = new Select(sql);
        SqlFragemnt query = visit(ctx.query_specification());
        Sql92Parser.Order_by_clauseContext orderByClause = ctx.order_by_clause();
        if (orderByClause != null) {
            SqlFragemnt orderBy = visit(orderByClause);
        }
        return statement;
    }

    public SqlStatement getStatement() {
        return statement;
    }
}
