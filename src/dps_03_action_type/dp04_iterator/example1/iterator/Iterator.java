package dps_03_action_type.dp04_iterator.example1.iterator;

/**
 * 迭代器角色（Iterator）：迭代器角色负责定义访问和遍历元素的接口。<br>
 * @author Administrator
 */
public interface Iterator {

  /**
   * 获取下一个元素<br>
   * @return Object
   */
  public Object next();

  /**
   * 是否有下一个元素<br>
   * @return boolean
   */
  public boolean hasNext();

}
