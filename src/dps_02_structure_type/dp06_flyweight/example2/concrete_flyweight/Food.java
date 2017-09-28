package dps_02_structure_type.dp06_flyweight.example2.concrete_flyweight;

import util.ClassUtil;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * 具体享元(ConcreteFlyweight)角色:实现抽象享元角色所规定的接口.<br>
 * 这里是菜<br>
 * @author Administrator
 */
public class Food extends AbsFood {

  /**
   * 构造函数<br>
   * @param name
   */
  public Food(String name) {
    super(name);
  }

  /**
   * 打印出自己的菜名
   */
  public void display() {
    //这里为了方便,把具体的实现细节交给工具类ClassUtil处理,当然也可以自己处理.
    ClassUtil.display(this);
  }

}
