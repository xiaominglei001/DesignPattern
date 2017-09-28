package dps_02_structure_type.dp02_bridge.example3.abstraction;

import dps_02_structure_type.dp02_bridge.example3.implementor.HandsetSoft;

/**
 * 抽象化角色(Abstraction)：抽象化接口定义<br>
 * 手机品牌<br>
 * @author Administrator
 */
public abstract class HandsetBrand {

  /**手机软件*/
  protected HandsetSoft handsetSoft;

  /**
   * @param handsetSoft the handsetSoft to set
   */
  public void setHandsetSoft(HandsetSoft handsetSoft) {
    this.handsetSoft = handsetSoft;
  }

  /**
   * 运行软件
   */
  public abstract void run();

}
