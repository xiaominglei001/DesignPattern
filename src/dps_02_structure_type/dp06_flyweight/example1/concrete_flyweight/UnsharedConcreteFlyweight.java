package dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight;

import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;

/**
 * ������Ԫ(ConcreteFlyweight)��ɫ:ʵ�ֳ�����Ԫ��ɫ���涨�Ľӿ�.<br>
 * ����Ҫ���������<br>
 * @author Administrator
 */
public class UnsharedConcreteFlyweight implements Flyweight {

  /**
   * �������<br>
   * @param extrinsicstate �ⲿ״̬
   */
  public void operation(int extrinsicstate) {
    System.out.println("������ľ���Flyweight:" + extrinsicstate);
  }

}
