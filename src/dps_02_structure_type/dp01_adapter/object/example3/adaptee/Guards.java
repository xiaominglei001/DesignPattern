package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * ����Ҫ�������(�Ѿ�ʵ��Ŀ��ӿ�),��ForeignCenter�Ƚ�<br>
 * ����<br>
 * @author Administrator
 */
public class Guards extends Player {

  /**
   * ���캯��<br>
   * @param name
   */
  public Guards(String name) {
    super(name);
  }

  /**
   * ����
   */
  public void attack() {
    System.out.println("���� " + name + " ����");
  }

  /**
   * ����
   */
  public void defense() {
    System.out.println("���� " + name + " ����");
  }

}
