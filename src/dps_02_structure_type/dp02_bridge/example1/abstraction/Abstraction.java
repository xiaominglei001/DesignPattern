package dps_02_structure_type.dp02_bridge.example1.abstraction;

import dps_02_structure_type.dp02_bridge.example1.implementor.Implementor;

/**
 * 抽象化角色(Abstraction)：抽象化接口定义<br>
 * @author Administrator
 */
public abstract class Abstraction {

  /**实现化角色*/
  protected Implementor implementor;

  /**
   * @param implementor the implementor to set
   */
  public void setImplementor(Implementor implementor) {
    this.implementor = implementor;
  }

  /**
   * 执行具体操作
   */
  public abstract void operation();

}
