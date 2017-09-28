package dps_02_structure_type.dp04_decorator.example1.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example1.decorator.Decorator;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ����Ρ�<br>
 * @author Administrator
 */
public class ConcreteDecoratorA extends Decorator {

  /**��������й��ܣ���������ConcreteDecoratorB*/
  private String addedState;

  /**
   * װ�κ�ľ������
   */
  public void operation() {
    super.operation();
    addedState += "New State";
    System.out.println("����װ�ζ���A�Ĳ���.");
  }

}
