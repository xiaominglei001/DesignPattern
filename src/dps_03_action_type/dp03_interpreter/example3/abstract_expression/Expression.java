package dps_03_action_type.dp03_interpreter.example3.abstract_expression;

import dps_03_action_type.dp03_interpreter.example3.context.PlayContext;

/**
 * AbstractExpression:抽象表达式，声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享。<br>
 * @author Administrator
 */
public abstract class Expression {

  /**
   * 解释器<br>
   * @param context 
   */
  public void interpret(PlayContext context) {
    if (context.getPlayText().length() == 0) {
      //do nothing
    } else {
      //用于将当前的演奏文本第一条命令获得字母和其参数值
      //例如"O 3 E 0.5 G 0.5 A 3",则playKey为O,而playValue为3
      String playKey = context.getPlayText().substring(0, 1);
      context.setPlayText(context.getPlayText().substring(2));
      double playValue = Double.parseDouble(context.getPlayText().substring(0,
          context.getPlayText().indexOf(" ")));
      //获得playKey和playValue后将其从演奏文本中删除
      //例如"O 3 E 0.5 G 0.5 A 3"变成"E 0.5 G 0.5 A 3"
      context.setPlayText(context.getPlayText().substring(
          context.getPlayText().indexOf(" ") + 1));

      excute(playKey, playValue);
    }

  }

  /**
   * 执行,不同的方法子类有不同的执行处理<br>
   * @param key
   * @param value
   */
  public abstract void excute(String key, double value);

}
