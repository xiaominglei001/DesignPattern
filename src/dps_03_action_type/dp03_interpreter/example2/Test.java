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
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //[伍千肆百叁拾贰:5432][伍千肆百零伍:5405][伍千零贰拾:5020][零叁:03]
    String str = "伍千肆百零伍";

    //Context：上下文，包含解释器需要解释的全局信息
    Context context = new Context(str);

    //构造抽象语法树
    List<Expression> list = new ArrayList<Expression>();
    //加入终结符表达式
    //如果能直接转换成数字则直接返回
    list.add(new TerminalExpression());
    //非终结符,处理个位数
    list.add(new NonterminalOneExpression());
    //非终结符,处理十位数
    list.add(new NonterminalTenExpression());
    //非终结符,处理百位数
    list.add(new NonterminalHundredExpression());
    //非终结器,处理千位数
    list.add(new NonterminalThousandExpression());
    //对抽象语法树的每个枝节进行解释操作
    for (Expression exp : list) {
      exp.interpret(context);//解释器
    }
    System.out.println(str + " = " + context.getData());
  }

}
