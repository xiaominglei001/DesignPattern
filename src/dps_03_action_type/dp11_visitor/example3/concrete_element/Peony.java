package dps_03_action_type.dp11_visitor.example3.concrete_element;

import dps_03_action_type.dp11_visitor.example3.element.Flower;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept操作。<br>
 * 牡丹花<br>
 * @author Administrator
 */
public class Peony implements Flower {

  /**
   * 接受采花,vistor用来获得采花者对象<br>
   * @param visitor
   */
  public void accept(Deflower visitor) {
    visitor.processPeonyDust(this);
  }

}
