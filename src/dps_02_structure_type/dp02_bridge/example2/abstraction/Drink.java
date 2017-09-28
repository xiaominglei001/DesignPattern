package dps_02_structure_type.dp02_bridge.example2.abstraction;

import dps_02_structure_type.dp02_bridge.example2.implementor.Action;

/**
 * ���󻯽�ɫ(Abstraction)�����󻯽ӿڶ���<br>
 * ���󲿷�:����<br>
 * @author Administrator
 */
public abstract class Drink {

  /**��Ϊ:��xx*/
  protected Action action;

  /**
   * @param action the action to set
   */
  public void setAction(Action action) {
    this.action = action;
  }

  /**
   * �����Ϲ���
   */
  public abstract void makeDrink();

}
