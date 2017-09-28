package dps_02_structure_type.dp02_bridge.example3.abstraction;

import dps_02_structure_type.dp02_bridge.example3.implementor.HandsetSoft;

/**
 * ���󻯽�ɫ(Abstraction)�����󻯽ӿڶ���<br>
 * �ֻ�Ʒ��<br>
 * @author Administrator
 */
public abstract class HandsetBrand {

  /**�ֻ����*/
  protected HandsetSoft handsetSoft;

  /**
   * @param handsetSoft the handsetSoft to set
   */
  public void setHandsetSoft(HandsetSoft handsetSoft) {
    this.handsetSoft = handsetSoft;
  }

  /**
   * �������
   */
  public abstract void run();

}
