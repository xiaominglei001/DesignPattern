package dps_03_action_type.dp03_interpreter.example3.terminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * �ն˱��ʽ��ɫ:������<br>
 * @author Administrator
 */
public class Speed extends Expression {

  /**
   * �����õ�key��T,T 500��ʾÿ���İ��룬T 1000��ʾÿ����һ��<br>
   * @param key
   * @param value
   */
  public void excute(@SuppressWarnings("unused")
  String key, double value) {
    String speed = "";
    if (value < 500d) {
      speed = "����";
    } else if (value >= 1000d) {
      speed = "����";
    } else {
      speed = "����";
    }
    System.out.print(speed + " ");
  }

}
