package dps_02_structure_type.dp02_bridge.example3.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example3.implementor.HandsetSoft;

/**
 * 具体实现化角色(Concrete Implementor)：实现化角色接口的具体实现<br>
 * 手机游戏<br>
 * @author Administrator
 */
public class HandsetGame implements HandsetSoft {

  /**
   * 运行软件
   */
  public void run() {
    System.out.println("运行手机游戏.");
  }

}
