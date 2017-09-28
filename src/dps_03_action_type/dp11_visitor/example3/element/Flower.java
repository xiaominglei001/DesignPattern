package dps_03_action_type.dp11_visitor.example3.element;

import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * 元素角色（Element）：定义一个Accept操作，它以一个访问者为参数。<br>
 * 花的抽象类<br>
 * @author Administrator
 */
public interface Flower {

  /**
   * 接受采花,vistor用来获得采花者对象<br>
   * @param visitor
   */
  public void accept(Deflower visitor);

}
