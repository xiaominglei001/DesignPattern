package dps_03_action_type.dp04_iterator.example2.concrete_container;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp04_iterator.example2.concrete_iterator.ConcreteIterator;
import dps_03_action_type.dp04_iterator.example2.container.Aggregate;
import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * ����������ɫ��Concrete Container��������������ɫʵ�ִ��������������ɫ�Ľӿڡ�����������������ɫ�ڸ������Ľṹ��ء�<br>
 * @author Administrator
 * @param <E>
 */
public class ConcreteAggregate<E> implements Aggregate<E> {

  /**����Ԫ�ص�����*/
  private List<E> items = new ArrayList<E>();

  /**
   * ����һ��������<br>
   * @return Iterator
   */
  public Iterator<E> iterator() {
    return new ConcreteIterator<E>(this);
  }

  /**
   * ��ȡԪ�ص��ܸ���<br>
   * @return int
   */
  public int size() {
    return items.size();
  }

  /**
   * ��ȡλ��i��Ԫ��<br>
   * @param i
   * @return E
   */
  public E get(int i) {
    return items.get(i);
  }

  /**
   * ����һ����Ԫ��<br>
   * @param obj 
   * @return boolean
   */
  public boolean add(E obj) {
    return items.add(obj);
  }

}
