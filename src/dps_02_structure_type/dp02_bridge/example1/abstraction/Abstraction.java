package dps_02_structure_type.dp02_bridge.example1.abstraction;

import dps_02_structure_type.dp02_bridge.example1.implementor.Implementor;

/**
 * ���󻯽�ɫ(Abstraction)�����󻯽ӿڶ���<br>
 * @author Administrator
 */
public abstract class Abstraction {

  /**ʵ�ֻ���ɫ*/
  protected Implementor implementor;

  /**
   * @param implementor the implementor to set
   */
  public void setImplementor(Implementor implementor) {
    this.implementor = implementor;
  }

  /**
   * ִ�о������
   */
  public abstract void operation();

}
