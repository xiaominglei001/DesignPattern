package dps_03_action_type.dp04_iterator.example1.container;

import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * ������ɫ��Container����������ɫ�����ṩ���������������ɫ�Ľӿڡ�<br>
 * @author Administrator
 */
public interface Aggregate {

  /**
   * ����һ��������<br>
   * @return Iterator
   */
  public Iterator iterator();

}
