package dps_02_structure_type.dp04_decorator.example2.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example2.decorator.Finery;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ����Ρ�<br>
 * ��װ<br>
 * @author Administrator
 */
public class Suit extends Finery {

  /**
   * չʾ�Լ�
   */
  public void show() {
    System.out.print("��װ ");
    super.show();
  }

}
