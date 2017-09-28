package dps_03_action_type.dp04_iterator.example1.concrete_container;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp04_iterator.example1.concrete_iterator.ConcreteIterator;
import dps_03_action_type.dp04_iterator.example1.container.Aggregate;
import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * 具体容器角色（Concrete Container）：具体容器角色实现创建具体迭代器角色的接口——这个具体迭代器角色于该容器的结构相关。<br>
 * @author Administrator
 */
public class ConcreteAggregate implements Aggregate {

  /**储存元素的容器*/
  private List<Object> items = new ArrayList<Object>();

  /**
   * 返回一个迭代器<br>
   * @return Iterator
   */
  public Iterator iterator() {
    return new ConcreteIterator(this);
  }

  /**
   * 获取元素的总个数<br>
   * @return int
   */
  public int size() {
    return items.size();
  }

  /**
   * 获取位于i的元素<br>
   * @param i
   * @return Object
   */
  public Object get(int i) {
    return items.get(i);
  }

  /**
   * 增加一个新元素<br>
   * @param obj 
   * @return Object
   */
  public boolean add(Object obj) {
    return items.add(obj);
  }

}
