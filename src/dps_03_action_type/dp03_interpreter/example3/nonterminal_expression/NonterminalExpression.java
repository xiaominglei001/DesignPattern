package dps_03_action_type.dp03_interpreter.example3.nonterminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * 非终端表达式角色<br>
 * @author Administrator
 */
public class NonterminalExpression extends Expression {

  /**
   * 执行,这里不需要非终端表达式,所以不做任何处理<br>
   * @param key
   * @param value
   */
  public void excute(@SuppressWarnings("unused")
  String key, @SuppressWarnings("unused")
  double value) {
    //do nothing
  }

}
