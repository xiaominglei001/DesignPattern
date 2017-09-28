package dps_03_action_type.dp04_iterator.example2.concrete_iterator;

import dps_03_action_type.dp04_iterator.example2.concrete_container.ConcreteAggregate;
import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * �����������ɫ��Concrete Iterator���������������ɫҪʵ�ֵ������ӿڣ���Ҫ��¼�����еĵ�ǰλ�á�<br>
 * @author Administrator
 * @param <E> 
 */
public class ConcreteIterator<E> implements Iterator<E> {

  /**����������ɫ*/
  private ConcreteAggregate<E> aggregate;
  /**��ǰλ��*/
  private int current = 0;

  /**
   * ���캯��<br>
   * @param aggregate
   */
  public ConcreteIterator(ConcreteAggregate<E> aggregate) {
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
