package dps_03_action_type.dp03_interpreter.example3;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;
import dps_03_action_type.dp03_interpreter.example3.context.PlayContext;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Note;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Scale;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Speed;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Context�������ģ�������������Ҫ���͵�ȫ����Ϣ:��������
    PlayContext context = new PlayContext();
    //����-�Ϻ�̲
    System.out.println("�Ϻ�̲:");
    //��������﷨��
    context
        .setPlayText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

    //AbstractExpression:������ʽ
    Expression expression = null;
    while (context.getPlayText().length() > 0) {
      char c = context.getPlayText().charAt(0);
      switch (c) {
      //������ĸ��Oʱ,��ʾʵ����Ϊ����
      case 'O':
        expression = new Scale();//�ն˱��ʽ��ɫ:������
        break;

      //������ĸ��T,��ʾʵ����Ϊ����
      case 'T':
        expression = new Speed();//�ն˱��ʽ��ɫ:������
        break;

      //������ĸ��CDEFGAB,�Լ���ֹ��Pʱ,��ʾʵ����Ϊ����
      case 'C':
      case 'D':
      case 'E':
      case 'F':
      case 'G':
      case 'A':
      case 'B':
      case 'P':
        expression = new Note();//�ն˱��ʽ��ɫ:������
        break;
      }
      expression.interpret(context);//������
    }
  }

}
