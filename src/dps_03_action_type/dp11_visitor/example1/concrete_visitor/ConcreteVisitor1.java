package dps_03_action_type.dp11_visitor.example1.concrete_visitor;

import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementA;
import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementB;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。<br>
 * @author Administrator
 */
public class ConcreteVisitor1 implements Visitor {

  /**
   * 访问元素A<br>
   * @param concreteElementA
   */
  public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + "被"
        + getClass().getSimpleName() + "访问");
  }

  /**
   * 访问元素B<br>
   * @param concreteElementB
   */
  public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + "被"
        + getClass().getSimpleName() + "访问");
  }

}
