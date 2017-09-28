package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * 不需要适配的类(已经实现目标接口),和ForeignCenter比较<br>
 * 前锋<br>
 * @author Administrator
 */
public class Forwards extends Player {

  /**
   * 构造函数<br>
   * @param name
   */
  public Forwards(String name) {
    super(name);
  }

  /**
   * 进攻
   */
  public void attack() {
    System.out.println("前锋 " + name + " 进攻");
  }

  /**
   * 防守
   */
  public void defense() {
    System.out.println("前锋 " + name + " 防守");
  }

}
