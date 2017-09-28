package dps_02_structure_type.dp02_bridge.example3.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example3.abstraction.HandsetBrand;

/**
 * 具体抽象化角色(Refined Abstraction)：抽象化具体实现<br>
 * 手机品牌N<br>
 * @author Administrator
 */
public class HandsetBrandN extends HandsetBrand {

  /**
   * 运行软件
   */
  public void run() {
    handsetSoft.run();
  }

}
