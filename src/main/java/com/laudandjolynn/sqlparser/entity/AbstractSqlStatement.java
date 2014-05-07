package com.laudandjolynn.sqlparser.entity;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2014年5月7日 下午9:13:43
 * @copyright: www.laudandjolynn.com
 */
public class AbstractSqlStatement implements SqlStatement {
	protected String sql = null;

	@Override
	public String getSql() {
		return sql;
	}

}
