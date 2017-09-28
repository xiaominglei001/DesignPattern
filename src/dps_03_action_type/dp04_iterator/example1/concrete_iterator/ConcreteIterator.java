package dps_03_action_type.dp04_iterator.example1.concrete_iterator;

import dps_03_action_type.dp04_iterator.example1.concrete_container.ConcreteAggregate;
import dps_03_action_type.dp04_iterator.example1.iterator.Iterator;

/**
 * �����������ɫ��Concrete Iterator���������������ɫҪʵ�ֵ������ӿڣ���Ҫ��¼�����еĵ�ǰλ�á�<br>
 * @author Administrator
 */
public class ConcreteIterator implements Iterator {

  /**����������ɫ*/
  private ConcreteAggregate aggregate;
  /**��ǰλ��*/
  private int current = 0;

  /**
   * ���캯��<br>
   * @param aggregate
   */
  public ConcreteIterator(ConcreteAggregate aggregate) {
    this.aggregate = aggregate;
  }

  /**
   * �Ƿ�����һ��Ԫ��<br>
   * @return boolean
   */
  public boolean hasNext() {
    return current < aggregate.size();
  }

  /**
   * ��ȡ��һ��Ԫ��<br>
   * @return Object
   */
  public Object next() {
    if (current < aggregate.size()) {
      return aggregate.get(current++);
    } else {
      return null;
    }
  }

}
