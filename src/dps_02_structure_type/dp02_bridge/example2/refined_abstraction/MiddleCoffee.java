package dps_02_structure_type.dp02_bridge.example2.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;

/**
 * ������󻯽�ɫ(Refined Abstraction)�����󻯾���ʵ��<br>
 * �б�����<br>
 * @author Administrator
 */
public class MiddleCoffee extends Drink {

  /**
   * �忧�ȹ���
   */
  public void makeDrink() {
    System.out.print("��1�б�����:");
    //��xx��������仰����
    action.execute();
  }

}
