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
import com.laudandjolynn.sqlparser.parser.Sql92BaseVisitor;
import com.laudandjolynn.sqlparser.parser.Sql92Lexer;
import com.laudandjolynn.sqlparser.parser.Sql92Parser;
import com.laudandjolynn.sqlparser.utils.AbstractSqlStatementVisitor;
import com.laudandjolynn.sqlparser.utils.SelectVisitor;
import com.laudandjolynn.sqlparser.utils.UpdateVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: Laud
 * Email: htd0324@gmail.com
 * Date: 2014年5月7日 上午9:24:00
 * Copyright: www.laudandjolynn.com
 */
public class SqlParser {
    private final static Logger logger = LoggerFactory.getLogger(SqlParser.class);
    private final static SqlParser parser = new SqlParser();

    private SqlParser(){
    }

    public static SqlParser getInstance() {
        return parser;
    }

    /**
     * 解析sql
     * @param sql SQL语句
     * @return
     */
    public SqlStatement parse(String sql) {
        ANTLRInputStream input = new ANTLRInputStream(sql);
        Sql92Lexer lexer = new Sql92Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        logger.debug("all tokens: " + tokens.getTokens().toString());

        Sql92Parser parser = new Sql92Parser(tokens);
        ParseTree tree = parser.prog();
        logger.debug("parse tree: " + tree.toStringTree(parser));

        SqlTreeAlterVisitorFinder finder = new SqlTreeAlterVisitorFinder(sql, tree);
        AbstractSqlStatementVisitor visitor = finder.find();

        return (SqlStatement)tree.accept(visitor);
    }

    private class SqlTreeAlterVisitorFinder extends Sql92BaseVisitor<Void> {
        private AbstractSqlStatementVisitor visitor = null;
        private String sql = null;
        private ParseTree tree = null;

        public SqlTreeAlterVisitorFinder(String sql, ParseTree tree) {
            this.sql = sql;
            this.tree = tree;
        }

        public AbstractSqlStatementVisitor find() {
            visit(tree);
            return visitor;
        }

        @Override
        public Void visitSelect(@NotNull Sql92Parser.SelectContext ctx) {
            visitor = new SelectVisitor(sql);
            return null;
        }

        @Override
        public Void visitUpdate(@NotNull Sql92Parser.UpdateContext ctx) {
            visitor = new UpdateVisitor(sql);
            return null;
        }
    }
}
