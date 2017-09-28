package dps_03_action_type.dp11_visitor.example1.concrete_element;

import dps_03_action_type.dp11_visitor.example1.element.Element;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * ����Ԫ�ؽ�ɫ��Concrete Element����ʵ����Ԫ�ؽ�ɫ�ṩ��Accept������<br>
 * @author Administrator
 */
public class ConcreteElementA implements Element {

  /**
   * ����һ��������<br>
   * @param visitor
   */
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }

  /**
   * ������ط���
   */
  public void operationA() {
    //do something
  }

}
