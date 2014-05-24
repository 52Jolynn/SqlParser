package com.laudandjolynn.sqlparser.utils;

import com.laudandjolynn.sqlparser.entity.OrderByElement;
import com.laudandjolynn.sqlparser.entity.Select;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

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
        Select select = new Select(sql);
        assign(select);
        Object selectClause = ctx.query_specification().accept(this);
        Sql92Parser.Order_by_clauseContext orderByClause = ctx.order_by_clause();
        if (orderByClause != null) {
            List<OrderByElement> orderByElement = (List<OrderByElement>)orderByClause.accept(this);
            select.addOrderByElement(orderByElement);
        }

        return null;
    }

    @Override
    public Object visitSelect_list(@NotNull Sql92Parser.Select_listContext ctx) {
        return null;
    }

    @Override
    public Object visitSet_qualifier(@NotNull Sql92Parser.Set_qualifierContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_expression(@NotNull Sql92Parser.Table_expressionContext ctx) {
        return null;
    }

    @Override
    public Object visitOrderByClause(@NotNull Sql92Parser.OrderByClauseContext ctx) {
        return visit(ctx.sort_specification_list());
    }

    @Override
    public Object visitSort_specification_list(@NotNull Sql92Parser.Sort_specification_listContext ctx) {
        List<Sql92Parser.Sort_specificationContext> list = ctx.sort_specification();
        int size = list == null ? 0 : list.size();
        List<OrderByElement> orderByList = new ArrayList<OrderByElement>(size);
        for (int i = 0; i < size; i++) {
            Sql92Parser.Sort_specificationContext c = list.get(i);
            String sortKey = visit(c.sort_key()).toString();
            Sql92Parser.Collate_clauseContext collateClause = c.collate_clause();
            String collateName = null;
            if (collateClause != null) {
                collateName = visit(collateClause).toString();
            }
            Boolean ordering = (Boolean)visit(c.ordering_specification());
            OrderByElement orderByElement = new OrderByElement(sortKey, collateName, ordering);
            orderByList.add(orderByElement);
        }
        return orderByList;
    }

    @Override
    public Object visitSort_key(@NotNull Sql92Parser.Sort_keyContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitCollateClause(@NotNull Sql92Parser.CollateClauseContext ctx) {
        return ctx.collation_name().getText();
    }

    @Override
    public Object visitOrdering_specification(@NotNull Sql92Parser.Ordering_specificationContext ctx) {
        if (ctx.ASC() == null) {
            return true;
        }
        return false;
    }
}
