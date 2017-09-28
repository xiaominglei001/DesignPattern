package dps_03_action_type.dp04_iterator.example1.container;

import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * 容器角色（Container）：容器角色负责提供创建具体迭代器角色的接口。<br>
 * @author Administrator
 */
public interface Aggregate {

  /**
   * 返回一个迭代器<br>
   * @return Iterator
   */
  public Iterator iterator();

}
