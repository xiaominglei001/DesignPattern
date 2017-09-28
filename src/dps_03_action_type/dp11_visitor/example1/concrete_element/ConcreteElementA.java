package dps_03_action_type.dp11_visitor.example1.concrete_element;

import dps_03_action_type.dp11_visitor.example1.element.Element;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept操作。<br>
 * @author Administrator
 */
public class ConcreteElementA implements Element {

  /**
   * 接受一个访问者<br>
   * @param visitor
   */
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }

  /**
   * 其他相关方法
   */
  public void operationA() {
    //do something
  }

}
