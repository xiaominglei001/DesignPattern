package dps_03_action_type.dp11_visitor.example1.element;

import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * 元素角色（Element）：定义一个Accept操作，它以一个访问者为参数。<br>
 * @author Administrator
 */
public interface Element {

  /**
   * 接受一个访问者<br>
   * @param visitor
   */
  public void accept(Visitor visitor);

}
