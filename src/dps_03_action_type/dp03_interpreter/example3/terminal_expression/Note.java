package dps_03_action_type.dp03_interpreter.example3.terminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * �ն˱��ʽ��ɫ:������<br>
 * @author Administrator
 */
public class Note extends Expression {

  /**
   * �����õ�key��C,������1(Do),�����D������2(Re),�Դ�����<br>
   * @param key
   * @param value
   */
  public void excute(String key, @SuppressWarnings("unused")
  double value) {
    String note = "";
    switch (key.charAt(0)) {
    case 'C':
      note = "1";
      break;
    case 'D':
      note = "2";
      break;
    case 'E':
      note = "3";
      break;
    case 'F':
      note = "4";
      break;
    case 'G':
      note = "5";
      break;
    case 'A':
      note = "6";
      break;
    case 'B':
      note = "7";
      break;
    }
    System.out.print(note + " ");
  }

}
