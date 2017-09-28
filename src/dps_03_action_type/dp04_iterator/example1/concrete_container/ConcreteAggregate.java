package dps_03_action_type.dp04_iterator.example1.concrete_container;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp04_iterator.example1.concrete_iterator.ConcreteIterator;
import dps_03_action_type.dp04_iterator.example1.container.Aggregate;
import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * ����������ɫ��Concrete Container��������������ɫʵ�ִ��������������ɫ�Ľӿڡ�����������������ɫ�ڸ������Ľṹ��ء�<br>
 * @author Administrator
 */
public class ConcreteAggregate implements Aggregate {

  /**����Ԫ�ص�����*/
  private List<Object> items = new ArrayList<Object>();

  /**
   * ����һ��������<br>
   * @return Iterator
   */
  public Iterator iterator() {
    return new ConcreteIterator(this);
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
   * @return Object
   */
  public Object get(int i) {
    return items.get(i);
  }

  /**
   * ����һ����Ԫ��<br>
   * @param obj 
   * @return Object
   */
  public boolean add(Object obj) {
    return items.add(obj);
  }

}
