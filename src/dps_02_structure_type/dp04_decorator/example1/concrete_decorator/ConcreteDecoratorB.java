package dps_02_structure_type.dp04_decorator.example1.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example1.decorator.Decorator;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ����Ρ�<br>
 * @author Administrator
 */
public class ConcreteDecoratorB extends Decorator {

  /**
   * װ�κ�ľ������
   */
  public void operation() {
    super.operation();
    addedBehavior();
    System.out.println("����װ�ζ���B�Ĳ���.");
  }

  /**
   * ��������й��ܣ���������ConcreteDecoratorA
   */
  private void addedBehavior() {
  }

}
