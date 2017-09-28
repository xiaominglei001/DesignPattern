package dps_03_action_type.dp03_interpreter.example1.terminal_expression;

import dps_03_action_type.dp03_interpreter.example1.abstract_expression.AbstractExpression;
import dps_03_action_type.dp03_interpreter.example1.context.Context;

/**
 * 终端表达式角色<br>
 * @author Administrator
 */
public class TerminalExpression implements AbstractExpression {

  /**
   * 解释的主体<br>
   * @param context 
   */
  public void interpret(@SuppressWarnings("unused")
  Context context) {
    System.out.println("终端解释器.");
  }

}
