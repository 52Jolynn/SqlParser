// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\Sql92.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sql92Parser}.
 */
public interface Sql92Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(@NotNull Sql92Parser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(@NotNull Sql92Parser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_type}.
	 * @param ctx the parse tree
	 */
	void enterInterval_type(@NotNull Sql92Parser.Interval_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_type}.
	 * @param ctx the parse tree
	 */
	void exitInterval_type(@NotNull Sql92Parser.Interval_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_statement(@NotNull Sql92Parser.Set_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_statement(@NotNull Sql92Parser.Set_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_behaviour}.
	 * @param ctx the parse tree
	 */
	void enterDrop_behaviour(@NotNull Sql92Parser.Drop_behaviourContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_behaviour}.
	 * @param ctx the parse tree
	 */
	void exitDrop_behaviour(@NotNull Sql92Parser.Drop_behaviourContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(@NotNull Sql92Parser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(@NotNull Sql92Parser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull Sql92Parser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull Sql92Parser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(@NotNull Sql92Parser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(@NotNull Sql92Parser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void enterScalar_subquery(@NotNull Sql92Parser.Scalar_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void exitScalar_subquery(@NotNull Sql92Parser.Scalar_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull Sql92Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull Sql92Parser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#occurences}.
	 * @param ctx the parse tree
	 */
	void enterOccurences(@NotNull Sql92Parser.OccurencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#occurences}.
	 * @param ctx the parse tree
	 */
	void exitOccurences(@NotNull Sql92Parser.OccurencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(@NotNull Sql92Parser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(@NotNull Sql92Parser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_statement(@NotNull Sql92Parser.Prepable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_statement(@NotNull Sql92Parser.Prepable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#disconnect_object}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect_object(@NotNull Sql92Parser.Disconnect_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#disconnect_object}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect_object(@NotNull Sql92Parser.Disconnect_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(@NotNull Sql92Parser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(@NotNull Sql92Parser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(@NotNull Sql92Parser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(@NotNull Sql92Parser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#target_specification}.
	 * @param ctx the parse tree
	 */
	void enterTarget_specification(@NotNull Sql92Parser.Target_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#target_specification}.
	 * @param ctx the parse tree
	 */
	void exitTarget_specification(@NotNull Sql92Parser.Target_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#describe_input_statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_input_statement(@NotNull Sql92Parser.Describe_input_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#describe_input_statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_input_statement(@NotNull Sql92Parser.Describe_input_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(@NotNull Sql92Parser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(@NotNull Sql92Parser.Language_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#delete_rule}.
	 * @param ctx the parse tree
	 */
	void enterDelete_rule(@NotNull Sql92Parser.Delete_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#delete_rule}.
	 * @param ctx the parse tree
	 */
	void exitDelete_rule(@NotNull Sql92Parser.Delete_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#scope_option}.
	 * @param ctx the parse tree
	 */
	void enterScope_option(@NotNull Sql92Parser.Scope_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#scope_option}.
	 * @param ctx the parse tree
	 */
	void exitScope_option(@NotNull Sql92Parser.Scope_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(@NotNull Sql92Parser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(@NotNull Sql92Parser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_character_set_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_character_set_statement(@NotNull Sql92Parser.Drop_character_set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_character_set_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_character_set_statement(@NotNull Sql92Parser.Drop_character_set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_name(@NotNull Sql92Parser.Correlation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_name(@NotNull Sql92Parser.Correlation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#condition_information}.
	 * @param ctx the parse tree
	 */
	void enterCondition_information(@NotNull Sql92Parser.Condition_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#condition_information}.
	 * @param ctx the parse tree
	 */
	void exitCondition_information(@NotNull Sql92Parser.Condition_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_zone}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone(@NotNull Sql92Parser.Time_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_zone}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone(@NotNull Sql92Parser.Time_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull Sql92Parser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull Sql92Parser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#collation_definition}.
	 * @param ctx the parse tree
	 */
	void enterCollation_definition(@NotNull Sql92Parser.Collation_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#collation_definition}.
	 * @param ctx the parse tree
	 */
	void exitCollation_definition(@NotNull Sql92Parser.Collation_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_element_list(@NotNull Sql92Parser.Table_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_element_list(@NotNull Sql92Parser.Table_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_factor(@NotNull Sql92Parser.Character_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_factor(@NotNull Sql92Parser.Character_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#named_columns_join}.
	 * @param ctx the parse tree
	 */
	void enterNamed_columns_join(@NotNull Sql92Parser.Named_columns_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#named_columns_join}.
	 * @param ctx the parse tree
	 */
	void exitNamed_columns_join(@NotNull Sql92Parser.Named_columns_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#external_translation}.
	 * @param ctx the parse tree
	 */
	void enterExternal_translation(@NotNull Sql92Parser.External_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#external_translation}.
	 * @param ctx the parse tree
	 */
	void exitExternal_translation(@NotNull Sql92Parser.External_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#quote_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterQuote_string_literal(@NotNull Sql92Parser.Quote_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#quote_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitQuote_string_literal(@NotNull Sql92Parser.Quote_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#external_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_collation_name(@NotNull Sql92Parser.External_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#external_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_collation_name(@NotNull Sql92Parser.External_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 */
	void enterInterval_fractional_seconds_precision(@NotNull Sql92Parser.Interval_fractional_seconds_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 */
	void exitInterval_fractional_seconds_precision(@NotNull Sql92Parser.Interval_fractional_seconds_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_value_specification(@NotNull Sql92Parser.Unsigned_value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_value_specification(@NotNull Sql92Parser.Unsigned_value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#when_operand}.
	 * @param ctx the parse tree
	 */
	void enterWhen_operand(@NotNull Sql92Parser.When_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#when_operand}.
	 * @param ctx the parse tree
	 */
	void exitWhen_operand(@NotNull Sql92Parser.When_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#current_timestamp_value_function}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_timestamp_value_function(@NotNull Sql92Parser.Current_timestamp_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#current_timestamp_value_function}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_timestamp_value_function(@NotNull Sql92Parser.Current_timestamp_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#assertion_definition}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_definition(@NotNull Sql92Parser.Assertion_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#assertion_definition}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_definition(@NotNull Sql92Parser.Assertion_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_definition_statement(@NotNull Sql92Parser.Sql_schema_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_definition_statement(@NotNull Sql92Parser.Sql_schema_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_statement_name}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement_name(@NotNull Sql92Parser.Sql_statement_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_statement_name}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement_name(@NotNull Sql92Parser.Sql_statement_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_statement(@NotNull Sql92Parser.Sql_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_statement(@NotNull Sql92Parser.Sql_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_definition(@NotNull Sql92Parser.Alter_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_definition(@NotNull Sql92Parser.Alter_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#like_predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike_predicate(@NotNull Sql92Parser.Like_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#like_predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike_predicate(@NotNull Sql92Parser.Like_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_zone_specifier}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_specifier(@NotNull Sql92Parser.Time_zone_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_zone_specifier}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_specifier(@NotNull Sql92Parser.Time_zone_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(@NotNull Sql92Parser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(@NotNull Sql92Parser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(@NotNull Sql92Parser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(@NotNull Sql92Parser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull Sql92Parser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull Sql92Parser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_string_type}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string_type(@NotNull Sql92Parser.Character_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_string_type}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string_type(@NotNull Sql92Parser.Character_string_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_function_type}.
	 * @param ctx the parse tree
	 */
	void enterSet_function_type(@NotNull Sql92Parser.Set_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_function_type}.
	 * @param ctx the parse tree
	 */
	void exitSet_function_type(@NotNull Sql92Parser.Set_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#catalog_name}.
	 * @param ctx the parse tree
	 */
	void enterCatalog_name(@NotNull Sql92Parser.Catalog_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#catalog_name}.
	 * @param ctx the parse tree
	 */
	void exitCatalog_name(@NotNull Sql92Parser.Catalog_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#row_value_constructor_element}.
	 * @param ctx the parse tree
	 */
	void enterRow_value_constructor_element(@NotNull Sql92Parser.Row_value_constructor_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#row_value_constructor_element}.
	 * @param ctx the parse tree
	 */
	void exitRow_value_constructor_element(@NotNull Sql92Parser.Row_value_constructor_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#match_type}.
	 * @param ctx the parse tree
	 */
	void enterMatch_type(@NotNull Sql92Parser.Match_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#match_type}.
	 * @param ctx the parse tree
	 */
	void exitMatch_type(@NotNull Sql92Parser.Match_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#constraint_check_time}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_check_time(@NotNull Sql92Parser.Constraint_check_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#constraint_check_time}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_check_time(@NotNull Sql92Parser.Constraint_check_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_declare_cursor(@NotNull Sql92Parser.Dynamic_declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_declare_cursor(@NotNull Sql92Parser.Dynamic_declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull Sql92Parser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull Sql92Parser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_constraints_mode_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraints_mode_statement(@NotNull Sql92Parser.Set_constraints_mode_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_constraints_mode_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraints_mode_statement(@NotNull Sql92Parser.Set_constraints_mode_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#descriptor_item_name}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor_item_name(@NotNull Sql92Parser.Descriptor_item_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#descriptor_item_name}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor_item_name(@NotNull Sql92Parser.Descriptor_item_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(@NotNull Sql92Parser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(@NotNull Sql92Parser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_substring_function}.
	 * @param ctx the parse tree
	 */
	void enterBit_substring_function(@NotNull Sql92Parser.Bit_substring_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_substring_function}.
	 * @param ctx the parse tree
	 */
	void exitBit_substring_function(@NotNull Sql92Parser.Bit_substring_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trim_source}.
	 * @param ctx the parse tree
	 */
	void enterTrim_source(@NotNull Sql92Parser.Trim_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trim_source}.
	 * @param ctx the parse tree
	 */
	void exitTrim_source(@NotNull Sql92Parser.Trim_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#constraint_attributes}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_attributes(@NotNull Sql92Parser.Constraint_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#constraint_attributes}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_attributes(@NotNull Sql92Parser.Constraint_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_time_zone_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_time_zone_value(@NotNull Sql92Parser.Set_time_zone_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_time_zone_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_time_zone_value(@NotNull Sql92Parser.Set_time_zone_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#general_literal}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_literal(@NotNull Sql92Parser.General_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#general_literal}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_literal(@NotNull Sql92Parser.General_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_zone_field}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_field(@NotNull Sql92Parser.Time_zone_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_zone_field}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_field(@NotNull Sql92Parser.Time_zone_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_factor}.
	 * @param ctx the parse tree
	 */
	void enterBit_factor(@NotNull Sql92Parser.Bit_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_factor}.
	 * @param ctx the parse tree
	 */
	void exitBit_factor(@NotNull Sql92Parser.Bit_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#system_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void enterSystem_descriptor_statement(@NotNull Sql92Parser.System_descriptor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#system_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void exitSystem_descriptor_statement(@NotNull Sql92Parser.System_descriptor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#timestamp_precision}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_precision(@NotNull Sql92Parser.Timestamp_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#timestamp_precision}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_precision(@NotNull Sql92Parser.Timestamp_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_sql_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_sql_transaction_statement(@NotNull Sql92Parser.Prepable_sql_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_sql_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_sql_transaction_statement(@NotNull Sql92Parser.Prepable_sql_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void enterString_value_function(@NotNull Sql92Parser.String_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void exitString_value_function(@NotNull Sql92Parser.String_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#derived_column}.
	 * @param ctx the parse tree
	 */
	void enterDerived_column(@NotNull Sql92Parser.Derived_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#derived_column}.
	 * @param ctx the parse tree
	 */
	void exitDerived_column(@NotNull Sql92Parser.Derived_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_value_constructor_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor_list(@NotNull Sql92Parser.Table_value_constructor_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_value_constructor_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor_list(@NotNull Sql92Parser.Table_value_constructor_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#regular_identifier}.
	 * @param ctx the parse tree
	 */
	void enterRegular_identifier(@NotNull Sql92Parser.Regular_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#regular_identifier}.
	 * @param ctx the parse tree
	 */
	void exitRegular_identifier(@NotNull Sql92Parser.Regular_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_term}.
	 * @param ctx the parse tree
	 */
	void enterQuery_term(@NotNull Sql92Parser.Query_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_term}.
	 * @param ctx the parse tree
	 */
	void exitQuery_term(@NotNull Sql92Parser.Query_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#translation_definition}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_definition(@NotNull Sql92Parser.Translation_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#translation_definition}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_definition(@NotNull Sql92Parser.Translation_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#statement_information_item}.
	 * @param ctx the parse tree
	 */
	void enterStatement_information_item(@NotNull Sql92Parser.Statement_information_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#statement_information_item}.
	 * @param ctx the parse tree
	 */
	void exitStatement_information_item(@NotNull Sql92Parser.Statement_information_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_column_default_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_column_default_clause(@NotNull Sql92Parser.Set_column_default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_column_default_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_column_default_clause(@NotNull Sql92Parser.Set_column_default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#corresponding_spec}.
	 * @param ctx the parse tree
	 */
	void enterCorresponding_spec(@NotNull Sql92Parser.Corresponding_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#corresponding_spec}.
	 * @param ctx the parse tree
	 */
	void exitCorresponding_spec(@NotNull Sql92Parser.Corresponding_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#add_domain_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_domain_constraint_definition(@NotNull Sql92Parser.Add_domain_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#add_domain_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_domain_constraint_definition(@NotNull Sql92Parser.Add_domain_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#escape_character}.
	 * @param ctx the parse tree
	 */
	void enterEscape_character(@NotNull Sql92Parser.Escape_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#escape_character}.
	 * @param ctx the parse tree
	 */
	void exitEscape_character(@NotNull Sql92Parser.Escape_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModule_authorization_identifier(@NotNull Sql92Parser.Module_authorization_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModule_authorization_identifier(@NotNull Sql92Parser.Module_authorization_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#join_specification}.
	 * @param ctx the parse tree
	 */
	void enterJoin_specification(@NotNull Sql92Parser.Join_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#join_specification}.
	 * @param ctx the parse tree
	 */
	void exitJoin_specification(@NotNull Sql92Parser.Join_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(@NotNull Sql92Parser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(@NotNull Sql92Parser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_session_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_session_statement(@NotNull Sql92Parser.Sql_session_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_session_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_session_statement(@NotNull Sql92Parser.Sql_session_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull Sql92Parser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull Sql92Parser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_term}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_term(@NotNull Sql92Parser.Datetime_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_term}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_term(@NotNull Sql92Parser.Datetime_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#condition_number}.
	 * @param ctx the parse tree
	 */
	void enterCondition_number(@NotNull Sql92Parser.Condition_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#condition_number}.
	 * @param ctx the parse tree
	 */
	void exitCondition_number(@NotNull Sql92Parser.Condition_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(@NotNull Sql92Parser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(@NotNull Sql92Parser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_dynamic_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_dynamic_data_statement(@NotNull Sql92Parser.Sql_dynamic_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_dynamic_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_dynamic_data_statement(@NotNull Sql92Parser.Sql_dynamic_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void enterSchema_character_set_specification(@NotNull Sql92Parser.Schema_character_set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void exitSchema_character_set_specification(@NotNull Sql92Parser.Schema_character_set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#fetch_orientation}.
	 * @param ctx the parse tree
	 */
	void enterFetch_orientation(@NotNull Sql92Parser.Fetch_orientationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#fetch_orientation}.
	 * @param ctx the parse tree
	 */
	void exitFetch_orientation(@NotNull Sql92Parser.Fetch_orientationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#numeric_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value_expression(@NotNull Sql92Parser.Numeric_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#numeric_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value_expression(@NotNull Sql92Parser.Numeric_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull Sql92Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull Sql92Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_action(@NotNull Sql92Parser.Alter_table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_action(@NotNull Sql92Parser.Alter_table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_count}.
	 * @param ctx the parse tree
	 */
	void enterSet_count(@NotNull Sql92Parser.Set_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_count}.
	 * @param ctx the parse tree
	 */
	void exitSet_count(@NotNull Sql92Parser.Set_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#general_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_identifier(@NotNull Sql92Parser.General_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#general_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_identifier(@NotNull Sql92Parser.General_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#in_predicate}.
	 * @param ctx the parse tree
	 */
	void enterIn_predicate(@NotNull Sql92Parser.In_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#in_predicate}.
	 * @param ctx the parse tree
	 */
	void exitIn_predicate(@NotNull Sql92Parser.In_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#normal_table}.
	 * @param ctx the parse tree
	 */
	void enterNormal_table(@NotNull Sql92Parser.Normal_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#normal_table}.
	 * @param ctx the parse tree
	 */
	void exitNormal_table(@NotNull Sql92Parser.Normal_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#string_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_value_expression(@NotNull Sql92Parser.String_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#string_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_value_expression(@NotNull Sql92Parser.String_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull Sql92Parser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull Sql92Parser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#collate_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollate_clause(@NotNull Sql92Parser.Collate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#collate_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollate_clause(@NotNull Sql92Parser.Collate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_select_statement}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_select_statement(@NotNull Sql92Parser.Dynamic_select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_select_statement}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_select_statement(@NotNull Sql92Parser.Dynamic_select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(@NotNull Sql92Parser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(@NotNull Sql92Parser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#select_sublists}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sublists(@NotNull Sql92Parser.Select_sublistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#select_sublists}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sublists(@NotNull Sql92Parser.Select_sublistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_value_expression(@NotNull Sql92Parser.Bit_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_value_expression(@NotNull Sql92Parser.Bit_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(@NotNull Sql92Parser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(@NotNull Sql92Parser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#case_abbreviation}.
	 * @param ctx the parse tree
	 */
	void enterCase_abbreviation(@NotNull Sql92Parser.Case_abbreviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#case_abbreviation}.
	 * @param ctx the parse tree
	 */
	void exitCase_abbreviation(@NotNull Sql92Parser.Case_abbreviationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#null_predicate}.
	 * @param ctx the parse tree
	 */
	void enterNull_predicate(@NotNull Sql92Parser.Null_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#null_predicate}.
	 * @param ctx the parse tree
	 */
	void exitNull_predicate(@NotNull Sql92Parser.Null_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_collation_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_collation_statement(@NotNull Sql92Parser.Drop_collation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_collation_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_collation_statement(@NotNull Sql92Parser.Drop_collation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cursor_specification}.
	 * @param ctx the parse tree
	 */
	void enterCursor_specification(@NotNull Sql92Parser.Cursor_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cursor_specification}.
	 * @param ctx the parse tree
	 */
	void exitCursor_specification(@NotNull Sql92Parser.Cursor_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_when_clause(@NotNull Sql92Parser.Simple_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_when_clause(@NotNull Sql92Parser.Simple_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_fetch_statement(@NotNull Sql92Parser.Dynamic_fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_fetch_statement(@NotNull Sql92Parser.Dynamic_fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#quantified_comparision_predicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_comparision_predicate(@NotNull Sql92Parser.Quantified_comparision_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#quantified_comparision_predicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_comparision_predicate(@NotNull Sql92Parser.Quantified_comparision_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_literal(@NotNull Sql92Parser.Bit_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_literal(@NotNull Sql92Parser.Bit_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(@NotNull Sql92Parser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(@NotNull Sql92Parser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull Sql92Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull Sql92Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#standard_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterStandard_collation_name(@NotNull Sql92Parser.Standard_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#standard_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitStandard_collation_name(@NotNull Sql92Parser.Standard_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#corresponding_column_list}.
	 * @param ctx the parse tree
	 */
	void enterCorresponding_column_list(@NotNull Sql92Parser.Corresponding_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#corresponding_column_list}.
	 * @param ctx the parse tree
	 */
	void exitCorresponding_column_list(@NotNull Sql92Parser.Corresponding_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterval_qualifier(@NotNull Sql92Parser.Interval_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterval_qualifier(@NotNull Sql92Parser.Interval_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_column_default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_default_clause(@NotNull Sql92Parser.Drop_column_default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_column_default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_default_clause(@NotNull Sql92Parser.Drop_column_default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_domain_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_domain_constraint_definition(@NotNull Sql92Parser.Drop_domain_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_domain_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_domain_constraint_definition(@NotNull Sql92Parser.Drop_domain_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#value_specification}.
	 * @param ctx the parse tree
	 */
	void enterValue_specification(@NotNull Sql92Parser.Value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#value_specification}.
	 * @param ctx the parse tree
	 */
	void exitValue_specification(@NotNull Sql92Parser.Value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#value_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression(@NotNull Sql92Parser.Value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#value_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression(@NotNull Sql92Parser.Value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#unique_column_list}.
	 * @param ctx the parse tree
	 */
	void enterUnique_column_list(@NotNull Sql92Parser.Unique_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#unique_column_list}.
	 * @param ctx the parse tree
	 */
	void exitUnique_column_list(@NotNull Sql92Parser.Unique_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(@NotNull Sql92Parser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(@NotNull Sql92Parser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name_clause(@NotNull Sql92Parser.Schema_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name_clause(@NotNull Sql92Parser.Schema_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_diagnostics_information}.
	 * @param ctx the parse tree
	 */
	void enterSql_diagnostics_information(@NotNull Sql92Parser.Sql_diagnostics_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_diagnostics_information}.
	 * @param ctx the parse tree
	 */
	void exitSql_diagnostics_information(@NotNull Sql92Parser.Sql_diagnostics_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_authorization_clause}.
	 * @param ctx the parse tree
	 */
	void enterModule_authorization_clause(@NotNull Sql92Parser.Module_authorization_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_authorization_clause}.
	 * @param ctx the parse tree
	 */
	void exitModule_authorization_clause(@NotNull Sql92Parser.Module_authorization_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#levels_clause}.
	 * @param ctx the parse tree
	 */
	void enterLevels_clause(@NotNull Sql92Parser.Levels_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#levels_clause}.
	 * @param ctx the parse tree
	 */
	void exitLevels_clause(@NotNull Sql92Parser.Levels_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_single_row_select_statement}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_single_row_select_statement(@NotNull Sql92Parser.Dynamic_single_row_select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_single_row_select_statement}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_single_row_select_statement(@NotNull Sql92Parser.Dynamic_single_row_select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_element}.
	 * @param ctx the parse tree
	 */
	void enterSchema_element(@NotNull Sql92Parser.Schema_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_element}.
	 * @param ctx the parse tree
	 */
	void exitSchema_element(@NotNull Sql92Parser.Schema_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void enterModule_character_set_specification(@NotNull Sql92Parser.Module_character_set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void exitModule_character_set_specification(@NotNull Sql92Parser.Module_character_set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHost_identifier(@NotNull Sql92Parser.Host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHost_identifier(@NotNull Sql92Parser.Host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_string_type}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_type(@NotNull Sql92Parser.Bit_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_string_type}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_type(@NotNull Sql92Parser.Bit_string_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#connection_target}.
	 * @param ctx the parse tree
	 */
	void enterConnection_target(@NotNull Sql92Parser.Connection_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#connection_target}.
	 * @param ctx the parse tree
	 */
	void exitConnection_target(@NotNull Sql92Parser.Connection_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_primary}.
	 * @param ctx the parse tree
	 */
	void enterInterval_primary(@NotNull Sql92Parser.Interval_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_primary}.
	 * @param ctx the parse tree
	 */
	void exitInterval_primary(@NotNull Sql92Parser.Interval_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#condition_information_item_name}.
	 * @param ctx the parse tree
	 */
	void enterCondition_information_item_name(@NotNull Sql92Parser.Condition_information_item_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#condition_information_item_name}.
	 * @param ctx the parse tree
	 */
	void exitCondition_information_item_name(@NotNull Sql92Parser.Condition_information_item_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#position_expression}.
	 * @param ctx the parse tree
	 */
	void enterPosition_expression(@NotNull Sql92Parser.Position_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#position_expression}.
	 * @param ctx the parse tree
	 */
	void exitPosition_expression(@NotNull Sql92Parser.Position_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(@NotNull Sql92Parser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(@NotNull Sql92Parser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#result_using_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_using_clause(@NotNull Sql92Parser.Result_using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#result_using_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_using_clause(@NotNull Sql92Parser.Result_using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(@NotNull Sql92Parser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(@NotNull Sql92Parser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#object_column}.
	 * @param ctx the parse tree
	 */
	void enterObject_column(@NotNull Sql92Parser.Object_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#object_column}.
	 * @param ctx the parse tree
	 */
	void exitObject_column(@NotNull Sql92Parser.Object_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#between_predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween_predicate(@NotNull Sql92Parser.Between_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#between_predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween_predicate(@NotNull Sql92Parser.Between_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#allocate_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_descriptor_statement(@NotNull Sql92Parser.Allocate_descriptor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#allocate_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_descriptor_statement(@NotNull Sql92Parser.Allocate_descriptor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#check_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterCheck_constraint_definition(@NotNull Sql92Parser.Check_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#check_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitCheck_constraint_definition(@NotNull Sql92Parser.Check_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_column_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_action(@NotNull Sql92Parser.Alter_column_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_column_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_action(@NotNull Sql92Parser.Alter_column_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#translation_name}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_name(@NotNull Sql92Parser.Translation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#translation_name}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_name(@NotNull Sql92Parser.Translation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_sql_data_statement(@NotNull Sql92Parser.Prepable_sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_sql_data_statement(@NotNull Sql92Parser.Prepable_sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#direct_sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterDirect_sql_statement(@NotNull Sql92Parser.Direct_sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#direct_sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitDirect_sql_statement(@NotNull Sql92Parser.Direct_sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#external_translation_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_translation_name(@NotNull Sql92Parser.External_translation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#external_translation_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_translation_name(@NotNull Sql92Parser.External_translation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_leading_field_precision}.
	 * @param ctx the parse tree
	 */
	void enterInterval_leading_field_precision(@NotNull Sql92Parser.Interval_leading_field_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_leading_field_precision}.
	 * @param ctx the parse tree
	 */
	void exitInterval_leading_field_precision(@NotNull Sql92Parser.Interval_leading_field_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_local_time_zone_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_local_time_zone_statement(@NotNull Sql92Parser.Set_local_time_zone_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_local_time_zone_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_local_time_zone_statement(@NotNull Sql92Parser.Set_local_time_zone_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_session_authorization_identifier_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_authorization_identifier_statement(@NotNull Sql92Parser.Set_session_authorization_identifier_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_session_authorization_identifier_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_authorization_identifier_statement(@NotNull Sql92Parser.Set_session_authorization_identifier_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_intersect_rel}.
	 * @param ctx the parse tree
	 */
	void enterQuery_intersect_rel(@NotNull Sql92Parser.Query_intersect_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_intersect_rel}.
	 * @param ctx the parse tree
	 */
	void exitQuery_intersect_rel(@NotNull Sql92Parser.Query_intersect_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_domain_statement(@NotNull Sql92Parser.Drop_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_domain_statement(@NotNull Sql92Parser.Drop_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#indicator_variable}.
	 * @param ctx the parse tree
	 */
	void enterIndicator_variable(@NotNull Sql92Parser.Indicator_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#indicator_variable}.
	 * @param ctx the parse tree
	 */
	void exitIndicator_variable(@NotNull Sql92Parser.Indicator_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#comparision_predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparision_predicate(@NotNull Sql92Parser.Comparision_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#comparision_predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparision_predicate(@NotNull Sql92Parser.Comparision_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_domain_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_domain_action(@NotNull Sql92Parser.Alter_domain_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_domain_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_domain_action(@NotNull Sql92Parser.Alter_domain_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trim_character}.
	 * @param ctx the parse tree
	 */
	void enterTrim_character(@NotNull Sql92Parser.Trim_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trim_character}.
	 * @param ctx the parse tree
	 */
	void exitTrim_character(@NotNull Sql92Parser.Trim_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_type}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_type(@NotNull Sql92Parser.Datetime_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_type}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_type(@NotNull Sql92Parser.Datetime_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#insert_columns_and_source}.
	 * @param ctx the parse tree
	 */
	void enterInsert_columns_and_source(@NotNull Sql92Parser.Insert_columns_and_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#insert_columns_and_source}.
	 * @param ctx the parse tree
	 */
	void exitInsert_columns_and_source(@NotNull Sql92Parser.Insert_columns_and_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#existing_character_set_name}.
	 * @param ctx the parse tree
	 */
	void enterExisting_character_set_name(@NotNull Sql92Parser.Existing_character_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#existing_character_set_name}.
	 * @param ctx the parse tree
	 */
	void exitExisting_character_set_name(@NotNull Sql92Parser.Existing_character_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_primary(@NotNull Sql92Parser.Datetime_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_primary(@NotNull Sql92Parser.Datetime_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#variable_specification}.
	 * @param ctx the parse tree
	 */
	void enterVariable_specification(@NotNull Sql92Parser.Variable_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#variable_specification}.
	 * @param ctx the parse tree
	 */
	void exitVariable_specification(@NotNull Sql92Parser.Variable_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSet_qualifier(@NotNull Sql92Parser.Set_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSet_qualifier(@NotNull Sql92Parser.Set_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#select_statement_single_row}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement_single_row(@NotNull Sql92Parser.Select_statement_single_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#select_statement_single_row}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement_single_row(@NotNull Sql92Parser.Select_statement_single_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sort_specification_list}.
	 * @param ctx the parse tree
	 */
	void enterSort_specification_list(@NotNull Sql92Parser.Sort_specification_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sort_specification_list}.
	 * @param ctx the parse tree
	 */
	void exitSort_specification_list(@NotNull Sql92Parser.Sort_specification_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#current_date_value_function}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_date_value_function(@NotNull Sql92Parser.Current_date_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#current_date_value_function}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_date_value_function(@NotNull Sql92Parser.Current_date_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#extended_statement_name}.
	 * @param ctx the parse tree
	 */
	void enterExtended_statement_name(@NotNull Sql92Parser.Extended_statement_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#extended_statement_name}.
	 * @param ctx the parse tree
	 */
	void exitExtended_statement_name(@NotNull Sql92Parser.Extended_statement_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#select_target_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_target_list(@NotNull Sql92Parser.Select_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#select_target_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_target_list(@NotNull Sql92Parser.Select_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#explicit_table}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_table(@NotNull Sql92Parser.Explicit_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#explicit_table}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_table(@NotNull Sql92Parser.Explicit_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#grouping_column_reference}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_column_reference(@NotNull Sql92Parser.Grouping_column_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#grouping_column_reference}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_column_reference(@NotNull Sql92Parser.Grouping_column_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(@NotNull Sql92Parser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(@NotNull Sql92Parser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#collation_sequence_definition}.
	 * @param ctx the parse tree
	 */
	void enterCollation_sequence_definition(@NotNull Sql92Parser.Collation_sequence_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#collation_sequence_definition}.
	 * @param ctx the parse tree
	 */
	void exitCollation_sequence_definition(@NotNull Sql92Parser.Collation_sequence_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#statement_information}.
	 * @param ctx the parse tree
	 */
	void enterStatement_information(@NotNull Sql92Parser.Statement_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#statement_information}.
	 * @param ctx the parse tree
	 */
	void exitStatement_information(@NotNull Sql92Parser.Statement_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_substring_function}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_substring_function(@NotNull Sql92Parser.Character_substring_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_substring_function}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_substring_function(@NotNull Sql92Parser.Character_substring_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#status_parameter}.
	 * @param ctx the parse tree
	 */
	void enterStatus_parameter(@NotNull Sql92Parser.Status_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#status_parameter}.
	 * @param ctx the parse tree
	 */
	void exitStatus_parameter(@NotNull Sql92Parser.Status_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#indicator_parameter}.
	 * @param ctx the parse tree
	 */
	void enterIndicator_parameter(@NotNull Sql92Parser.Indicator_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#indicator_parameter}.
	 * @param ctx the parse tree
	 */
	void exitIndicator_parameter(@NotNull Sql92Parser.Indicator_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_primary}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_primary(@NotNull Sql92Parser.Character_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_primary}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_primary(@NotNull Sql92Parser.Character_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#unique_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnique_constraint_definition(@NotNull Sql92Parser.Unique_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#unique_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnique_constraint_definition(@NotNull Sql92Parser.Unique_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_names_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_names_statement(@NotNull Sql92Parser.Set_names_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_names_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_names_statement(@NotNull Sql92Parser.Set_names_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSchema_authorization_identifier(@NotNull Sql92Parser.Schema_authorization_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSchema_authorization_identifier(@NotNull Sql92Parser.Schema_authorization_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#get_diagnostics_statement}.
	 * @param ctx the parse tree
	 */
	void enterGet_diagnostics_statement(@NotNull Sql92Parser.Get_diagnostics_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#get_diagnostics_statement}.
	 * @param ctx the parse tree
	 */
	void exitGet_diagnostics_statement(@NotNull Sql92Parser.Get_diagnostics_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_translation}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_translation(@NotNull Sql92Parser.Character_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_translation}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_translation(@NotNull Sql92Parser.Character_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_literal}.
	 * @param ctx the parse tree
	 */
	void enterInterval_literal(@NotNull Sql92Parser.Interval_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_literal}.
	 * @param ctx the parse tree
	 */
	void exitInterval_literal(@NotNull Sql92Parser.Interval_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trim_operands}.
	 * @param ctx the parse tree
	 */
	void enterTrim_operands(@NotNull Sql92Parser.Trim_operandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trim_operands}.
	 * @param ctx the parse tree
	 */
	void exitTrim_operands(@NotNull Sql92Parser.Trim_operandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#pad_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPad_attribute(@NotNull Sql92Parser.Pad_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#pad_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPad_attribute(@NotNull Sql92Parser.Pad_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_connection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_connection_statement(@NotNull Sql92Parser.Sql_connection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_connection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_connection_statement(@NotNull Sql92Parser.Sql_connection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#implementation_defined_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_defined_collation_name(@NotNull Sql92Parser.Implementation_defined_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#implementation_defined_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_defined_collation_name(@NotNull Sql92Parser.Implementation_defined_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#referencing_columns}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_columns(@NotNull Sql92Parser.Referencing_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#referencing_columns}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_columns(@NotNull Sql92Parser.Referencing_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#unsigned_literal}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_literal(@NotNull Sql92Parser.Unsigned_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#unsigned_literal}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_literal(@NotNull Sql92Parser.Unsigned_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_domain_statement(@NotNull Sql92Parser.Alter_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_domain_statement(@NotNull Sql92Parser.Alter_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_catalog_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_catalog_statement(@NotNull Sql92Parser.Set_catalog_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_catalog_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_catalog_statement(@NotNull Sql92Parser.Set_catalog_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trasaction_mode}.
	 * @param ctx the parse tree
	 */
	void enterTrasaction_mode(@NotNull Sql92Parser.Trasaction_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trasaction_mode}.
	 * @param ctx the parse tree
	 */
	void exitTrasaction_mode(@NotNull Sql92Parser.Trasaction_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sublist(@NotNull Sql92Parser.Select_sublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sublist(@NotNull Sql92Parser.Select_sublistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#parameter_using_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_using_clause(@NotNull Sql92Parser.Parameter_using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#parameter_using_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_using_clause(@NotNull Sql92Parser.Parameter_using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#in_value_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_value_list(@NotNull Sql92Parser.In_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#in_value_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_value_list(@NotNull Sql92Parser.In_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull Sql92Parser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull Sql92Parser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#null_specification}.
	 * @param ctx the parse tree
	 */
	void enterNull_specification(@NotNull Sql92Parser.Null_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#null_specification}.
	 * @param ctx the parse tree
	 */
	void exitNull_specification(@NotNull Sql92Parser.Null_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#numeric_primary}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_primary(@NotNull Sql92Parser.Numeric_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#numeric_primary}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_primary(@NotNull Sql92Parser.Numeric_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull Sql92Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull Sql92Parser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trim_function}.
	 * @param ctx the parse tree
	 */
	void enterTrim_function(@NotNull Sql92Parser.Trim_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trim_function}.
	 * @param ctx the parse tree
	 */
	void exitTrim_function(@NotNull Sql92Parser.Trim_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#match_predicate}.
	 * @param ctx the parse tree
	 */
	void enterMatch_predicate(@NotNull Sql92Parser.Match_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#match_predicate}.
	 * @param ctx the parse tree
	 */
	void exitMatch_predicate(@NotNull Sql92Parser.Match_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#add_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column_definition(@NotNull Sql92Parser.Add_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#add_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column_definition(@NotNull Sql92Parser.Add_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull Sql92Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull Sql92Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_server_name}.
	 * @param ctx the parse tree
	 */
	void enterSql_server_name(@NotNull Sql92Parser.Sql_server_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_server_name}.
	 * @param ctx the parse tree
	 */
	void exitSql_server_name(@NotNull Sql92Parser.Sql_server_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#connect_statement}.
	 * @param ctx the parse tree
	 */
	void enterConnect_statement(@NotNull Sql92Parser.Connect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#connect_statement}.
	 * @param ctx the parse tree
	 */
	void exitConnect_statement(@NotNull Sql92Parser.Connect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#local_table_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_table_name(@NotNull Sql92Parser.Local_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#local_table_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_table_name(@NotNull Sql92Parser.Local_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#length_expression}.
	 * @param ctx the parse tree
	 */
	void enterLength_expression(@NotNull Sql92Parser.Length_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#length_expression}.
	 * @param ctx the parse tree
	 */
	void exitLength_expression(@NotNull Sql92Parser.Length_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#describe_output_statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_output_statement(@NotNull Sql92Parser.Describe_output_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#describe_output_statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_output_statement(@NotNull Sql92Parser.Describe_output_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_translation_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_translation_name(@NotNull Sql92Parser.Schema_translation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_translation_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_translation_name(@NotNull Sql92Parser.Schema_translation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_character_set_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_character_set_name(@NotNull Sql92Parser.Schema_character_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_character_set_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_character_set_name(@NotNull Sql92Parser.Schema_character_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Sql92Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Sql92Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint(@NotNull Sql92Parser.Domain_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint(@NotNull Sql92Parser.Domain_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#isolation_level}.
	 * @param ctx the parse tree
	 */
	void enterIsolation_level(@NotNull Sql92Parser.Isolation_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#isolation_level}.
	 * @param ctx the parse tree
	 */
	void exitIsolation_level(@NotNull Sql92Parser.Isolation_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_term}.
	 * @param ctx the parse tree
	 */
	void enterInterval_term(@NotNull Sql92Parser.Interval_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_term}.
	 * @param ctx the parse tree
	 */
	void exitInterval_term(@NotNull Sql92Parser.Interval_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#referenced_table_and_columns}.
	 * @param ctx the parse tree
	 */
	void enterReferenced_table_and_columns(@NotNull Sql92Parser.Referenced_table_and_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#referenced_table_and_columns}.
	 * @param ctx the parse tree
	 */
	void exitReferenced_table_and_columns(@NotNull Sql92Parser.Referenced_table_and_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(@NotNull Sql92Parser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(@NotNull Sql92Parser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_translation_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_translation_statement(@NotNull Sql92Parser.Drop_translation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_translation_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_translation_statement(@NotNull Sql92Parser.Drop_translation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_data_statement(@NotNull Sql92Parser.Sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_data_statement(@NotNull Sql92Parser.Sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#match_value}.
	 * @param ctx the parse tree
	 */
	void enterMatch_value(@NotNull Sql92Parser.Match_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#match_value}.
	 * @param ctx the parse tree
	 */
	void exitMatch_value(@NotNull Sql92Parser.Match_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#direct_select_statement_multiple_rows}.
	 * @param ctx the parse tree
	 */
	void enterDirect_select_statement_multiple_rows(@NotNull Sql92Parser.Direct_select_statement_multiple_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#direct_select_statement_multiple_rows}.
	 * @param ctx the parse tree
	 */
	void exitDirect_select_statement_multiple_rows(@NotNull Sql92Parser.Direct_select_statement_multiple_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(@NotNull Sql92Parser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(@NotNull Sql92Parser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_value_specification_1}.
	 * @param ctx the parse tree
	 */
	void enterSimple_value_specification_1(@NotNull Sql92Parser.Simple_value_specification_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_value_specification_1}.
	 * @param ctx the parse tree
	 */
	void exitSimple_value_specification_1(@NotNull Sql92Parser.Simple_value_specification_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_value_specification_2}.
	 * @param ctx the parse tree
	 */
	void enterSimple_value_specification_2(@NotNull Sql92Parser.Simple_value_specification_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_value_specification_2}.
	 * @param ctx the parse tree
	 */
	void exitSimple_value_specification_2(@NotNull Sql92Parser.Simple_value_specification_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_language_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSql_language_identifier(@NotNull Sql92Parser.Sql_language_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_language_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSql_language_identifier(@NotNull Sql92Parser.Sql_language_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#condition_information_item}.
	 * @param ctx the parse tree
	 */
	void enterCondition_information_item(@NotNull Sql92Parser.Condition_information_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#condition_information_item}.
	 * @param ctx the parse tree
	 */
	void exitCondition_information_item(@NotNull Sql92Parser.Condition_information_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#start_position}.
	 * @param ctx the parse tree
	 */
	void enterStart_position(@NotNull Sql92Parser.Start_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#start_position}.
	 * @param ctx the parse tree
	 */
	void exitStart_position(@NotNull Sql92Parser.Start_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#extract_field}.
	 * @param ctx the parse tree
	 */
	void enterExtract_field(@NotNull Sql92Parser.Extract_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#extract_field}.
	 * @param ctx the parse tree
	 */
	void exitExtract_field(@NotNull Sql92Parser.Extract_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#constraint_name_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name_list(@NotNull Sql92Parser.Constraint_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#constraint_name_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name_list(@NotNull Sql92Parser.Constraint_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#referential_action}.
	 * @param ctx the parse tree
	 */
	void enterReferential_action(@NotNull Sql92Parser.Referential_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#referential_action}.
	 * @param ctx the parse tree
	 */
	void exitReferential_action(@NotNull Sql92Parser.Referential_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#add_table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_table_constraint_definition(@NotNull Sql92Parser.Add_table_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#add_table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_table_constraint_definition(@NotNull Sql92Parser.Add_table_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#octet_length_expression}.
	 * @param ctx the parse tree
	 */
	void enterOctet_length_expression(@NotNull Sql92Parser.Octet_length_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#octet_length_expression}.
	 * @param ctx the parse tree
	 */
	void exitOctet_length_expression(@NotNull Sql92Parser.Octet_length_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_target_specification}.
	 * @param ctx the parse tree
	 */
	void enterSimple_target_specification(@NotNull Sql92Parser.Simple_target_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_target_specification}.
	 * @param ctx the parse tree
	 */
	void exitSimple_target_specification(@NotNull Sql92Parser.Simple_target_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull Sql92Parser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull Sql92Parser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#as_clause}.
	 * @param ctx the parse tree
	 */
	void enterAs_clause(@NotNull Sql92Parser.As_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#as_clause}.
	 * @param ctx the parse tree
	 */
	void exitAs_clause(@NotNull Sql92Parser.As_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#delete_statement_searched}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_searched(@NotNull Sql92Parser.Delete_statement_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#delete_statement_searched}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_searched(@NotNull Sql92Parser.Delete_statement_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_sql_schema_statement(@NotNull Sql92Parser.Prepable_sql_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_sql_schema_statement(@NotNull Sql92Parser.Prepable_sql_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#references_specification}.
	 * @param ctx the parse tree
	 */
	void enterReferences_specification(@NotNull Sql92Parser.References_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#references_specification}.
	 * @param ctx the parse tree
	 */
	void exitReferences_specification(@NotNull Sql92Parser.References_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_diagnostics_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_diagnostics_statement(@NotNull Sql92Parser.Sql_diagnostics_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_diagnostics_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_diagnostics_statement(@NotNull Sql92Parser.Sql_diagnostics_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_factor}.
	 * @param ctx the parse tree
	 */
	void enterInterval_factor(@NotNull Sql92Parser.Interval_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_factor}.
	 * @param ctx the parse tree
	 */
	void exitInterval_factor(@NotNull Sql92Parser.Interval_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#statement_name}.
	 * @param ctx the parse tree
	 */
	void enterStatement_name(@NotNull Sql92Parser.Statement_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#statement_name}.
	 * @param ctx the parse tree
	 */
	void exitStatement_name(@NotNull Sql92Parser.Statement_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_item_information}.
	 * @param ctx the parse tree
	 */
	void enterSet_item_information(@NotNull Sql92Parser.Set_item_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_item_information}.
	 * @param ctx the parse tree
	 */
	void exitSet_item_information(@NotNull Sql92Parser.Set_item_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#mumps_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMumps_host_identifier(@NotNull Sql92Parser.Mumps_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#mumps_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMumps_host_identifier(@NotNull Sql92Parser.Mumps_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(@NotNull Sql92Parser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(@NotNull Sql92Parser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sort_key}.
	 * @param ctx the parse tree
	 */
	void enterSort_key(@NotNull Sql92Parser.Sort_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sort_key}.
	 * @param ctx the parse tree
	 */
	void exitSort_key(@NotNull Sql92Parser.Sort_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_cursor_name(@NotNull Sql92Parser.Dynamic_cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_cursor_name(@NotNull Sql92Parser.Dynamic_cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#level_of_isolation}.
	 * @param ctx the parse tree
	 */
	void enterLevel_of_isolation(@NotNull Sql92Parser.Level_of_isolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#level_of_isolation}.
	 * @param ctx the parse tree
	 */
	void exitLevel_of_isolation(@NotNull Sql92Parser.Level_of_isolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#default_specification}.
	 * @param ctx the parse tree
	 */
	void enterDefault_specification(@NotNull Sql92Parser.Default_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#default_specification}.
	 * @param ctx the parse tree
	 */
	void exitDefault_specification(@NotNull Sql92Parser.Default_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#update_source}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_source(@NotNull Sql92Parser.Update_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#update_source}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_source(@NotNull Sql92Parser.Update_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(@NotNull Sql92Parser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(@NotNull Sql92Parser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_definition(@NotNull Sql92Parser.Drop_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_definition(@NotNull Sql92Parser.Drop_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#referential_triggered_action}.
	 * @param ctx the parse tree
	 */
	void enterReferential_triggered_action(@NotNull Sql92Parser.Referential_triggered_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#referential_triggered_action}.
	 * @param ctx the parse tree
	 */
	void exitReferential_triggered_action(@NotNull Sql92Parser.Referential_triggered_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cobol_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCobol_host_identifier(@NotNull Sql92Parser.Cobol_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cobol_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCobol_host_identifier(@NotNull Sql92Parser.Cobol_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#start_field}.
	 * @param ctx the parse tree
	 */
	void enterStart_field(@NotNull Sql92Parser.Start_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#start_field}.
	 * @param ctx the parse tree
	 */
	void exitStart_field(@NotNull Sql92Parser.Start_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterModule_name_clause(@NotNull Sql92Parser.Module_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitModule_name_clause(@NotNull Sql92Parser.Module_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_open_statement}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_open_statement(@NotNull Sql92Parser.Dynamic_open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_open_statement}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_open_statement(@NotNull Sql92Parser.Dynamic_open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#external_collation}.
	 * @param ctx the parse tree
	 */
	void enterExternal_collation(@NotNull Sql92Parser.External_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#external_collation}.
	 * @param ctx the parse tree
	 */
	void exitExternal_collation(@NotNull Sql92Parser.External_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void enterSchema_definition(@NotNull Sql92Parser.Schema_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void exitSchema_definition(@NotNull Sql92Parser.Schema_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#statement_information_item_name}.
	 * @param ctx the parse tree
	 */
	void enterStatement_information_item_name(@NotNull Sql92Parser.Statement_information_item_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#statement_information_item_name}.
	 * @param ctx the parse tree
	 */
	void exitStatement_information_item_name(@NotNull Sql92Parser.Statement_information_item_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#derived_column_list}.
	 * @param ctx the parse tree
	 */
	void enterDerived_column_list(@NotNull Sql92Parser.Derived_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#derived_column_list}.
	 * @param ctx the parse tree
	 */
	void exitDerived_column_list(@NotNull Sql92Parser.Derived_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#row_value_constructor_list}.
	 * @param ctx the parse tree
	 */
	void enterRow_value_constructor_list(@NotNull Sql92Parser.Row_value_constructor_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#row_value_constructor_list}.
	 * @param ctx the parse tree
	 */
	void exitRow_value_constructor_list(@NotNull Sql92Parser.Row_value_constructor_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#general_value_specification}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_value_specification(@NotNull Sql92Parser.General_value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#general_value_specification}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_value_specification(@NotNull Sql92Parser.General_value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#c_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterC_host_identifier(@NotNull Sql92Parser.C_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#c_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitC_host_identifier(@NotNull Sql92Parser.C_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#domain_name}.
	 * @param ctx the parse tree
	 */
	void enterDomain_name(@NotNull Sql92Parser.Domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#domain_name}.
	 * @param ctx the parse tree
	 */
	void exitDomain_name(@NotNull Sql92Parser.Domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#actual_identifier}.
	 * @param ctx the parse tree
	 */
	void enterActual_identifier(@NotNull Sql92Parser.Actual_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#actual_identifier}.
	 * @param ctx the parse tree
	 */
	void exitActual_identifier(@NotNull Sql92Parser.Actual_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause_list(@NotNull Sql92Parser.Set_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause_list(@NotNull Sql92Parser.Set_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sigle_datetime_field}.
	 * @param ctx the parse tree
	 */
	void enterSigle_datetime_field(@NotNull Sql92Parser.Sigle_datetime_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sigle_datetime_field}.
	 * @param ctx the parse tree
	 */
	void exitSigle_datetime_field(@NotNull Sql92Parser.Sigle_datetime_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification(@NotNull Sql92Parser.Parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification(@NotNull Sql92Parser.Parameter_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_definition(@NotNull Sql92Parser.Table_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_definition(@NotNull Sql92Parser.Table_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(@NotNull Sql92Parser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(@NotNull Sql92Parser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(@NotNull Sql92Parser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(@NotNull Sql92Parser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#assertion_check}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_check(@NotNull Sql92Parser.Assertion_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#assertion_check}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_check(@NotNull Sql92Parser.Assertion_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#in_predicate_value}.
	 * @param ctx the parse tree
	 */
	void enterIn_predicate_value(@NotNull Sql92Parser.In_predicate_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#in_predicate_value}.
	 * @param ctx the parse tree
	 */
	void exitIn_predicate_value(@NotNull Sql92Parser.In_predicate_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(@NotNull Sql92Parser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(@NotNull Sql92Parser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#current_time_value_function}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_time_value_function(@NotNull Sql92Parser.Current_time_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#current_time_value_function}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_time_value_function(@NotNull Sql92Parser.Current_time_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#deallocate_prepared_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_prepared_statement(@NotNull Sql92Parser.Deallocate_prepared_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#deallocate_prepared_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_prepared_statement(@NotNull Sql92Parser.Deallocate_prepared_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#exists_predicate}.
	 * @param ctx the parse tree
	 */
	void enterExists_predicate(@NotNull Sql92Parser.Exists_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#exists_predicate}.
	 * @param ctx the parse tree
	 */
	void exitExists_predicate(@NotNull Sql92Parser.Exists_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#standard_character_repertoire_name}.
	 * @param ctx the parse tree
	 */
	void enterStandard_character_repertoire_name(@NotNull Sql92Parser.Standard_character_repertoire_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#standard_character_repertoire_name}.
	 * @param ctx the parse tree
	 */
	void exitStandard_character_repertoire_name(@NotNull Sql92Parser.Standard_character_repertoire_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#end_field}.
	 * @param ctx the parse tree
	 */
	void enterEnd_field(@NotNull Sql92Parser.End_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#end_field}.
	 * @param ctx the parse tree
	 */
	void exitEnd_field(@NotNull Sql92Parser.End_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#case_operand}.
	 * @param ctx the parse tree
	 */
	void enterCase_operand(@NotNull Sql92Parser.Case_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#case_operand}.
	 * @param ctx the parse tree
	 */
	void exitCase_operand(@NotNull Sql92Parser.Case_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#update_rule}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_rule(@NotNull Sql92Parser.Update_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#update_rule}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_rule(@NotNull Sql92Parser.Update_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull Sql92Parser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull Sql92Parser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_table}.
	 * @param ctx the parse tree
	 */
	void enterSimple_table(@NotNull Sql92Parser.Simple_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_table}.
	 * @param ctx the parse tree
	 */
	void exitSimple_table(@NotNull Sql92Parser.Simple_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#get_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void enterGet_descriptor_statement(@NotNull Sql92Parser.Get_descriptor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#get_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void exitGet_descriptor_statement(@NotNull Sql92Parser.Get_descriptor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_list(@NotNull Sql92Parser.Parameter_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_list(@NotNull Sql92Parser.Parameter_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#direct_sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterDirect_sql_data_statement(@NotNull Sql92Parser.Direct_sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#direct_sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitDirect_sql_data_statement(@NotNull Sql92Parser.Direct_sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#action_list}.
	 * @param ctx the parse tree
	 */
	void enterAction_list(@NotNull Sql92Parser.Action_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#action_list}.
	 * @param ctx the parse tree
	 */
	void exitAction_list(@NotNull Sql92Parser.Action_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#collation_source}.
	 * @param ctx the parse tree
	 */
	void enterCollation_source(@NotNull Sql92Parser.Collation_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#collation_source}.
	 * @param ctx the parse tree
	 */
	void exitCollation_source(@NotNull Sql92Parser.Collation_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#updatability_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdatability_clause(@NotNull Sql92Parser.Updatability_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#updatability_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdatability_clause(@NotNull Sql92Parser.Updatability_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#domain_definition}.
	 * @param ctx the parse tree
	 */
	void enterDomain_definition(@NotNull Sql92Parser.Domain_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#domain_definition}.
	 * @param ctx the parse tree
	 */
	void exitDomain_definition(@NotNull Sql92Parser.Domain_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_positioned(@NotNull Sql92Parser.Delete_statement_positionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_positioned(@NotNull Sql92Parser.Delete_statement_positionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_set_source}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_source(@NotNull Sql92Parser.Character_set_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_set_source}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_source(@NotNull Sql92Parser.Character_set_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull Sql92Parser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull Sql92Parser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(@NotNull Sql92Parser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(@NotNull Sql92Parser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#disconnect_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect_statement(@NotNull Sql92Parser.Disconnect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#disconnect_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect_statement(@NotNull Sql92Parser.Disconnect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#view_definition}.
	 * @param ctx the parse tree
	 */
	void enterView_definition(@NotNull Sql92Parser.View_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#view_definition}.
	 * @param ctx the parse tree
	 */
	void exitView_definition(@NotNull Sql92Parser.View_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#descriptor_name}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor_name(@NotNull Sql92Parser.Descriptor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#descriptor_name}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor_name(@NotNull Sql92Parser.Descriptor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(@NotNull Sql92Parser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(@NotNull Sql92Parser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_field}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_field(@NotNull Sql92Parser.Datetime_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_field}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_field(@NotNull Sql92Parser.Datetime_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull Sql92Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull Sql92Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#source_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void enterSource_character_set_specification(@NotNull Sql92Parser.Source_character_set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#source_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void exitSource_character_set_specification(@NotNull Sql92Parser.Source_character_set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#row_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterRow_value_constructor(@NotNull Sql92Parser.Row_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#row_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitRow_value_constructor(@NotNull Sql92Parser.Row_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(@NotNull Sql92Parser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(@NotNull Sql92Parser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull Sql92Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull Sql92Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_value_expression(@NotNull Sql92Parser.Character_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_value_expression(@NotNull Sql92Parser.Character_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#update_statement_searched}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement_searched(@NotNull Sql92Parser.Update_statement_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#update_statement_searched}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement_searched(@NotNull Sql92Parser.Update_statement_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assertion_statement(@NotNull Sql92Parser.Drop_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assertion_statement(@NotNull Sql92Parser.Drop_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(@NotNull Sql92Parser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(@NotNull Sql92Parser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(@NotNull Sql92Parser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(@NotNull Sql92Parser.Cast_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#unique_specification}.
	 * @param ctx the parse tree
	 */
	void enterUnique_specification(@NotNull Sql92Parser.Unique_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#unique_specification}.
	 * @param ctx the parse tree
	 */
	void exitUnique_specification(@NotNull Sql92Parser.Unique_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_sql_session_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_sql_session_statement(@NotNull Sql92Parser.Prepable_sql_session_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_sql_session_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_sql_session_statement(@NotNull Sql92Parser.Prepable_sql_session_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#grant_definition}.
	 * @param ctx the parse tree
	 */
	void enterGrant_definition(@NotNull Sql92Parser.Grant_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#grant_definition}.
	 * @param ctx the parse tree
	 */
	void exitGrant_definition(@NotNull Sql92Parser.Grant_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_expression(@NotNull Sql92Parser.Table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_expression(@NotNull Sql92Parser.Table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#schema_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_collation_name(@NotNull Sql92Parser.Schema_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#schema_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_collation_name(@NotNull Sql92Parser.Schema_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#get_item_information}.
	 * @param ctx the parse tree
	 */
	void enterGet_item_information(@NotNull Sql92Parser.Get_item_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#get_item_information}.
	 * @param ctx the parse tree
	 */
	void exitGet_item_information(@NotNull Sql92Parser.Get_item_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(@NotNull Sql92Parser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(@NotNull Sql92Parser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(@NotNull Sql92Parser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(@NotNull Sql92Parser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#result_expression}.
	 * @param ctx the parse tree
	 */
	void enterResult_expression(@NotNull Sql92Parser.Result_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#result_expression}.
	 * @param ctx the parse tree
	 */
	void exitResult_expression(@NotNull Sql92Parser.Result_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_constraint_definition(@NotNull Sql92Parser.Drop_table_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_table_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_constraint_definition(@NotNull Sql92Parser.Drop_table_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_set_specification}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_specification(@NotNull Sql92Parser.Character_set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_set_specification}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_specification(@NotNull Sql92Parser.Character_set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cast_operand}.
	 * @param ctx the parse tree
	 */
	void enterCast_operand(@NotNull Sql92Parser.Cast_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cast_operand}.
	 * @param ctx the parse tree
	 */
	void exitCast_operand(@NotNull Sql92Parser.Cast_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#connection_name}.
	 * @param ctx the parse tree
	 */
	void enterConnection_name(@NotNull Sql92Parser.Connection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#connection_name}.
	 * @param ctx the parse tree
	 */
	void exitConnection_name(@NotNull Sql92Parser.Connection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string_literal(@NotNull Sql92Parser.Character_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string_literal(@NotNull Sql92Parser.Character_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_literal}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_literal(@NotNull Sql92Parser.Datetime_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_literal}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_literal(@NotNull Sql92Parser.Datetime_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_precision}.
	 * @param ctx the parse tree
	 */
	void enterTime_precision(@NotNull Sql92Parser.Time_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_precision}.
	 * @param ctx the parse tree
	 */
	void exitTime_precision(@NotNull Sql92Parser.Time_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#join_column_list}.
	 * @param ctx the parse tree
	 */
	void enterJoin_column_list(@NotNull Sql92Parser.Join_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#join_column_list}.
	 * @param ctx the parse tree
	 */
	void exitJoin_column_list(@NotNull Sql92Parser.Join_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_primary}.
	 * @param ctx the parse tree
	 */
	void enterQuery_primary(@NotNull Sql92Parser.Query_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_primary}.
	 * @param ctx the parse tree
	 */
	void exitQuery_primary(@NotNull Sql92Parser.Query_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#referential_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterReferential_constraint_definition(@NotNull Sql92Parser.Referential_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#referential_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitReferential_constraint_definition(@NotNull Sql92Parser.Referential_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#string_length}.
	 * @param ctx the parse tree
	 */
	void enterString_length(@NotNull Sql92Parser.String_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#string_length}.
	 * @param ctx the parse tree
	 */
	void exitString_length(@NotNull Sql92Parser.String_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#delimited_identifier}.
	 * @param ctx the parse tree
	 */
	void enterDelimited_identifier(@NotNull Sql92Parser.Delimited_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#delimited_identifier}.
	 * @param ctx the parse tree
	 */
	void exitDelimited_identifier(@NotNull Sql92Parser.Delimited_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#correlation_specification}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_specification(@NotNull Sql92Parser.Correlation_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#correlation_specification}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_specification(@NotNull Sql92Parser.Correlation_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#non_join_query_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_join_query_expression(@NotNull Sql92Parser.Non_join_query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#non_join_query_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_join_query_expression(@NotNull Sql92Parser.Non_join_query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(@NotNull Sql92Parser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(@NotNull Sql92Parser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#translation_specification}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_specification(@NotNull Sql92Parser.Translation_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#translation_specification}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_specification(@NotNull Sql92Parser.Translation_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression_primary(@NotNull Sql92Parser.Value_expression_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression_primary(@NotNull Sql92Parser.Value_expression_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#char_length_expression}.
	 * @param ctx the parse tree
	 */
	void enterChar_length_expression(@NotNull Sql92Parser.Char_length_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#char_length_expression}.
	 * @param ctx the parse tree
	 */
	void exitChar_length_expression(@NotNull Sql92Parser.Char_length_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#case_specification}.
	 * @param ctx the parse tree
	 */
	void enterCase_specification(@NotNull Sql92Parser.Case_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#case_specification}.
	 * @param ctx the parse tree
	 */
	void exitCase_specification(@NotNull Sql92Parser.Case_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_dynamic_delete_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_delete_statement_positionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_dynamic_delete_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_delete_statement_positionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_domain_default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_domain_default_clause(@NotNull Sql92Parser.Drop_domain_default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_domain_default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_domain_default_clause(@NotNull Sql92Parser.Drop_domain_default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(@NotNull Sql92Parser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(@NotNull Sql92Parser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(@NotNull Sql92Parser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(@NotNull Sql92Parser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull Sql92Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull Sql92Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull Sql92Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull Sql92Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(@NotNull Sql92Parser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(@NotNull Sql92Parser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(@NotNull Sql92Parser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(@NotNull Sql92Parser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#using_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterUsing_descriptor(@NotNull Sql92Parser.Using_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#using_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitUsing_descriptor(@NotNull Sql92Parser.Using_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(@NotNull Sql92Parser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(@NotNull Sql92Parser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#time_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 */
	void enterTime_fractional_seconds_precision(@NotNull Sql92Parser.Time_fractional_seconds_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#time_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 */
	void exitTime_fractional_seconds_precision(@NotNull Sql92Parser.Time_fractional_seconds_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#interval_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_value_expression(@NotNull Sql92Parser.Interval_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#interval_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_value_expression(@NotNull Sql92Parser.Interval_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_value_function}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_value_function(@NotNull Sql92Parser.Character_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_value_function}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_value_function(@NotNull Sql92Parser.Character_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#translation_source}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_source(@NotNull Sql92Parser.Translation_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#translation_source}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_source(@NotNull Sql92Parser.Translation_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#temporary_table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_table_declaration(@NotNull Sql92Parser.Temporary_table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#temporary_table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_table_declaration(@NotNull Sql92Parser.Temporary_table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#hex_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterHex_string_literal(@NotNull Sql92Parser.Hex_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#hex_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitHex_string_literal(@NotNull Sql92Parser.Hex_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_domain_default_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_domain_default_clause(@NotNull Sql92Parser.Set_domain_default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_domain_default_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_domain_default_clause(@NotNull Sql92Parser.Set_domain_default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_length_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_length_expression(@NotNull Sql92Parser.Bit_length_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_length_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_length_expression(@NotNull Sql92Parser.Bit_length_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_descriptor_statement(@NotNull Sql92Parser.Set_descriptor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_descriptor_statement(@NotNull Sql92Parser.Set_descriptor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_parameter_specification(@NotNull Sql92Parser.Dynamic_parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_parameter_specification(@NotNull Sql92Parser.Dynamic_parameter_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_list(@NotNull Sql92Parser.Insert_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_list(@NotNull Sql92Parser.Insert_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#implementation_defined_translation_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_defined_translation_name(@NotNull Sql92Parser.Implementation_defined_translation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#implementation_defined_translation_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_defined_translation_name(@NotNull Sql92Parser.Implementation_defined_translation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_statement_variable}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement_variable(@NotNull Sql92Parser.Sql_statement_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_statement_variable}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement_variable(@NotNull Sql92Parser.Sql_statement_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_delete_statement_positioned(@NotNull Sql92Parser.Dynamic_delete_statement_positionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_delete_statement_positioned(@NotNull Sql92Parser.Dynamic_delete_statement_positionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_value_function}.
	 * @param ctx the parse tree
	 */
	void enterBit_value_function(@NotNull Sql92Parser.Bit_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_value_function}.
	 * @param ctx the parse tree
	 */
	void exitBit_value_function(@NotNull Sql92Parser.Bit_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#transaction_access_mode}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_access_mode(@NotNull Sql92Parser.Transaction_access_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#transaction_access_mode}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_access_mode(@NotNull Sql92Parser.Transaction_access_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#ordering_specification}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_specification(@NotNull Sql92Parser.Ordering_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#ordering_specification}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_specification(@NotNull Sql92Parser.Ordering_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(@NotNull Sql92Parser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(@NotNull Sql92Parser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#pli_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPli_host_identifier(@NotNull Sql92Parser.Pli_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#pli_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPli_host_identifier(@NotNull Sql92Parser.Pli_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull Sql92Parser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull Sql92Parser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(@NotNull Sql92Parser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(@NotNull Sql92Parser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_statement(@NotNull Sql92Parser.Drop_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_statement(@NotNull Sql92Parser.Drop_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#extended_cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterExtended_cursor_name(@NotNull Sql92Parser.Extended_cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#extended_cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitExtended_cursor_name(@NotNull Sql92Parser.Extended_cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#default_option}.
	 * @param ctx the parse tree
	 */
	void enterDefault_option(@NotNull Sql92Parser.Default_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#default_option}.
	 * @param ctx the parse tree
	 */
	void exitDefault_option(@NotNull Sql92Parser.Default_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepare_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepare_statement(@NotNull Sql92Parser.Prepare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepare_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepare_statement(@NotNull Sql92Parser.Prepare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#constraint_name_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name_definition(@NotNull Sql92Parser.Constraint_name_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#constraint_name_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name_definition(@NotNull Sql92Parser.Constraint_name_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#describe_statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_statement(@NotNull Sql92Parser.Describe_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#describe_statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_statement(@NotNull Sql92Parser.Describe_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#general_set_function}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_set_function(@NotNull Sql92Parser.General_set_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#general_set_function}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_set_function(@NotNull Sql92Parser.General_set_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#diagnostics_size}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostics_size(@NotNull Sql92Parser.Diagnostics_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#diagnostics_size}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostics_size(@NotNull Sql92Parser.Diagnostics_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#using_arguments}.
	 * @param ctx the parse tree
	 */
	void enterUsing_arguments(@NotNull Sql92Parser.Using_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#using_arguments}.
	 * @param ctx the parse tree
	 */
	void exitUsing_arguments(@NotNull Sql92Parser.Using_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema_statement(@NotNull Sql92Parser.Set_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema_statement(@NotNull Sql92Parser.Set_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(@NotNull Sql92Parser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(@NotNull Sql92Parser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#extract_expression}.
	 * @param ctx the parse tree
	 */
	void enterExtract_expression(@NotNull Sql92Parser.Extract_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#extract_expression}.
	 * @param ctx the parse tree
	 */
	void exitExtract_expression(@NotNull Sql92Parser.Extract_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#connection_object}.
	 * @param ctx the parse tree
	 */
	void enterConnection_object(@NotNull Sql92Parser.Connection_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#connection_object}.
	 * @param ctx the parse tree
	 */
	void exitConnection_object(@NotNull Sql92Parser.Connection_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(@NotNull Sql92Parser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(@NotNull Sql92Parser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_function_specification}.
	 * @param ctx the parse tree
	 */
	void enterSet_function_specification(@NotNull Sql92Parser.Set_function_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_function_specification}.
	 * @param ctx the parse tree
	 */
	void exitSet_function_specification(@NotNull Sql92Parser.Set_function_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#qualified_local_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_local_table_name(@NotNull Sql92Parser.Qualified_local_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#qualified_local_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_local_table_name(@NotNull Sql92Parser.Qualified_local_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#overlaps_predicate}.
	 * @param ctx the parse tree
	 */
	void enterOverlaps_predicate(@NotNull Sql92Parser.Overlaps_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#overlaps_predicate}.
	 * @param ctx the parse tree
	 */
	void exitOverlaps_predicate(@NotNull Sql92Parser.Overlaps_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#truth_value}.
	 * @param ctx the parse tree
	 */
	void enterTruth_value(@NotNull Sql92Parser.Truth_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#truth_value}.
	 * @param ctx the parse tree
	 */
	void exitTruth_value(@NotNull Sql92Parser.Truth_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#pascal_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPascal_host_identifier(@NotNull Sql92Parser.Pascal_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#pascal_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPascal_host_identifier(@NotNull Sql92Parser.Pascal_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#deallocate_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_descriptor_statement(@NotNull Sql92Parser.Deallocate_descriptor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#deallocate_descriptor_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_descriptor_statement(@NotNull Sql92Parser.Deallocate_descriptor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull Sql92Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull Sql92Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(@NotNull Sql92Parser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(@NotNull Sql92Parser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(@NotNull Sql92Parser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(@NotNull Sql92Parser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull Sql92Parser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull Sql92Parser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(@NotNull Sql92Parser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(@NotNull Sql92Parser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#searched_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearched_when_clause(@NotNull Sql92Parser.Searched_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#searched_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearched_when_clause(@NotNull Sql92Parser.Searched_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_case}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case(@NotNull Sql92Parser.Simple_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_case}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case(@NotNull Sql92Parser.Simple_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#prepable_dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void enterPrepable_dynamic_update_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_update_statement_positionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#prepable_dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void exitPrepable_dynamic_update_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_update_statement_positionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull Sql92Parser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull Sql92Parser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#approximate_numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterApproximate_numeric_type(@NotNull Sql92Parser.Approximate_numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#approximate_numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitApproximate_numeric_type(@NotNull Sql92Parser.Approximate_numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_factor}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_factor(@NotNull Sql92Parser.Datetime_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_factor}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_factor(@NotNull Sql92Parser.Datetime_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#non_second_datetime_field}.
	 * @param ctx the parse tree
	 */
	void enterNon_second_datetime_field(@NotNull Sql92Parser.Non_second_datetime_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#non_second_datetime_field}.
	 * @param ctx the parse tree
	 */
	void exitNon_second_datetime_field(@NotNull Sql92Parser.Non_second_datetime_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_subquery(@NotNull Sql92Parser.Table_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_subquery(@NotNull Sql92Parser.Table_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#grouping_column_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_column_reference_list(@NotNull Sql92Parser.Grouping_column_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#grouping_column_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_column_reference_list(@NotNull Sql92Parser.Grouping_column_reference_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#national_character_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterNational_character_string_literal(@NotNull Sql92Parser.National_character_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#national_character_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitNational_character_string_literal(@NotNull Sql92Parser.National_character_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#ada_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAda_host_identifier(@NotNull Sql92Parser.Ada_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#ada_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAda_host_identifier(@NotNull Sql92Parser.Ada_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#row_subquery}.
	 * @param ctx the parse tree
	 */
	void enterRow_subquery(@NotNull Sql92Parser.Row_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#row_subquery}.
	 * @param ctx the parse tree
	 */
	void exitRow_subquery(@NotNull Sql92Parser.Row_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_descriptor_information}.
	 * @param ctx the parse tree
	 */
	void enterSet_descriptor_information(@NotNull Sql92Parser.Set_descriptor_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_descriptor_information}.
	 * @param ctx the parse tree
	 */
	void exitSet_descriptor_information(@NotNull Sql92Parser.Set_descriptor_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#number_of_conditions}.
	 * @param ctx the parse tree
	 */
	void enterNumber_of_conditions(@NotNull Sql92Parser.Number_of_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#number_of_conditions}.
	 * @param ctx the parse tree
	 */
	void exitNumber_of_conditions(@NotNull Sql92Parser.Number_of_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#numeric_value_function}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value_function(@NotNull Sql92Parser.Numeric_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#numeric_value_function}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value_function(@NotNull Sql92Parser.Numeric_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#embedded_variable_name}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_variable_name(@NotNull Sql92Parser.Embedded_variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#embedded_variable_name}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_variable_name(@NotNull Sql92Parser.Embedded_variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_data_change_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_data_change_statement(@NotNull Sql92Parser.Sql_data_change_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_data_change_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_data_change_statement(@NotNull Sql92Parser.Sql_data_change_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_dynamic_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_dynamic_statement(@NotNull Sql92Parser.Sql_dynamic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_dynamic_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_dynamic_statement(@NotNull Sql92Parser.Sql_dynamic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#view_column_list}.
	 * @param ctx the parse tree
	 */
	void enterView_column_list(@NotNull Sql92Parser.View_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#view_column_list}.
	 * @param ctx the parse tree
	 */
	void exitView_column_list(@NotNull Sql92Parser.View_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sort_specification}.
	 * @param ctx the parse tree
	 */
	void enterSort_specification(@NotNull Sql92Parser.Sort_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sort_specification}.
	 * @param ctx the parse tree
	 */
	void exitSort_specification(@NotNull Sql92Parser.Sort_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#exact_numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterExact_numeric_type(@NotNull Sql92Parser.Exact_numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#exact_numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitExact_numeric_type(@NotNull Sql92Parser.Exact_numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#execute_immediate_statemnet}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate_statemnet(@NotNull Sql92Parser.Execute_immediate_statemnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#execute_immediate_statemnet}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate_statemnet(@NotNull Sql92Parser.Execute_immediate_statemnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_value_expression(@NotNull Sql92Parser.Datetime_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_value_expression(@NotNull Sql92Parser.Datetime_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#form_of_use_conversion}.
	 * @param ctx the parse tree
	 */
	void enterForm_of_use_conversion(@NotNull Sql92Parser.Form_of_use_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#form_of_use_conversion}.
	 * @param ctx the parse tree
	 */
	void exitForm_of_use_conversion(@NotNull Sql92Parser.Form_of_use_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#fortran_host_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFortran_host_identifier(@NotNull Sql92Parser.Fortran_host_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#fortran_host_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFortran_host_identifier(@NotNull Sql92Parser.Fortran_host_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#get_descriptor_information}.
	 * @param ctx the parse tree
	 */
	void enterGet_descriptor_information(@NotNull Sql92Parser.Get_descriptor_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#get_descriptor_information}.
	 * @param ctx the parse tree
	 */
	void exitGet_descriptor_information(@NotNull Sql92Parser.Get_descriptor_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#get_count}.
	 * @param ctx the parse tree
	 */
	void enterGet_count(@NotNull Sql92Parser.Get_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#get_count}.
	 * @param ctx the parse tree
	 */
	void exitGet_count(@NotNull Sql92Parser.Get_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_close_statement}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_close_statement(@NotNull Sql92Parser.Dynamic_close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_close_statement}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_close_statement(@NotNull Sql92Parser.Dynamic_close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(@NotNull Sql92Parser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(@NotNull Sql92Parser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#national_character_string_type}.
	 * @param ctx the parse tree
	 */
	void enterNational_character_string_type(@NotNull Sql92Parser.National_character_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#national_character_string_type}.
	 * @param ctx the parse tree
	 */
	void exitNational_character_string_type(@NotNull Sql92Parser.National_character_string_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void enterTrim_specification(@NotNull Sql92Parser.Trim_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void exitTrim_specification(@NotNull Sql92Parser.Trim_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_target_specification_1}.
	 * @param ctx the parse tree
	 */
	void enterSimple_target_specification_1(@NotNull Sql92Parser.Simple_target_specification_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_target_specification_1}.
	 * @param ctx the parse tree
	 */
	void exitSimple_target_specification_1(@NotNull Sql92Parser.Simple_target_specification_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_target_specification_2}.
	 * @param ctx the parse tree
	 */
	void enterSimple_target_specification_2(@NotNull Sql92Parser.Simple_target_specification_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_target_specification_2}.
	 * @param ctx the parse tree
	 */
	void exitSimple_target_specification_2(@NotNull Sql92Parser.Simple_target_specification_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_definition(@NotNull Sql92Parser.Column_constraint_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_constraint_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_definition(@NotNull Sql92Parser.Column_constraint_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#limited_collation_definition}.
	 * @param ctx the parse tree
	 */
	void enterLimited_collation_definition(@NotNull Sql92Parser.Limited_collation_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#limited_collation_definition}.
	 * @param ctx the parse tree
	 */
	void exitLimited_collation_definition(@NotNull Sql92Parser.Limited_collation_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(@NotNull Sql92Parser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(@NotNull Sql92Parser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#fetch_target_list}.
	 * @param ctx the parse tree
	 */
	void enterFetch_target_list(@NotNull Sql92Parser.Fetch_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#fetch_target_list}.
	 * @param ctx the parse tree
	 */
	void exitFetch_target_list(@NotNull Sql92Parser.Fetch_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_reference}.
	 * @param ctx the parse tree
	 */
	void enterColumn_reference(@NotNull Sql92Parser.Column_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_reference}.
	 * @param ctx the parse tree
	 */
	void exitColumn_reference(@NotNull Sql92Parser.Column_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(@NotNull Sql92Parser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(@NotNull Sql92Parser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(@NotNull Sql92Parser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(@NotNull Sql92Parser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#language_clause}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_clause(@NotNull Sql92Parser.Language_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#language_clause}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_clause(@NotNull Sql92Parser.Language_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#target_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void enterTarget_character_set_specification(@NotNull Sql92Parser.Target_character_set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#target_character_set_specification}.
	 * @param ctx the parse tree
	 */
	void exitTarget_character_set_specification(@NotNull Sql92Parser.Target_character_set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull Sql92Parser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull Sql92Parser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#item_number}.
	 * @param ctx the parse tree
	 */
	void enterItem_number(@NotNull Sql92Parser.Item_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#item_number}.
	 * @param ctx the parse tree
	 */
	void exitItem_number(@NotNull Sql92Parser.Item_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#extract_source}.
	 * @param ctx the parse tree
	 */
	void enterExtract_source(@NotNull Sql92Parser.Extract_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#extract_source}.
	 * @param ctx the parse tree
	 */
	void exitExtract_source(@NotNull Sql92Parser.Extract_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#bit_primary}.
	 * @param ctx the parse tree
	 */
	void enterBit_primary(@NotNull Sql92Parser.Bit_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#bit_primary}.
	 * @param ctx the parse tree
	 */
	void exitBit_primary(@NotNull Sql92Parser.Bit_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#module_contents}.
	 * @param ctx the parse tree
	 */
	void enterModule_contents(@NotNull Sql92Parser.Module_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#module_contents}.
	 * @param ctx the parse tree
	 */
	void exitModule_contents(@NotNull Sql92Parser.Module_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_identifier(@NotNull Sql92Parser.Authorization_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#authorization_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_identifier(@NotNull Sql92Parser.Authorization_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull Sql92Parser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull Sql92Parser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(@NotNull Sql92Parser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(@NotNull Sql92Parser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#revoke_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_statement(@NotNull Sql92Parser.Revoke_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#revoke_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_statement(@NotNull Sql92Parser.Revoke_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#privileges_column_list}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges_column_list(@NotNull Sql92Parser.Privileges_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#privileges_column_list}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges_column_list(@NotNull Sql92Parser.Privileges_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void enterCast_specification(@NotNull Sql92Parser.Cast_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void exitCast_specification(@NotNull Sql92Parser.Cast_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#reference_column_list}.
	 * @param ctx the parse tree
	 */
	void enterReference_column_list(@NotNull Sql92Parser.Reference_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#reference_column_list}.
	 * @param ctx the parse tree
	 */
	void exitReference_column_list(@NotNull Sql92Parser.Reference_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_set_definition}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_definition(@NotNull Sql92Parser.Character_set_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_set_definition}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_definition(@NotNull Sql92Parser.Character_set_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#query_set_rel}.
	 * @param ctx the parse tree
	 */
	void enterQuery_set_rel(@NotNull Sql92Parser.Query_set_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#query_set_rel}.
	 * @param ctx the parse tree
	 */
	void exitQuery_set_rel(@NotNull Sql92Parser.Query_set_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#datetime_value_function}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_value_function(@NotNull Sql92Parser.Datetime_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#datetime_value_function}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_value_function(@NotNull Sql92Parser.Datetime_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_statement(@NotNull Sql92Parser.Drop_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_statement(@NotNull Sql92Parser.Drop_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_transaction_statement(@NotNull Sql92Parser.Sql_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_transaction_statement(@NotNull Sql92Parser.Sql_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#allocate_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_statement(@NotNull Sql92Parser.Allocate_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#allocate_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_statement(@NotNull Sql92Parser.Allocate_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#character_set_name}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_name(@NotNull Sql92Parser.Character_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#character_set_name}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_name(@NotNull Sql92Parser.Character_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#simple_value_specification}.
	 * @param ctx the parse tree
	 */
	void enterSimple_value_specification(@NotNull Sql92Parser.Simple_value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#simple_value_specification}.
	 * @param ctx the parse tree
	 */
	void exitSimple_value_specification(@NotNull Sql92Parser.Simple_value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#fold}.
	 * @param ctx the parse tree
	 */
	void enterFold(@NotNull Sql92Parser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#fold}.
	 * @param ctx the parse tree
	 */
	void exitFold(@NotNull Sql92Parser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#update_statement_position}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement_position(@NotNull Sql92Parser.Update_statement_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#update_statement_position}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement_position(@NotNull Sql92Parser.Update_statement_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull Sql92Parser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull Sql92Parser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#searched_case}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case(@NotNull Sql92Parser.Searched_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#searched_case}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case(@NotNull Sql92Parser.Searched_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_manipulation_statement(@NotNull Sql92Parser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_manipulation_statement(@NotNull Sql92Parser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull Sql92Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull Sql92Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#translation_collation}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_collation(@NotNull Sql92Parser.Translation_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#translation_collation}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_collation(@NotNull Sql92Parser.Translation_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#sql_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_procedure_statement(@NotNull Sql92Parser.Sql_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#sql_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_procedure_statement(@NotNull Sql92Parser.Sql_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_update_statement_positioned(@NotNull Sql92Parser.Dynamic_update_statement_positionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_update_statement_positioned(@NotNull Sql92Parser.Dynamic_update_statement_positionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#standard_translation_name}.
	 * @param ctx the parse tree
	 */
	void enterStandard_translation_name(@NotNull Sql92Parser.Standard_translation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#standard_translation_name}.
	 * @param ctx the parse tree
	 */
	void exitStandard_translation_name(@NotNull Sql92Parser.Standard_translation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#set_connection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_connection_statement(@NotNull Sql92Parser.Set_connection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#set_connection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_connection_statement(@NotNull Sql92Parser.Set_connection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sql92Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Sql92Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql92Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Sql92Parser.LiteralContext ctx);
}