package dps_03_action_type.dp04_iterator.example2.iterator;

/**
 * 迭代器角色（Iterator）：迭代器角色负责定义访问和遍历元素的接口。<br>
 * @author Administrator
 * @param <E> 
 */
public interface Iterator<E> {

  /**
   * 获取下一个元素<br>
   * @return E
   */
  public E next();

  /**
   * 是否有下一个元素<br>
   * @return boolean
   */
  public boolean hasNext();

}
