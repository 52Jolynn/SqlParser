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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import junit.framework.TestCase;

/**
 * 
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2014年5月7日 上午9:24:00
 * @copyright: www.laudandjolynn.com
 */
public class SqlParserTest extends TestCase {

	public static void parseSQL(String sql){
		ANTLRInputStream input = new ANTLRInputStream(sql);// create a CharStream that reads from standard input
		Sql92ParserDDLLexer lexer = new Sql92ParserDDLLexer(input);// create a lexer that feeds off of input CharStream
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);// create a buffer of tokens pulled from the lexer
		Sql92ParserDDLParser parser = new Sql92ParserDDLParser(tokenStream);// create a parser that feeds off the tokens buffer
		ParseTree tree = parser.sql_procedure_statement();
		System.out.println("@@"+sql);
		System.out.println("tree.toStringTree(parser):"+tree.toStringTree(parser));
		System.out.println();
	}
	
	public void testDDL(){
		//sql_schema_definition_statement-->schema_definition
		String sql = "CREATE SCHEMA myschema";
		SqlParserTest.parseSQL(sql);
	}
}
