package dps_03_action_type.dp04_iterator.example1.iterator;

/**
 * ��������ɫ��Iterator������������ɫ��������ʺͱ���Ԫ�صĽӿڡ�<br>
 * @author Administrator
 */
public interface Iterator {

  /**
   * ��ȡ��һ��Ԫ��<br>
   * @return Object
   */
  public Object next();

  /**
   * �Ƿ�����һ��Ԫ��<br>
   * @return boolean
   */
  public boolean hasNext();

}
