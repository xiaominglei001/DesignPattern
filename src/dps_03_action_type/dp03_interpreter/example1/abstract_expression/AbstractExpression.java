package dps_03_action_type.dp03_interpreter.example1.abstract_expression;

import dps_03_action_type.dp03_interpreter.example1.context.Context;

/**
 * AbstractExpression:������ʽ������һ������Ľ��Ͳ���������ӿ�Ϊ�����﷨�������еĽڵ�������<br>
 * @author Administrator
 */
public interface AbstractExpression {

  /**
   * ���͵�����<br>
   * @param context 
   */
  public void interpret(Context context);

}
