package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * ����Ҫ�������(�Ѿ�ʵ��Ŀ��ӿ�),��ForeignCenter�Ƚ�<br>
 * �з�<br>
 * @author Administrator
 */
public class Center extends Player {

  /**
   * ���캯��<br>
   * @param name
   */
  public Center(String name) {
    super(name);
  }

  /**
   * ����
   */
  public void attack() {
    System.out.println("�з� " + name + " ����");
  }

  /**
   * ����
   */
  public void defense() {
    System.out.println("�з� " + name + " ����");
  }

}
