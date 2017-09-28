package dps_02_structure_type.dp04_decorator.example1;

import dps_02_structure_type.dp04_decorator.example1.concrete_component.ConcreteComponent;
import dps_02_structure_type.dp04_decorator.example1.concrete_decorator.ConcreteDecoratorA;
import dps_02_structure_type.dp04_decorator.example1.concrete_decorator.ConcreteDecoratorB;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���幹����Concrete Component����ɫ
    ConcreteComponent c = new ConcreteComponent();

    //����װ�Σ�Concrete Decorator����ɫ
    ConcreteDecoratorA d1 = new ConcreteDecoratorA();
    ConcreteDecoratorB d2 = new ConcreteDecoratorB();

    //cװ��d1,d2װ��d1,������d2.operation()
    d1.setComponent(c);
    d2.setComponent(d1);
    d2.operation();
  }
}
