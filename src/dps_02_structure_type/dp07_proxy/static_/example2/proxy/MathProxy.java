package dps_02_structure_type.dp07_proxy.static_.example2.proxy;

import dps_02_structure_type.dp07_proxy.static_.example2.real_subject.Math;
import dps_02_structure_type.dp07_proxy.static_.example2.subject.IMath;

/**
 * �����ɫ����������ɫ�ڲ����ж���ʵ��������ã��Ӷ����Բ�����ʵ����<br>
 * ͬʱ��������ṩ����ʵ������ͬ�Ľӿ��Ա����κ�ʱ�̶��ܴ�����ʵ����<br>
 * ͬʱ��������������ִ����ʵ�������ʱ�����������Ĳ������൱�ڶ���ʵ������з�װ��<br>
 * ������,�����þ�̬����<br>
 * @author Administrator
 */
public class MathProxy implements IMath {

  /**ί�е���:��������ʵ����*/
  private Math delegate;

  /**
   * ���캯��
   */
  public MathProxy() {
    this.delegate = new Math();
  }

  /**
   * �ӷ�<br>
   * @param x
   * @param y
   * @return double
   */
  public double add(double x, double y) {
    return delegate.add(x, y);
  }

  /**
   * ����<br>
   * @param x
   * @param y
   * @return double
   */
  public double sub(double x, double y) {
    return delegate.sub(x, y);
  }

}
