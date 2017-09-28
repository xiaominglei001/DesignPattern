package dps_02_structure_type.dp04_decorator.example1;

import dps_02_structure_type.dp04_decorator.example1.concrete_component.ConcreteComponent;
import dps_02_structure_type.dp04_decorator.example1.concrete_decorator.ConcreteDecoratorA;
import dps_02_structure_type.dp04_decorator.example1.concrete_decorator.ConcreteDecoratorB;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体构件（Concrete Component）角色
    ConcreteComponent c = new ConcreteComponent();

    //具体装饰（Concrete Decorator）角色
    ConcreteDecoratorA d1 = new ConcreteDecoratorA();
    ConcreteDecoratorB d2 = new ConcreteDecoratorB();

    //c装饰d1,d2装饰d1,最后调用d2.operation()
    d1.setComponent(c);
    d2.setComponent(d1);
    d2.operation();
  }
}
