package dps_02_structure_type.dp02_bridge.example2.abstraction;

import dps_02_structure_type.dp02_bridge.example2.implementor.Action;

/**
 * 抽象化角色(Abstraction)：抽象化接口定义<br>
 * 抽象部分:饮料<br>
 * @author Administrator
 */
public abstract class Drink {

  /**行为:加xx*/
  protected Action action;

  /**
   * @param action the action to set
   */
  public void setAction(Action action) {
    this.action = action;
  }

  /**
   * 冲饮料过程
   */
  public abstract void makeDrink();

}
