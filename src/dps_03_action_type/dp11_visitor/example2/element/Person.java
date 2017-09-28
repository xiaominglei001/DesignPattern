package dps_03_action_type.dp11_visitor.example2.element;

import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * 元素角色（Element）：定义一个Accept操作，它以一个访问者为参数。<br>
 * 人的抽象类<br>
 * @author Administrator
 */
public interface Person {

  /**
   * 接受,vistor用来获得状态对象<br>
   * @param visitor
   */
  public void accept(Action visitor);

}
