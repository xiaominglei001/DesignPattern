package dps_03_action_type.dp03_interpreter.example3;

import dps_03_action_type.dp03_interpreter.example3.abstract_expression.Expression;
import dps_03_action_type.dp03_interpreter.example3.context.PlayContext;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Note;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Scale;
import dps_03_action_type.dp03_interpreter.example3.terminal_expression.Speed;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Context：上下文，包含解释器需要解释的全局信息:演奏内容
    PlayContext context = new PlayContext();
    //音乐-上海滩
    System.out.println("上海滩:");
    //构造抽象语法树
    context
        .setPlayText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

    //AbstractExpression:抽象表达式
    Expression expression = null;
    while (context.getPlayText().length() > 0) {
      char c = context.getPlayText().charAt(0);
      switch (c) {
      //当首字母是O时,表示实例化为音阶
      case 'O':
        expression = new Scale();//终端表达式角色:音阶类
        break;

      //当首字母是T,表示实例化为音速
      case 'T':
        expression = new Speed();//终端表达式角色:音速类
        break;

      //当首字母是CDEFGAB,以及休止符P时,表示实例化为音符
      case 'C':
      case 'D':
      case 'E':
      case 'F':
      case 'G':
      case 'A':
      case 'B':
      case 'P':
        expression = new Note();//终端表达式角色:音符类
        break;
      }
      expression.interpret(context);//解释器
    }
  }

}
