package dps_03_action_type.dp03_interpreter.example1;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp03_interpreter.example1.abstract_expression.AbstractExpression;
import dps_03_action_type.dp03_interpreter.example1.context.Context;
import dps_03_action_type.dp03_interpreter.example1.nonterminal_expression.NonterminalExpression;
import dps_03_action_type.dp03_interpreter.example1.terminal_expression.TerminalExpression;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Context�������ģ�������������Ҫ���͵�ȫ����Ϣ
    Context context = new Context();

    //��������﷨��
    List<AbstractExpression> list = new ArrayList<AbstractExpression>();

    //�ն˱��ʽ��ɫ
    list.add(new TerminalExpression());
    list.add(new NonterminalExpression());
    list.add(new TerminalExpression());
    list.add(new TerminalExpression());

    //�Գ����﷨����ÿ��֦�ڽ��н��Ͳ���
    for (AbstractExpression exp : list) {
      exp.interpret(context);
    }
  }

}
