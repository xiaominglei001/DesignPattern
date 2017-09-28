package dps_02_structure_type.dp04_decorator.example2.concrete_component;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;

/**
 * 具体构件（Concrete Component）角色：定义一个将要接收附加责任的类。<br>
 * 人<br>
 * @author Administrator
 */
public class Person implements IPerson {

  /**人名*/
  private String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * 展示自己
   */
  public void show() {
    System.out.println("装扮的" + name);
  }

}
