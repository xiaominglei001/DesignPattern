package dps_02_structure_type.dp07_proxy.static_.example2.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example2.subject.IMath;

/**
 * ��ʵ��ɫ�������ɫ���������ʵ��������������Ҫ���õĶ���<br>
 * ��������ʵ����<br>
 * @author Administrator
 */
public class Math implements IMath {

  /**
   * �ӷ�<br>
   * @param x
   * @param y
   * @return double
   */
  public double add(double x, double y) {
    return x + y;
  }

  /**
   * ����<br>
   * @param x
   * @param y
   * @return double
   */
  public double sub(double x, double y) {
    return x - y;
  }

}