package dps_03_action_type.dp03_interpreter.example2.terminal_expression;

import java.util.regex.Pattern;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;
import dps_03_action_type.dp03_interpreter.example2.context.Context;

/**
 * TerminalExpression:终结符表达式。实现与文法中的终结符相关联的解释操作，一个句子中的每个终结符需要该类的一个实例。<br>
 * @author Administrator
 */
public class TerminalExpression extends Expression {

  /**
   * 解释的主体<br>
   * @param context 
   */
  public void interpret(Context context) {
    //statement为null时,设计data为0,然后返回
    if (context.getStatement() == null) {
      context.setData(0);
      context.setStatement("null");//这一句必须放在下面,因为设为空后值不能再转换成int类型
      //这里用正则表达式来判断statement的值是不是纯数字类似,如果是数字则说明能够直接转换,也就是说用不到非终结表达式角色
    } else if (Pattern.matches("^-?\\d+$", context.getStatement())) {
      context.setData(Integer.parseInt(context.getStatement()));
      context.setStatement("");//这一句必须放在下面,因为设为空后值不能再转换成int类型
    } else {
      //说明输入的是汉字数字,不做任何处理
    }
  }

  /**
   * 取汉字数字单位,个位数为"",十位数为"拾",百位数为"百",千位数为"千"<br>
   * 子类按需要重写<br>
   * 这里是终结处理,所以返回多少都可以<br>
   * @return String
   */
  public String getPostifix() {
    return "";
  }

  /**
   * 乘数<br>
   * 这里是终结处理,所以返回多少都可以<br>
   * @return int
   */
  public int multiplier() {
    return 0;
  }

  /**
   * 获取中文表达式中一个最小数字单元占据的位置长度<br>
   * 例如:个位的长度为一位<br>
   * 例如数字叁拾,表示两位<br>
   * 例如肆百,表示两位<br>
   * 这里是终结处理,所以返回多少都可以<br>
   * @return int
   */
  public int getLength() {
    return 0;
  }

}
