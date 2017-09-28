package dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight;

import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;

/**
 * 具体享元(ConcreteFlyweight)角色:实现抽象享元角色所规定的接口.<br>
 * 需要共享的子类<br>
 * @author Administrator
 */
public class ConcreteFlyweight implements Flyweight {

  /**
   * 具体操作<br>
   * @param extrinsicstate 外部状态
   */
  public void operation(int extrinsicstate) {
    System.out.println("具体Flyweight:" + extrinsicstate);
  }

}
