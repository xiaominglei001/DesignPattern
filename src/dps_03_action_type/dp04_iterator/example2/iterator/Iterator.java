package dps_03_action_type.dp04_iterator.example2.iterator;

/**
 * ��������ɫ��Iterator������������ɫ��������ʺͱ���Ԫ�صĽӿڡ�<br>
 * @author Administrator
 * @param <E> 
 */
public interface Iterator<E> {

  /**
   * ��ȡ��һ��Ԫ��<br>
   * @return E
   */
  public E next();

  /**
   * �Ƿ�����һ��Ԫ��<br>
   * @return boolean
   */
  public boolean hasNext();

}
