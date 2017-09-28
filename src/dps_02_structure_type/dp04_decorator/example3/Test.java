package dps_02_structure_type.dp04_decorator.example3;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.concrete_component.Computer;
import dps_02_structure_type.dp04_decorator.example3.concrete_decorator.DecoratorA;
import dps_02_structure_type.dp04_decorator.example3.concrete_decorator.DecoratorB;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * 测试类<br>
 * 此示例是否符合装饰模式有待商榷!!!!!!!!!!!!!!!!!!!!!!!<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //这里未经过装饰的开机动作是:computer.start();
    //经过装饰后的开机动作是:decorator.start();
    //抽象构件（Component）角色:这里是电脑的动作
    Action computer = new Computer();

    //抽象装饰（Decorator）角色
    AbsDecorator decoratorA = new DecoratorA(computer);
    decoratorA.start();//开机
    System.out.println();

    AbsDecorator decoratorB = new DecoratorB(computer);
    decoratorB.start();//开机
  }

}
