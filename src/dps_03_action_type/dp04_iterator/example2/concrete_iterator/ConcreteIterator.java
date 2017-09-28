package dps_03_action_type.dp04_iterator.example2.concrete_iterator;

import dps_03_action_type.dp04_iterator.example2.concrete_container.ConcreteAggregate;
import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * 具体迭代器角色（Concrete Iterator）：具体迭代器角色要实现迭代器接口，并要记录遍历中的当前位置。<br>
 * @author Administrator
 * @param <E> 
 */
public class ConcreteIterator<E> implements Iterator<E> {

  /**具体容器角色*/
  private ConcreteAggregate<E> aggregate;
  /**当前位置*/
  private int current = 0;

  /**
   * 构造函数<br>
   * @param aggregate
   */
  public ConcreteIterator(ConcreteAggregate<E> aggregate) {
    this.aggregate = aggregate;
  }

  /**
   * 是否有下一个元素<br>
   * @return boolean
   */
  public boolean hasNext() {
    return current < aggregate.size();
  }

  /**
   * 获取下一个元素<br>
   * @return E
   */
  public E next() {
    if (current < aggregate.size()) {
      return aggregate.get(current++);
    } else {
      return null;
    }
  }

}
