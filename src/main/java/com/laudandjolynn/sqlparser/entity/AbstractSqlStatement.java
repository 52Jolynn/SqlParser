package com.laudandjolynn.sqlparser.entity;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2014年5月7日 下午9:13:43
 * @copyright: www.laudandjolynn.com
 */
public abstract class AbstractSqlStatement implements SqlStatement {
	protected String sql = null;

    public AbstractSqlStatement(){
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
