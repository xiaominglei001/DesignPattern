package dps_03_action_type.dp03_interpreter.example1.abstract_expression;

import dps_03_action_type.dp03_interpreter.example1.context.Context;

/**
 * AbstractExpression:抽象表达式，声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享。<br>
 * @author Administrator
 */
public interface AbstractExpression {

  /**
   * 解释的主体<br>
   * @param context 
   */
  public void interpret(Context context);

}
