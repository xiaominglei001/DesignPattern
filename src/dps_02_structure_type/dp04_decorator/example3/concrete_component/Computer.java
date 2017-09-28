package dps_02_structure_type.dp04_decorator.example3.concrete_component;

import dps_02_structure_type.dp04_decorator.example3.component.Action;

/**
 * ���幹����Concrete Component����ɫ������һ����Ҫ���ո������ε��ࡣ <br>
 * @author Administrator
 */
public class Computer implements Action {

  /**
   * ����
   */
  public void start() {
    System.out.println("Computer start...");
  }

  /**
   * �ػ�
   */
  public void shutdown() {
    System.out.println("Computer shutdown...");
  }

}