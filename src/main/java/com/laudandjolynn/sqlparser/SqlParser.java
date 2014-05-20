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
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2014年5月7日 上午9:24:00
 * @copyright: www.laudandjolynn.com
 */
public class SqlParser {
    private final static Logger logger = LoggerFactory.getLogger(SqlParser.class);

    public static void main(String[] args) {
        String sql = "SELECT * FROM a";
        SqlStatement stmt = parse(sql);
        System.out.println(stmt);
    }

    public static SqlStatement parse(String sql) {
        ANTLRInputStream input = new ANTLRInputStream(sql);
        Sql92Lexer lexer = new Sql92Lexer(input);
        List<? extends  Token> tokenList = lexer.getAllTokens();
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println(tokenList.get(i));
        }
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Sql92Parser parser = new Sql92Parser(tokenStream);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree());
        tree.accept(new Sql92BaseVisitor<Object>() {
            @Override
            public Object visitProg(@NotNull Sql92Parser.ProgContext ctx) {
                System.out.println(ctx.getText());
                return super.visitProg(ctx);    //To change body of overridden methods use File | Settings | File Templates.
            }
        });
        return null;
    }
}
