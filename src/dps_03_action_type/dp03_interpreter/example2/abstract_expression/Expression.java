package dps_03_action_type.dp03_interpreter.example2.abstract_expression;

import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp03_interpreter.example2.context.Context;

/**
 * AbstractExpression:抽象表达式，声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享。<br>
 * @author Administrator
 */
public abstract class Expression {

  /**汉字数字与阿拉伯数字数字的对应字典*/
  private Map<String, Integer> map = new HashMap<String, Integer>(9);

  /**
   * 构造函数
   */
  public Expression() {
    map.put("壹", 1);
    map.put("贰", 2);
    map.put("叁", 3);
    map.put("肆", 4);
    map.put("伍", 5);
    map.put("陆", 6);
    map.put("柒", 7);
    map.put("捌", 8);
    map.put("玖", 9);
  }

  /**
   * 解释的主体,可以被子类覆盖<br>
   * @param context 
   */
  public void interpret(Context context) {
    //如果要处理的字符串长度为0则返回
    if (context.getStatement().length() == 0) {
      return;
    }
    
    //对map的key进行循环
    for (String key : map.keySet()) {
      //statement以key+当前单位结束,例如:"伍千肆百叁拾"以叁拾结尾
      if (context.getStatement().endsWith(key + getPostifix())) {
        int value = map.get(key);//取出value值,即具体的数字
        //data+=(value*单位),例如:data+=(3*10),下一次再循环到此可能是 data+=(4*100)
        context.setData(context.getData() + value * multiplier());
        //解释完此次后,需要把字符串后面处理过的字符截取掉,例如:伍千肆百叁拾-->伍千肆百
        context.setStatement(context.getStatement().substring(0,
            context.getStatement().length() - getLength()));
        break;
      }

      //对于末尾为零的情况,直接把零截掉即可,例如:伍千肆百零-->伍千肆百
      if (context.getStatement().endsWith("零")) {
        context.setStatement(context.getStatement().substring(0,
            context.getStatement().length() - 1));
        break;
      }
    }
    
  }

  /**
   * 取汉字数字单位,个位数为"",十位数为"拾",百位数为"百",千位数为"千"<br>
   * 子类按需要重写<br>
   * @return String
   */
  public abstract String getPostifix();

  /**
   * 乘数<br>
   * 例如:个位上数字为2,则最后为2*1<br>
   * 例如:百位上数字为3,则表示3*10<br>
   * 子类按需要重写<br>
   * @return int
   */
  public abstract int multiplier();

  /**
   * 获取中文表达式中一个最小数字单元占据的位置长度<br>
   * 例如:个位的长度为一位<br>
   * 例如数字叁拾,表示两位<br>
   * 例如肆百,表示两位<br>
   * @return int
   */
  public abstract int getLength();

}
