package dps_03_action_type.dp03_interpreter.example1;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp03_interpreter.example1.abstract_expression.AbstractExpression;
import dps_03_action_type.dp03_interpreter.example1.context.Context;
import dps_03_action_type.dp03_interpreter.example1.nonterminal_expression.NonterminalExpression;
import dps_03_action_type.dp03_interpreter.example1.terminal_expression.TerminalExpression;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Context：上下文，包含解释器需要解释的全局信息
    Context context = new Context();

    //构造抽象语法树
    List<AbstractExpression> list = new ArrayList<AbstractExpression>();

    //终端表达式角色
    list.add(new TerminalExpression());
    list.add(new NonterminalExpression());
    list.add(new TerminalExpression());
    list.add(new TerminalExpression());

    //对抽象语法树的每个枝节进行解释操作
    for (AbstractExpression exp : list) {
      exp.interpret(context);
    }
  }

}
