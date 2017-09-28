package dps_03_action_type.dp03_interpreter.example3.terminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * 终端表达式角色:音速类<br>
 * @author Administrator
 */
public class Speed extends Expression {

  /**
   * 如果获得的key是T,T 500表示每节拍半秒，T 1000表示每节拍一秒<br>
   * @param key
   * @param value
   */
  public void excute(@SuppressWarnings("unused")
  String key, double value) {
    String speed = "";
    if (value < 500d) {
      speed = "快速";
    } else if (value >= 1000d) {
      speed = "慢速";
    } else {
      speed = "中速";
    }
    System.out.print(speed + " ");
  }

}
