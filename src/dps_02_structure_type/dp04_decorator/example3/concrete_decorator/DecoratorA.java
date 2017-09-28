package dps_02_structure_type.dp04_decorator.example3.concrete_decorator;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象"贴上"附加的责任<br>
 * @author Administrator
 */
public class DecoratorA extends AbsDecorator {

  /**内存条*/
  private List<String> memorys = new ArrayList<String>();

  /**
   * 构造函数<br>
   * @param action
   */
  public DecoratorA(Action action) {
    super(action);
  }

  /**
   * 增加一个内存条<br>
   * @param memory
   */
  public void addMemory(String memory) {
    memorys.add(memory);
  }

  /**
   * 这里我们对开机的动作进行以下装饰:<br>
   * 1.增加一个1.0G的内存条<br>
   * 2.再增加一个2.5的内存条<br>
   * 3.显示出所有内存<br>
   */
  public void start() {
    //装饰的部分开始
    addMemory("1.0G");
    addMemory("2.5G");
    for (String memory : memorys) {
      System.out.println("Memory: " + memory);
    }
    //装饰的部分结束

    //原构件角色的开机动作调用
    action.start();
  }

  /**
   * 这里我们对关机的动作不进行装饰
   */
  public void shutdown() {
    action.shutdown();
  }

}
