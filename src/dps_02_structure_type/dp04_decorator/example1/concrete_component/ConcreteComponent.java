package dps_02_structure_type.dp04_decorator.example1.concrete_component;

import dps_02_structure_type.dp04_decorator.example1.component.Component;

/**
 * 具体构件（Concrete Component）角色：定义一个将要接收附加责任的类。<br>
 * @author Administrator
 */
public class ConcreteComponent implements Component {

  /**
   * 对象操作
   */
  public void operation() {
    System.out.println("具体对象的操作.");
  }

}
