package dps_02_structure_type.dp04_decorator.example2.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example2.decorator.Finery;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ����Ρ�<br>
 * ����Ь<br>
 * @author Administrator
 */
public class Sneakers extends Finery {

  /**
   * չʾ�Լ�
   */
  public void show() {
    System.out.print("����Ь ");
    super.show();
  }

}
