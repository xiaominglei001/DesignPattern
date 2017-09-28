package dps_03_action_type.dp11_visitor.example1.visitor;

import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementA;
import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementB;

/**
 * 访问者角色（Visitor）：为该对象结构中具体元素角色声明一个访问操作接口。<br>
 * 该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。<br>
 * 这样访问者就可以通过该元素角色的特定接口直接访问它。<br>
 * @author Administrator
 */
public interface Visitor {

  /**
   * 访问元素A<br>
   * @param concreteElementA
   */
  public void visitConcreteElementA(ConcreteElementA concreteElementA);

  /**
   * 访问元素B<br>
   * @param concreteElementB
   */
  public void visitConcreteElementB(ConcreteElementB concreteElementB);

}
