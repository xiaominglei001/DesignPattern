package dps_02_structure_type.dp02_bridge.example3.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example3.implementor.HandsetSoft;

/**
 * ����ʵ�ֻ���ɫ(Concrete Implementor)��ʵ�ֻ���ɫ�ӿڵľ���ʵ��<br>
 * �ֻ���Ϸ<br>
 * @author Administrator
 */
public class HandsetGame implements HandsetSoft {

  /**
   * �������
   */
  public void run() {
    System.out.println("�����ֻ���Ϸ.");
  }

}
