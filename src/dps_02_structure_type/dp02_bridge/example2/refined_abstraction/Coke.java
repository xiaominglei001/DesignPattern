package dps_02_structure_type.dp02_bridge.example2.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;

/**
 * 具体抽象化角色(Refined Abstraction)：抽象化具体实现<br>
 * 可乐<br>
 * @author Administrator
 */
public class Coke extends Drink {

  /**
   * 冲可乐过程
   */
  public void makeDrink() {
    System.out.print("冲1杯可乐:");
    //加xx由下面这句话决定
    action.execute();
  }

}
