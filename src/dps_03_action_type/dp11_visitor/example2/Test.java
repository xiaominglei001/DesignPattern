package dps_03_action_type.dp11_visitor.example2;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;
import dps_03_action_type.dp11_visitor.example2.concrete_visitor.Amativeness;
import dps_03_action_type.dp11_visitor.example2.concrete_visitor.Failing;
import dps_03_action_type.dp11_visitor.example2.concrete_visitor.Marriage;
import dps_03_action_type.dp11_visitor.example2.concrete_visitor.Success;
import dps_03_action_type.dp11_visitor.example2.object_structure.ObjectStructure;

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
    o.attach(new Man());
    o.attach(new Woman());

    //具体访问者角色
    Success v1 = new Success();
    Failing v2 = new Failing();
    Amativeness v3 = new Amativeness();
    Marriage v4 = new Marriage();

    //遍历元素,并接受访问者
    o.display(v1);
    o.display(v2);
    o.display(v3);
    o.display(v4);
  }

}
