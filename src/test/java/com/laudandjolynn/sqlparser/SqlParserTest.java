/*******************************************************************************
 * Copyright (c) 2014 htd0324@gmail.com.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     htd0324@gmail.com - initial API and implementation
 ******************************************************************************/
package com.laudandjolynn.sqlparser;

import com.laudandjolynn.sqlparser.entity.SqlStatement;
import junit.framework.TestCase;

/**
 * 
 * Author: Laud
 * Email: htd0324@gmail.com
 * Date: 2014年5月7日 上午9:24:00
 * Copyright: www.laudandjolynn.com
 */
public class SqlParserTest extends TestCase {
    public void testParser() {
        String sql = "select * from a";
        SqlStatement statement = SqlParser.getInstance().parse(sql);
        System.out.println(statement);
    }
}
