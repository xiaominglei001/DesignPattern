package dps_03_action_type.dp03_interpreter.example3.terminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * �ն˱��ʽ��ɫ:������<br>
 * @author Administrator
 */
public class Scale extends Expression {

  /**
   * �����õ�key��O,����value��1���������,2��������,3���Ǹ���<br>
   * @param key
   * @param value
   */
  public void excute(@SuppressWarnings("unused")
  String key, double value) {
    String scale = "";
    switch ((int) value) {
    case 1:
      scale = "����";
      break;
    case 2:
      scale = "����";
      break;
    case 3:
      scale = "����";
      break;
    }
    System.out.print(scale + " ");
  }

}
