package dps_03_action_type.dp04_iterator.example2.container;

import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * ������ɫ��Container����������ɫ�����ṩ���������������ɫ�Ľӿڡ�<br>
 * @author Administrator
 * @param <E> 
 */
public interface Aggregate<E> {

  /**
   * ����һ��������<br>
   * @return Iterator<E>
   */
  public Iterator<E> iterator();

}
