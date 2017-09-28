package dps_03_action_type.dp11_visitor.example3.visitor;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;

/**
 * 访问者角色（Visitor）：为该对象结构中具体元素角色声明一个访问操作接口。<br>
 * 该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。<br>
 * 这样访问者就可以通过该元素角色的特定接口直接访问它。<br>
 * 抽象采花者<br>
 * @author Administrator
 */
public interface Deflower {

  /**
   * 处理菊花的花粉<br>
   * @param element 
   */
  public void processChrysanthemumDust(Chrysanthemum element);

  /**
   * 处理牡丹花的花粉<br>
   * @param element 
   */
  public void processPeonyDust(Peony element);

}
