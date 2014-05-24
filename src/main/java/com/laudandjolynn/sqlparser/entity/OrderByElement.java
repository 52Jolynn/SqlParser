package com.laudandjolynn.sqlparser.entity;

/**
 * Author: tdhuang
 * Date: 14-5-23 下午1:16
 * Copyright: www.laudandjolynn.com
 */
public class OrderByElement extends AbstractSqlFragment {
    private String sortKey = null;
    private String collateName = null;
    private boolean desc = false;

    public OrderByElement(String sortKey, boolean desc) {
        this(sortKey, null, desc);
    }

    public OrderByElement(String sortKey, String collateName, boolean desc) {
        this.sortKey = sortKey;
        this.collateName = collateName;
        this.desc = desc;
    }

    @Override
    public String getFragSql() {
        StringBuffer sb = new StringBuffer();
        sb.append(sortKey).append(" ");
        if (collateName != null) {
            sb.append(" COLLATE ").append(collateName);
        }

        sb.append(desc ? " DESC" : " ASC");
        return sb.toString();
    }
}
