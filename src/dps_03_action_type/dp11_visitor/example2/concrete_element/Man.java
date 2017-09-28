package dps_03_action_type.dp11_visitor.example2.concrete_element;

import dps_03_action_type.dp11_visitor.example2.element.Person;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept操作。<br>
 * 男人<br>
 * @author Administrator
 */
public class Man implements Person {

  /**
   * 接受一个访问者<br>
   * @param visitor
   */
  public void accept(Action visitor) {
    //首先在客户程序中将具体状态作为参数传递给“男人"类完成一次分派，
    //然后男人类调用作为参数的“具体状态”中的方法“男人反应”，同时将自己(this)作为参数传递进去，这便完成了第二次分派
    visitor.getManConclusion(this);
  }

}
