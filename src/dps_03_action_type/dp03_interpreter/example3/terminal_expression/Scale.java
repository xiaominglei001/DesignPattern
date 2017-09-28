package dps_03_action_type.dp03_interpreter.example3.terminal_expression;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;

/**
 * 终端表达式角色:音阶类<br>
 * @author Administrator
 */
public class Scale extends Expression {

  /**
   * 如果获得的key是O,并且value是1则演奏低音,2则是中音,3则是高音<br>
   * @param key
   * @param value
   */
  public void excute(@SuppressWarnings("unused")
  String key, double value) {
    String scale = "";
    switch ((int) value) {
    case 1:
      scale = "低音";
      break;
    case 2:
      scale = "中音";
      break;
    case 3:
      scale = "高音";
      break;
    }
    System.out.print(scale + " ");
  }

}
