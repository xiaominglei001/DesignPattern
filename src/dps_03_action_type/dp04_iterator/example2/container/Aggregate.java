package dps_03_action_type.dp04_iterator.example2.container;

import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * 容器角色（Container）：容器角色负责提供创建具体迭代器角色的接口。<br>
 * @author Administrator
 * @param <E> 
 */
public interface Aggregate<E> {

  /**
   * 返回一个迭代器<br>
   * @return Iterator<E>
   */
  public Iterator<E> iterator();

}
