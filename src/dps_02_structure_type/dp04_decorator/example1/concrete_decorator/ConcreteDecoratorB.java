package dps_02_structure_type.dp04_decorator.example1.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example1.decorator.Decorator;

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象"贴上"附加的责任。<br>
 * @author Administrator
 */
public class ConcreteDecoratorB extends Decorator {

  /**
   * 装饰后的具体操作
   */
  public void operation() {
    super.operation();
    addedBehavior();
    System.out.println("具体装饰对象B的操作.");
  }

  /**
   * 本类的特有功能，以区别于ConcreteDecoratorA
   */
  private void addedBehavior() {
  }

}
