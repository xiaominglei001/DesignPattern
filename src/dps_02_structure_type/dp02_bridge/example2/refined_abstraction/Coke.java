package dps_02_structure_type.dp02_bridge.example2.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;

/**
 * ������󻯽�ɫ(Refined Abstraction)�����󻯾���ʵ��<br>
 * ����<br>
 * @author Administrator
 */
public class Coke extends Drink {

  /**
   * ����ֹ���
   */
  public void makeDrink() {
    System.out.print("��1������:");
    //��xx��������仰����
    action.execute();
  }

}
