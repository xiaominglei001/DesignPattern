package dps_02_structure_type.dp04_decorator.example1.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example1.decorator.Decorator;

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象"贴上"附加的责任。<br>
 * @author Administrator
 */
public class ConcreteDecoratorA extends Decorator {

  /**本类的特有功能，以区别于ConcreteDecoratorB*/
  private String addedState;

  /**
   * 装饰后的具体操作
   */
  public void operation() {
    super.operation();
    addedState += "New State";
    System.out.println("具体装饰对象A的操作.");
  }

}
