package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * ����Ҫ�������(�Ѿ�ʵ��Ŀ��ӿ�),��ForeignCenter�Ƚ�<br>
 * ǰ��<br>
 * @author Administrator
 */
public class Forwards extends Player {

  /**
   * ���캯��<br>
   * @param name
   */
  public Forwards(String name) {
    super(name);
  }

  /**
   * ����
   */
  public void attack() {
    System.out.println("ǰ�� " + name + " ����");
  }

  /**
   * ����
   */
  public void defense() {
    System.out.println("ǰ�� " + name + " ����");
  }

}
