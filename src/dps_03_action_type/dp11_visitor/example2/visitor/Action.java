package dps_03_action_type.dp11_visitor.example2.visitor;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;

/**
 * 访问者角色（Visitor）：为该对象结构中具体元素角色声明一个访问操作接口。<br>
 * 该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。<br>
 * 这样访问者就可以通过该元素角色的特定接口直接访问它。<br>
 * 状态抽象类<br>
 * @author Administrator
 */
public interface Action {

  /**
   * 得到男人结论或反应<br>
   * @param concreteElementA
   */
  public void getManConclusion(Man concreteElementA);

  /**
   * 得到女人结论或反应<br>
   * @param concreteElementB
   */
  public void getWomanConclusion(Woman concreteElementB);

}
