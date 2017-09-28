package dps_02_structure_type.dp04_decorator.example3.concrete_decorator;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象"贴上"附加的责任<br>
 * @author Administrator
 */
public class DecoratorB extends AbsDecorator {

  /**硬盘*/
  private List<String> disks = new ArrayList<String>();

  /**
   * 构造函数<br>
   * @param action
   */
  public DecoratorB(Action action) {
    super(action);
  }

  /**
   * 增加一个硬盘<br>
   * @param disk
   */
  public void addMemory(String disk) {
    disks.add(disk);
  }

  /**
   * 拨掉一个硬盘<br>
   * @param disk
   */
  public void removeMemory(String disk) {
    disks.remove(disk);
  }

  /**
   * 这里我们对开机的动作进行以下装饰:<br>
   * 1.增加一个1.0G的内存条<br>
   * 2.再增加一个2.5的内存条<br>
   * 3.显示出所有内存<br>
   */
  public void start() {
    //装饰的部分开始
    addMemory("250");
    addMemory("160G");
    for (String disk : disks) {
      System.out.println("Disk: " + disk);
    }
    //装饰的部分结束

    //原构件角色的开机动作调用
    action.start();
  }

  /**
   * 这里我们对关机的动作进行以下装饰:<br>
   * 1.拨掉250G的硬盘<br>
   * 2.再拨掉160G的硬盘<br>
   */
  public void shutdown() {
    //装饰的部分开始
    removeMemory("250");
    removeMemory("160G");
    //装饰的部分结束
    action.shutdown();
  }

}
