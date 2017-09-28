package dps_03_action_type.dp03_interpreter.example3.abstract_expression;

import dps_03_action_type.dp03_interpreter.example3.context.PlayContext;

/**
 * AbstractExpression:������ʽ������һ������Ľ��Ͳ���������ӿ�Ϊ�����﷨�������еĽڵ�������<br>
 * @author Administrator
 */
public abstract class Expression {

  /**
   * ������<br>
   * @param context 
   */
  public void interpret(PlayContext context) {
    if (context.getPlayText().length() == 0) {
      //do nothing
    } else {
      //���ڽ���ǰ�������ı���һ����������ĸ�������ֵ
      //����"O 3 E 0.5 G 0.5 A 3",��playKeyΪO,��playValueΪ3
      String playKey = context.getPlayText().substring(0, 1);
      context.setPlayText(context.getPlayText().substring(2));
      double playValue = Double.parseDouble(context.getPlayText().substring(0,
          context.getPlayText().indexOf(" ")));
      //���playKey��playValue����������ı���ɾ��
      //����"O 3 E 0.5 G 0.5 A 3"���"E 0.5 G 0.5 A 3"
      context.setPlayText(context.getPlayText().substring(
          context.getPlayText().indexOf(" ") + 1));

      excute(playKey, playValue);
    }

  }

  /**
   * ִ��,��ͬ�ķ��������в�ͬ��ִ�д���<br>
   * @param key
   * @param value
   */
  public abstract void excute(String key, double value);

}
