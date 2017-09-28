package dps_03_action_type.dp04_iterator.example1;

import dps_03_action_type.dp04_iterator.example1.concrete_container.ConcreteAggregate;
import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * 测试类<br>
 * 不带泛型的迭代器<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体容器角色（Concrete Container）：
    ConcreteAggregate ca = new ConcreteAggregate();
    ca.add("大鸟");
    ca.add("小菜");
    ca.add("小李");
    ca.add("老外");
    ca.add("公司内部员工");
    ca.add("小偷");

    System.out.println("不带泛型的迭代器:");
    //迭代器角色（Iterator）：
    Iterator iterator = ca.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());//获取下一个元素
    }
  }

}
