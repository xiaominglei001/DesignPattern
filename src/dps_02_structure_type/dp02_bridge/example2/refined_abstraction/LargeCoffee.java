package dps_02_structure_type.dp02_bridge.example2.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;

/**
 * 具体抽象化角色(Refined Abstraction)：抽象化具体实现<br>
 * 大杯咖啡<br>
 * @author Administrator
 */
public class LargeCoffee extends Drink {

  /**
   * 冲咖啡过程
   */
  public void makeDrink() {
    System.out.print("冲1大杯咖啡:");
    //加xx由下面这句话决定
    action.execute();
  }

}
