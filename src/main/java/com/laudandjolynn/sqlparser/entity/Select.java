package com.laudandjolynn.sqlparser.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: tdhuang
 * Date: 14-5-23 上午9:38
 * Copyright: www.laudandjolynn.com
 */
public class Select extends AbstractSqlStatement {
    private List<OrderByElement> orderByElements = new ArrayList<OrderByElement>();

    public Select(String sql) {
        super(sql);
    }

    public void addOrderByElement(OrderByElement... orderByElement) {
        orderByElements.addAll(Arrays.asList(orderByElement));
    }

    public void addOrderByElement(List<OrderByElement> orderByList) {
        orderByElements.addAll(orderByList);
    }
}
