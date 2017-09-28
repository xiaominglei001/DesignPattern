package dps_03_action_type.dp11_visitor.example1;

import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementA;
import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementB;
import dps_03_action_type.dp11_visitor.example1.concrete_visitor.ConcreteVisitor1;
import dps_03_action_type.dp11_visitor.example1.concrete_visitor.ConcreteVisitor2;
import dps_03_action_type.dp11_visitor.example1.object_structure.ObjectStructure;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //对象结构角色
    ObjectStructure o = new ObjectStructure();
    o.attach(new ConcreteElementA());
    o.attach(new ConcreteElementB());

    //具体访问者角色
    ConcreteVisitor1 v1 = new ConcreteVisitor1();
    ConcreteVisitor2 v2 = new ConcreteVisitor2();

    //遍历元素,并接受访问者
    o.accept(v1);
    o.accept(v2);
  }

}
