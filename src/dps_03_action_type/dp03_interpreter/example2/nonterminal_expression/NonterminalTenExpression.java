package dps_03_action_type.dp03_interpreter.example2.nonterminal_expression;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;

/**
 * 非终结表达式角色:解释十位数<br>
 * @author Administrator
 */
public class NonterminalTenExpression extends Expression {

  /**
   * 取汉字数字单位,个位数为"",十位数为"拾",百位数为"百",千位数为"千"<br>
   * 子类按需要重写<br>
   * @return String
   */
  public String getPostifix() {
    return "拾";
  }

  /**
   * 乘数<br>
   * 例如:个位上数字为2,则最后为2*1<br>
   * 例如:百位上数字为3,则表示3*10<br>
   * @return int
   */
  public int multiplier() {
    return 10;
  }

  /**
   * 获取中文表达式中一个最小数字单元占据的位置长度<br>
   * 例如:个位的长度为一位<br>
   * 例如数字叁拾,表示两位<br>
   * 例如肆百,表示两位<br>
   * @return int
   */
  public int getLength() {
    return 2;
  }

}
