package dps_02_structure_type.dp04_decorator.example3.concrete_component;

import dps_02_structure_type.dp04_decorator.example3.component.Action;

/**
 * 具体构件（Concrete Component）角色：定义一个将要接收附加责任的类。 <br>
 * @author Administrator
 */
public class Computer implements Action {

  /**
   * 开机
   */
  public void start() {
    System.out.println("Computer start...");
  }

  /**
   * 关机
   */
  public void shutdown() {
    System.out.println("Computer shutdown...");
  }

}