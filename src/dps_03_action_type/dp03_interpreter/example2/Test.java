package dps_03_action_type.dp03_interpreter.example2;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;
import dps_03_action_type.dp03_interpreter.example2.context.Context;
import dps_03_action_type.dp03_interpreter.example2.nonterminal_expression.NonterminalHundredExpression;
import dps_03_action_type.dp03_interpreter.example2.nonterminal_expression.NonterminalOneExpression;
import dps_03_action_type.dp03_interpreter.example2.nonterminal_expression.NonterminalTenExpression;
import dps_03_action_type.dp03_interpreter.example2.nonterminal_expression.NonterminalThousandExpression;
import dps_03_action_type.dp03_interpreter.example2.terminal_expression.TerminalExpression;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //[��ǧ������ʰ��:5432][��ǧ��������:5405][��ǧ�㷡ʰ:5020][����:03]
    String str = "��ǧ��������";

    //Context�������ģ�������������Ҫ���͵�ȫ����Ϣ
    Context context = new Context(str);

    //��������﷨��
    List<Expression> list = new ArrayList<Expression>();
    //�����ս�����ʽ
    //�����ֱ��ת����������ֱ�ӷ���
    list.add(new TerminalExpression());
    //���ս��,�����λ��
    list.add(new NonterminalOneExpression());
    //���ս��,����ʮλ��
    list.add(new NonterminalTenExpression());
    //���ս��,�����λ��
    list.add(new NonterminalHundredExpression());
    //���ս���,����ǧλ��
    list.add(new NonterminalThousandExpression());
    //�Գ����﷨����ÿ��֦�ڽ��н��Ͳ���
    for (Expression exp : list) {
      exp.interpret(context);//������
    }
    System.out.println(str + " = " + context.getData());
  }

}
