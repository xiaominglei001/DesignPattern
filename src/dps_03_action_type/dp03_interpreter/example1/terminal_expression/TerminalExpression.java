package dps_03_action_type.dp03_interpreter.example1.terminal_expression;

import dps_03_action_type.dp03_interpreter.example1.abstract_expression.AbstractExpression;
import dps_03_action_type.dp03_interpreter.example1.context.Context;

/**
 * �ն˱��ʽ��ɫ<br>
 * @author Administrator
 */
public class TerminalExpression implements AbstractExpression {

  /**
   * ���͵�����<br>
   * @param context 
   */
  public void interpret(@SuppressWarnings("unused")
  Context context) {
    System.out.println("�ն˽�����.");
  }

}
