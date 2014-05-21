// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\Sql92.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Sql92Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Sql92Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(@NotNull Sql92Parser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_type(@NotNull Sql92Parser.Interval_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_statement(@NotNull Sql92Parser.Set_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_behaviour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_behaviour(@NotNull Sql92Parser.Drop_behaviourContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(@NotNull Sql92Parser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(@NotNull Sql92Parser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(@NotNull Sql92Parser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(@NotNull Sql92Parser.Scalar_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull Sql92Parser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#occurences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOccurences(@NotNull Sql92Parser.OccurencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(@NotNull Sql92Parser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_statement(@NotNull Sql92Parser.Prepable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#disconnect_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect_object(@NotNull Sql92Parser.Disconnect_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(@NotNull Sql92Parser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(@NotNull Sql92Parser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#target_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_specification(@NotNull Sql92Parser.Target_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#describe_input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_input_statement(@NotNull Sql92Parser.Describe_input_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(@NotNull Sql92Parser.Language_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#delete_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_rule(@NotNull Sql92Parser.Delete_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#scope_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_option(@NotNull Sql92Parser.Scope_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(@NotNull Sql92Parser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_character_set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_character_set_statement(@NotNull Sql92Parser.Drop_character_set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#correlation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_name(@NotNull Sql92Parser.Correlation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#condition_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_information(@NotNull Sql92Parser.Condition_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone(@NotNull Sql92Parser.Time_zoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull Sql92Parser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#collation_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_definition(@NotNull Sql92Parser.Collation_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element_list(@NotNull Sql92Parser.Table_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_factor(@NotNull Sql92Parser.Character_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#named_columns_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_columns_join(@NotNull Sql92Parser.Named_columns_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#external_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_translation(@NotNull Sql92Parser.External_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#external_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_collation_name(@NotNull Sql92Parser.External_collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_fractional_seconds_precision(@NotNull Sql92Parser.Interval_fractional_seconds_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_value_specification(@NotNull Sql92Parser.Unsigned_value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#when_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_operand(@NotNull Sql92Parser.When_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#current_timestamp_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_timestamp_value_function(@NotNull Sql92Parser.Current_timestamp_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#assertion_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_definition(@NotNull Sql92Parser.Assertion_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_definition_statement(@NotNull Sql92Parser.Sql_schema_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_statement_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement_name(@NotNull Sql92Parser.Sql_statement_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_statement(@NotNull Sql92Parser.Sql_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_definition(@NotNull Sql92Parser.Alter_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#like_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_predicate(@NotNull Sql92Parser.Like_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_zone_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_specifier(@NotNull Sql92Parser.Time_zone_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(@NotNull Sql92Parser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_definition(@NotNull Sql92Parser.Table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(@NotNull Sql92Parser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string_type(@NotNull Sql92Parser.Character_string_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_type(@NotNull Sql92Parser.Set_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#catalog_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalog_name(@NotNull Sql92Parser.Catalog_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#row_value_constructor_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_constructor_element(@NotNull Sql92Parser.Row_value_constructor_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#match_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_type(@NotNull Sql92Parser.Match_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#constraint_check_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_check_time(@NotNull Sql92Parser.Constraint_check_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_declare_cursor(@NotNull Sql92Parser.Dynamic_declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(@NotNull Sql92Parser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_constraints_mode_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraints_mode_statement(@NotNull Sql92Parser.Set_constraints_mode_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#descriptor_item_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptor_item_name(@NotNull Sql92Parser.Descriptor_item_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(@NotNull Sql92Parser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_substring_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_substring_function(@NotNull Sql92Parser.Bit_substring_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trim_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_source(@NotNull Sql92Parser.Trim_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#constraint_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_attributes(@NotNull Sql92Parser.Constraint_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_time_zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_time_zone_value(@NotNull Sql92Parser.Set_time_zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#general_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_literal(@NotNull Sql92Parser.General_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_zone_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_field(@NotNull Sql92Parser.Time_zone_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_factor(@NotNull Sql92Parser.Bit_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#system_descriptor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_descriptor_statement(@NotNull Sql92Parser.System_descriptor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#timestamp_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_precision(@NotNull Sql92Parser.Timestamp_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_sql_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_sql_transaction_statement(@NotNull Sql92Parser.Prepable_sql_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#string_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_function(@NotNull Sql92Parser.String_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#derived_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column(@NotNull Sql92Parser.Derived_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_value_constructor_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor_list(@NotNull Sql92Parser.Table_value_constructor_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#regular_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_identifier(@NotNull Sql92Parser.Regular_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_term(@NotNull Sql92Parser.Query_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#translation_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_definition(@NotNull Sql92Parser.Translation_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#statement_information_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_information_item(@NotNull Sql92Parser.Statement_information_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_column_default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_column_default_clause(@NotNull Sql92Parser.Set_column_default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#corresponding_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorresponding_spec(@NotNull Sql92Parser.Corresponding_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#add_domain_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_domain_constraint_definition(@NotNull Sql92Parser.Add_domain_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#escape_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape_character(@NotNull Sql92Parser.Escape_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_authorization_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_authorization_identifier(@NotNull Sql92Parser.Module_authorization_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#join_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_specification(@NotNull Sql92Parser.Join_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull Sql92Parser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_session_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_session_statement(@NotNull Sql92Parser.Sql_session_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(@NotNull Sql92Parser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_term(@NotNull Sql92Parser.Datetime_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#condition_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_number(@NotNull Sql92Parser.Condition_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords(@NotNull Sql92Parser.KeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_dynamic_data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_dynamic_data_statement(@NotNull Sql92Parser.Sql_dynamic_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_character_set_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_character_set_specification(@NotNull Sql92Parser.Schema_character_set_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#fetch_orientation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_orientation(@NotNull Sql92Parser.Fetch_orientationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#numeric_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value_expression(@NotNull Sql92Parser.Numeric_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull Sql92Parser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_action(@NotNull Sql92Parser.Alter_table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_count(@NotNull Sql92Parser.Set_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#general_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_identifier(@NotNull Sql92Parser.General_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#in_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_predicate(@NotNull Sql92Parser.In_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#normal_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_table(@NotNull Sql92Parser.Normal_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#string_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_expression(@NotNull Sql92Parser.String_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(@NotNull Sql92Parser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_clause(@NotNull Sql92Parser.Collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_select_statement(@NotNull Sql92Parser.Dynamic_select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(@NotNull Sql92Parser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#select_sublists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublists(@NotNull Sql92Parser.Select_sublistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_value_expression(@NotNull Sql92Parser.Bit_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(@NotNull Sql92Parser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#case_abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_abbreviation(@NotNull Sql92Parser.Case_abbreviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#null_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_predicate(@NotNull Sql92Parser.Null_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_collation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_collation_statement(@NotNull Sql92Parser.Drop_collation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cursor_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_specification(@NotNull Sql92Parser.Cursor_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_when_clause(@NotNull Sql92Parser.Simple_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_fetch_statement(@NotNull Sql92Parser.Dynamic_fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#quantified_comparision_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_comparision_predicate(@NotNull Sql92Parser.Quantified_comparision_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(@NotNull Sql92Parser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string_literal(@NotNull Sql92Parser.Bit_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(@NotNull Sql92Parser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(@NotNull Sql92Parser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#standard_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_collation_name(@NotNull Sql92Parser.Standard_collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#corresponding_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorresponding_column_list(@NotNull Sql92Parser.Corresponding_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_qualifier(@NotNull Sql92Parser.Interval_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_column_default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_default_clause(@NotNull Sql92Parser.Drop_column_default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_domain_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_domain_constraint_definition(@NotNull Sql92Parser.Drop_domain_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_specification(@NotNull Sql92Parser.Value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression(@NotNull Sql92Parser.Value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#nondoublequote_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNondoublequote_character(@NotNull Sql92Parser.Nondoublequote_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#unique_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_column_list(@NotNull Sql92Parser.Unique_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(@NotNull Sql92Parser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name_clause(@NotNull Sql92Parser.Schema_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_diagnostics_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_diagnostics_information(@NotNull Sql92Parser.Sql_diagnostics_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_authorization_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_authorization_clause(@NotNull Sql92Parser.Module_authorization_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#levels_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevels_clause(@NotNull Sql92Parser.Levels_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_single_row_select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_single_row_select_statement(@NotNull Sql92Parser.Dynamic_single_row_select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_element(@NotNull Sql92Parser.Schema_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_character_set_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_character_set_specification(@NotNull Sql92Parser.Module_character_set_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_identifier(@NotNull Sql92Parser.Host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string_type(@NotNull Sql92Parser.Bit_string_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#connection_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection_target(@NotNull Sql92Parser.Connection_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_primary(@NotNull Sql92Parser.Interval_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#condition_information_item_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_information_item_name(@NotNull Sql92Parser.Condition_information_item_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#position_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_expression(@NotNull Sql92Parser.Position_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(@NotNull Sql92Parser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#result_using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_using_clause(@NotNull Sql92Parser.Result_using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(@NotNull Sql92Parser.Alter_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#object_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_column(@NotNull Sql92Parser.Object_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#between_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_predicate(@NotNull Sql92Parser.Between_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#allocate_descriptor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_descriptor_statement(@NotNull Sql92Parser.Allocate_descriptor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#check_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_constraint_definition(@NotNull Sql92Parser.Check_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_column_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_action(@NotNull Sql92Parser.Alter_column_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#translation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_name(@NotNull Sql92Parser.Translation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#seperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeperator(@NotNull Sql92Parser.SeperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_sql_data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_sql_data_statement(@NotNull Sql92Parser.Prepable_sql_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#direct_sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_sql_statement(@NotNull Sql92Parser.Direct_sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#external_translation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_translation_name(@NotNull Sql92Parser.External_translation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_leading_field_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_leading_field_precision(@NotNull Sql92Parser.Interval_leading_field_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_local_time_zone_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_local_time_zone_statement(@NotNull Sql92Parser.Set_local_time_zone_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_session_authorization_identifier_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_authorization_identifier_statement(@NotNull Sql92Parser.Set_session_authorization_identifier_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_intersect_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_intersect_rel(@NotNull Sql92Parser.Query_intersect_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_domain_statement(@NotNull Sql92Parser.Drop_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#indicator_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndicator_variable(@NotNull Sql92Parser.Indicator_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#comparision_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparision_predicate(@NotNull Sql92Parser.Comparision_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_domain_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_domain_action(@NotNull Sql92Parser.Alter_domain_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trim_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_character(@NotNull Sql92Parser.Trim_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_type(@NotNull Sql92Parser.Datetime_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#insert_columns_and_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_columns_and_source(@NotNull Sql92Parser.Insert_columns_and_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#existing_character_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_character_set_name(@NotNull Sql92Parser.Existing_character_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_primary(@NotNull Sql92Parser.Datetime_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#variable_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_specification(@NotNull Sql92Parser.Variable_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(@NotNull Sql92Parser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#select_statement_single_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement_single_row(@NotNull Sql92Parser.Select_statement_single_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sort_specification_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specification_list(@NotNull Sql92Parser.Sort_specification_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#current_date_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_date_value_function(@NotNull Sql92Parser.Current_date_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#extended_statement_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_statement_name(@NotNull Sql92Parser.Extended_statement_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#select_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_target_list(@NotNull Sql92Parser.Select_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#explicit_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_table(@NotNull Sql92Parser.Explicit_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#grouping_column_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_column_reference(@NotNull Sql92Parser.Grouping_column_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_identifier(@NotNull Sql92Parser.Qualified_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#collation_sequence_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_sequence_definition(@NotNull Sql92Parser.Collation_sequence_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#statement_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_information(@NotNull Sql92Parser.Statement_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_substring_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_substring_function(@NotNull Sql92Parser.Character_substring_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#status_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus_parameter(@NotNull Sql92Parser.Status_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#indicator_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndicator_parameter(@NotNull Sql92Parser.Indicator_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_primary(@NotNull Sql92Parser.Character_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#unique_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_constraint_definition(@NotNull Sql92Parser.Unique_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_names_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_names_statement(@NotNull Sql92Parser.Set_names_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_authorization_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_authorization_identifier(@NotNull Sql92Parser.Schema_authorization_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#get_diagnostics_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diagnostics_statement(@NotNull Sql92Parser.Get_diagnostics_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_translation(@NotNull Sql92Parser.Character_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_literal(@NotNull Sql92Parser.Interval_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trim_operands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_operands(@NotNull Sql92Parser.Trim_operandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#pad_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPad_attribute(@NotNull Sql92Parser.Pad_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_connection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_connection_statement(@NotNull Sql92Parser.Sql_connection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#implementation_defined_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_defined_collation_name(@NotNull Sql92Parser.Implementation_defined_collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#referencing_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_columns(@NotNull Sql92Parser.Referencing_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#unsigned_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_literal(@NotNull Sql92Parser.Unsigned_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#alter_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_domain_statement(@NotNull Sql92Parser.Alter_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_catalog_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_catalog_statement(@NotNull Sql92Parser.Set_catalog_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trasaction_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrasaction_mode(@NotNull Sql92Parser.Trasaction_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(@NotNull Sql92Parser.Select_sublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#parameter_using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_using_clause(@NotNull Sql92Parser.Parameter_using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#in_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_value_list(@NotNull Sql92Parser.In_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull Sql92Parser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#null_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_specification(@NotNull Sql92Parser.Null_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#numeric_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_primary(@NotNull Sql92Parser.Numeric_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull Sql92Parser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trim_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_function(@NotNull Sql92Parser.Trim_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#match_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_predicate(@NotNull Sql92Parser.Match_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#add_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_column_definition(@NotNull Sql92Parser.Add_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull Sql92Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_server_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_server_name(@NotNull Sql92Parser.Sql_server_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#connect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect_statement(@NotNull Sql92Parser.Connect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#local_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_table_name(@NotNull Sql92Parser.Local_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#length_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength_expression(@NotNull Sql92Parser.Length_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#describe_output_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_output_statement(@NotNull Sql92Parser.Describe_output_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_translation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_translation_name(@NotNull Sql92Parser.Schema_translation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_character_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_character_set_name(@NotNull Sql92Parser.Schema_character_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull Sql92Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#domain_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint(@NotNull Sql92Parser.Domain_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#isolation_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolation_level(@NotNull Sql92Parser.Isolation_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_term(@NotNull Sql92Parser.Interval_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#referenced_table_and_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenced_table_and_columns(@NotNull Sql92Parser.Referenced_table_and_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(@NotNull Sql92Parser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_translation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_translation_statement(@NotNull Sql92Parser.Drop_translation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_data_statement(@NotNull Sql92Parser.Sql_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#match_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_value(@NotNull Sql92Parser.Match_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#direct_select_statement_multiple_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_select_statement_multiple_rows(@NotNull Sql92Parser.Direct_select_statement_multiple_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(@NotNull Sql92Parser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_value_specification_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_value_specification_1(@NotNull Sql92Parser.Simple_value_specification_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_value_specification_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_value_specification_2(@NotNull Sql92Parser.Simple_value_specification_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_language_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_language_identifier(@NotNull Sql92Parser.Sql_language_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#condition_information_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_information_item(@NotNull Sql92Parser.Condition_information_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#start_position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_position(@NotNull Sql92Parser.Start_positionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#extract_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_field(@NotNull Sql92Parser.Extract_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#constraint_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name_list(@NotNull Sql92Parser.Constraint_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#referential_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferential_action(@NotNull Sql92Parser.Referential_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#add_table_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_table_constraint_definition(@NotNull Sql92Parser.Add_table_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#octet_length_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctet_length_expression(@NotNull Sql92Parser.Octet_length_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_target_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_target_specification(@NotNull Sql92Parser.Simple_target_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull Sql92Parser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#as_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_clause(@NotNull Sql92Parser.As_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#delete_statement_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_searched(@NotNull Sql92Parser.Delete_statement_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_sql_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_sql_schema_statement(@NotNull Sql92Parser.Prepable_sql_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#references_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences_specification(@NotNull Sql92Parser.References_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_diagnostics_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_diagnostics_statement(@NotNull Sql92Parser.Sql_diagnostics_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_factor(@NotNull Sql92Parser.Interval_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#statement_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_name(@NotNull Sql92Parser.Statement_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_item_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_item_information(@NotNull Sql92Parser.Set_item_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#mumps_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMumps_host_identifier(@NotNull Sql92Parser.Mumps_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(@NotNull Sql92Parser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sort_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_key(@NotNull Sql92Parser.Sort_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_cursor_name(@NotNull Sql92Parser.Dynamic_cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#level_of_isolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_of_isolation(@NotNull Sql92Parser.Level_of_isolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#default_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_specification(@NotNull Sql92Parser.Default_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#update_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_source(@NotNull Sql92Parser.Update_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(@NotNull Sql92Parser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_definition(@NotNull Sql92Parser.Drop_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#referential_triggered_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferential_triggered_action(@NotNull Sql92Parser.Referential_triggered_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cobol_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobol_host_identifier(@NotNull Sql92Parser.Cobol_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#start_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_field(@NotNull Sql92Parser.Start_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name_clause(@NotNull Sql92Parser.Module_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_open_statement(@NotNull Sql92Parser.Dynamic_open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#external_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_collation(@NotNull Sql92Parser.External_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_definition(@NotNull Sql92Parser.Schema_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#statement_information_item_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_information_item_name(@NotNull Sql92Parser.Statement_information_item_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#derived_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column_list(@NotNull Sql92Parser.Derived_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#row_value_constructor_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_constructor_list(@NotNull Sql92Parser.Row_value_constructor_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#general_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_value_specification(@NotNull Sql92Parser.General_value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#c_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_host_identifier(@NotNull Sql92Parser.C_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#domain_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_name(@NotNull Sql92Parser.Domain_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#actual_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_identifier(@NotNull Sql92Parser.Actual_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(@NotNull Sql92Parser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sigle_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigle_datetime_field(@NotNull Sql92Parser.Sigle_datetime_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification(@NotNull Sql92Parser.Parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_definition(@NotNull Sql92Parser.Table_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(@NotNull Sql92Parser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(@NotNull Sql92Parser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#assertion_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_check(@NotNull Sql92Parser.Assertion_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#in_predicate_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_predicate_value(@NotNull Sql92Parser.In_predicate_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(@NotNull Sql92Parser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#current_time_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_time_value_function(@NotNull Sql92Parser.Current_time_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#deallocate_prepared_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_prepared_statement(@NotNull Sql92Parser.Deallocate_prepared_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#exists_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_predicate(@NotNull Sql92Parser.Exists_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#standard_character_repertoire_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_character_repertoire_name(@NotNull Sql92Parser.Standard_character_repertoire_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#end_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_field(@NotNull Sql92Parser.End_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#case_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_operand(@NotNull Sql92Parser.Case_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#update_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_rule(@NotNull Sql92Parser.Update_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull Sql92Parser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_table(@NotNull Sql92Parser.Simple_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#get_descriptor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_descriptor_statement(@NotNull Sql92Parser.Get_descriptor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(@NotNull Sql92Parser.Parameter_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#direct_sql_data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_sql_data_statement(@NotNull Sql92Parser.Direct_sql_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#action_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_list(@NotNull Sql92Parser.Action_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#collation_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_source(@NotNull Sql92Parser.Collation_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#updatability_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatability_clause(@NotNull Sql92Parser.Updatability_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#domain_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_definition(@NotNull Sql92Parser.Domain_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#delete_statement_positioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_positioned(@NotNull Sql92Parser.Delete_statement_positionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_set_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_source(@NotNull Sql92Parser.Character_set_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(@NotNull Sql92Parser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(@NotNull Sql92Parser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#disconnect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect_statement(@NotNull Sql92Parser.Disconnect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#view_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_definition(@NotNull Sql92Parser.View_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#descriptor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptor_name(@NotNull Sql92Parser.Descriptor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull Sql92Parser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_field(@NotNull Sql92Parser.Datetime_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull Sql92Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#source_character_set_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_character_set_specification(@NotNull Sql92Parser.Source_character_set_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#row_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_constructor(@NotNull Sql92Parser.Row_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull Sql92Parser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull Sql92Parser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_value_expression(@NotNull Sql92Parser.Character_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#update_statement_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement_searched(@NotNull Sql92Parser.Update_statement_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_assertion_statement(@NotNull Sql92Parser.Drop_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(@NotNull Sql92Parser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(@NotNull Sql92Parser.Cast_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#unique_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_specification(@NotNull Sql92Parser.Unique_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_sql_session_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_sql_session_statement(@NotNull Sql92Parser.Prepable_sql_session_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#grant_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_definition(@NotNull Sql92Parser.Grant_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_expression(@NotNull Sql92Parser.Table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#schema_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_collation_name(@NotNull Sql92Parser.Schema_collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#get_item_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_item_information(@NotNull Sql92Parser.Get_item_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(@NotNull Sql92Parser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(@NotNull Sql92Parser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#result_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_expression(@NotNull Sql92Parser.Result_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_table_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_constraint_definition(@NotNull Sql92Parser.Drop_table_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_set_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_specification(@NotNull Sql92Parser.Character_set_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cast_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_operand(@NotNull Sql92Parser.Cast_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#connection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection_name(@NotNull Sql92Parser.Connection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string_literal(@NotNull Sql92Parser.Character_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_literal(@NotNull Sql92Parser.Datetime_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_precision(@NotNull Sql92Parser.Time_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#join_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_column_list(@NotNull Sql92Parser.Join_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_primary(@NotNull Sql92Parser.Query_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#referential_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferential_constraint_definition(@NotNull Sql92Parser.Referential_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#string_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_length(@NotNull Sql92Parser.String_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#delimited_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimited_identifier(@NotNull Sql92Parser.Delimited_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#correlation_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_specification(@NotNull Sql92Parser.Correlation_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#non_join_query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_join_query_expression(@NotNull Sql92Parser.Non_join_query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(@NotNull Sql92Parser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#translation_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_specification(@NotNull Sql92Parser.Translation_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#value_expression_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression_primary(@NotNull Sql92Parser.Value_expression_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#char_length_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_length_expression(@NotNull Sql92Parser.Char_length_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#case_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_specification(@NotNull Sql92Parser.Case_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_dynamic_delete_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_delete_statement_positionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_domain_default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_domain_default_clause(@NotNull Sql92Parser.Drop_domain_default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(@NotNull Sql92Parser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(@NotNull Sql92Parser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull Sql92Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull Sql92Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(@NotNull Sql92Parser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(@NotNull Sql92Parser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#using_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_descriptor(@NotNull Sql92Parser.Using_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(@NotNull Sql92Parser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#time_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_fractional_seconds_precision(@NotNull Sql92Parser.Time_fractional_seconds_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#interval_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_value_expression(@NotNull Sql92Parser.Interval_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_value_function(@NotNull Sql92Parser.Character_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#translation_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_source(@NotNull Sql92Parser.Translation_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#temporary_table_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary_table_declaration(@NotNull Sql92Parser.Temporary_table_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#hex_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_string_literal(@NotNull Sql92Parser.Hex_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_domain_default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_domain_default_clause(@NotNull Sql92Parser.Set_domain_default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_length_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_length_expression(@NotNull Sql92Parser.Bit_length_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_descriptor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_descriptor_statement(@NotNull Sql92Parser.Set_descriptor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_parameter_specification(@NotNull Sql92Parser.Dynamic_parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(@NotNull Sql92Parser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#implementation_defined_translation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_defined_translation_name(@NotNull Sql92Parser.Implementation_defined_translation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_statement_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement_variable(@NotNull Sql92Parser.Sql_statement_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_delete_statement_positioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_delete_statement_positioned(@NotNull Sql92Parser.Dynamic_delete_statement_positionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_value_function(@NotNull Sql92Parser.Bit_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#transaction_access_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_access_mode(@NotNull Sql92Parser.Transaction_access_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#ordering_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_specification(@NotNull Sql92Parser.Ordering_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(@NotNull Sql92Parser.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#pli_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPli_host_identifier(@NotNull Sql92Parser.Pli_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull Sql92Parser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(@NotNull Sql92Parser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_statement(@NotNull Sql92Parser.Drop_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#extended_cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_cursor_name(@NotNull Sql92Parser.Extended_cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#default_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_option(@NotNull Sql92Parser.Default_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare_statement(@NotNull Sql92Parser.Prepare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#constraint_name_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name_definition(@NotNull Sql92Parser.Constraint_name_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#describe_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_statement(@NotNull Sql92Parser.Describe_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#general_set_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_set_function(@NotNull Sql92Parser.General_set_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#diagnostics_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnostics_size(@NotNull Sql92Parser.Diagnostics_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#using_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_arguments(@NotNull Sql92Parser.Using_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema_statement(@NotNull Sql92Parser.Set_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(@NotNull Sql92Parser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#extract_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_expression(@NotNull Sql92Parser.Extract_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#connection_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection_object(@NotNull Sql92Parser.Connection_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#user_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_name(@NotNull Sql92Parser.User_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#some}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome(@NotNull Sql92Parser.SomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_function_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_specification(@NotNull Sql92Parser.Set_function_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#qualified_local_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_local_table_name(@NotNull Sql92Parser.Qualified_local_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#overlaps_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlaps_predicate(@NotNull Sql92Parser.Overlaps_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#truth_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth_value(@NotNull Sql92Parser.Truth_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#pascal_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPascal_host_identifier(@NotNull Sql92Parser.Pascal_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#deallocate_descriptor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_descriptor_statement(@NotNull Sql92Parser.Deallocate_descriptor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull Sql92Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(@NotNull Sql92Parser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull Sql92Parser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull Sql92Parser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(@NotNull Sql92Parser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#searched_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_when_clause(@NotNull Sql92Parser.Searched_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case(@NotNull Sql92Parser.Simple_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#prepable_dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepable_dynamic_update_statement_positioned(@NotNull Sql92Parser.Prepable_dynamic_update_statement_positionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull Sql92Parser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#approximate_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproximate_numeric_type(@NotNull Sql92Parser.Approximate_numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_factor(@NotNull Sql92Parser.Datetime_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#non_second_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_second_datetime_field(@NotNull Sql92Parser.Non_second_datetime_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#doublequote_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublequote_symbol(@NotNull Sql92Parser.Doublequote_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(@NotNull Sql92Parser.Table_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#grouping_column_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_column_reference_list(@NotNull Sql92Parser.Grouping_column_reference_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#national_character_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNational_character_string_literal(@NotNull Sql92Parser.National_character_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#ada_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAda_host_identifier(@NotNull Sql92Parser.Ada_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#row_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_subquery(@NotNull Sql92Parser.Row_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_descriptor_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_descriptor_information(@NotNull Sql92Parser.Set_descriptor_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#number_of_conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_of_conditions(@NotNull Sql92Parser.Number_of_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#numeric_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value_function(@NotNull Sql92Parser.Numeric_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#embedded_variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_variable_name(@NotNull Sql92Parser.Embedded_variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_data_change_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_data_change_statement(@NotNull Sql92Parser.Sql_data_change_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_dynamic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_dynamic_statement(@NotNull Sql92Parser.Sql_dynamic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#view_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_column_list(@NotNull Sql92Parser.View_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sort_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specification(@NotNull Sql92Parser.Sort_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#exact_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact_numeric_type(@NotNull Sql92Parser.Exact_numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#execute_immediate_statemnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate_statemnet(@NotNull Sql92Parser.Execute_immediate_statemnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_value_expression(@NotNull Sql92Parser.Datetime_value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#form_of_use_conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm_of_use_conversion(@NotNull Sql92Parser.Form_of_use_conversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#fortran_host_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortran_host_identifier(@NotNull Sql92Parser.Fortran_host_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#get_descriptor_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_descriptor_information(@NotNull Sql92Parser.Get_descriptor_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#get_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_count(@NotNull Sql92Parser.Get_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_close_statement(@NotNull Sql92Parser.Dynamic_close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(@NotNull Sql92Parser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#national_character_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNational_character_string_type(@NotNull Sql92Parser.National_character_string_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#trim_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_specification(@NotNull Sql92Parser.Trim_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_target_specification_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_target_specification_1(@NotNull Sql92Parser.Simple_target_specification_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_target_specification_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_target_specification_2(@NotNull Sql92Parser.Simple_target_specification_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_constraint_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_definition(@NotNull Sql92Parser.Column_constraint_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#limited_collation_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimited_collation_definition(@NotNull Sql92Parser.Limited_collation_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(@NotNull Sql92Parser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#fetch_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_target_list(@NotNull Sql92Parser.Fetch_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_reference(@NotNull Sql92Parser.Column_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(@NotNull Sql92Parser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(@NotNull Sql92Parser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#language_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_clause(@NotNull Sql92Parser.Language_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#target_character_set_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_character_set_specification(@NotNull Sql92Parser.Target_character_set_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull Sql92Parser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#item_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_number(@NotNull Sql92Parser.Item_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#extract_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_source(@NotNull Sql92Parser.Extract_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#bit_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_primary(@NotNull Sql92Parser.Bit_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#module_contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_contents(@NotNull Sql92Parser.Module_contentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#authorization_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization_identifier(@NotNull Sql92Parser.Authorization_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(@NotNull Sql92Parser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(@NotNull Sql92Parser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#revoke_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_statement(@NotNull Sql92Parser.Revoke_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#privileges_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges_column_list(@NotNull Sql92Parser.Privileges_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#cast_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_specification(@NotNull Sql92Parser.Cast_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#reference_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_column_list(@NotNull Sql92Parser.Reference_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_set_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_definition(@NotNull Sql92Parser.Character_set_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#query_set_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_set_rel(@NotNull Sql92Parser.Query_set_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#datetime_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_value_function(@NotNull Sql92Parser.Datetime_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#drop_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema_statement(@NotNull Sql92Parser.Drop_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_transaction_statement(@NotNull Sql92Parser.Sql_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#allocate_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_statement(@NotNull Sql92Parser.Allocate_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#character_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_name(@NotNull Sql92Parser.Character_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#simple_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_value_specification(@NotNull Sql92Parser.Simple_value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#fold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(@NotNull Sql92Parser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#update_statement_position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement_position(@NotNull Sql92Parser.Update_statement_positionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull Sql92Parser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#searched_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case(@NotNull Sql92Parser.Searched_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_manipulation_statement(@NotNull Sql92Parser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull Sql92Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#translation_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_collation(@NotNull Sql92Parser.Translation_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#sql_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_procedure_statement(@NotNull Sql92Parser.Sql_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#dynamic_update_statement_positioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_update_statement_positioned(@NotNull Sql92Parser.Dynamic_update_statement_positionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#standard_translation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_translation_name(@NotNull Sql92Parser.Standard_translation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#set_connection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_connection_statement(@NotNull Sql92Parser.Set_connection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Sql92Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull Sql92Parser.LiteralContext ctx);
}