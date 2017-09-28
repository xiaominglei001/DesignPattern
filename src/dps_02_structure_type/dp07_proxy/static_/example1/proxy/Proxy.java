package dps_02_structure_type.dp07_proxy.static_.example1.proxy;

import dps_02_structure_type.dp07_proxy.static_.example1.real_subject.RealSubject;
import dps_02_structure_type.dp07_proxy.static_.example1.subject.Subject;

/**
 * �����ɫ����������ɫ�ڲ����ж���ʵ��������ã��Ӷ����Բ�����ʵ����<br>
 * ͬʱ��������ṩ����ʵ������ͬ�Ľӿ��Ա����κ�ʱ�̶��ܴ�����ʵ����<br>
 * ͬʱ��������������ִ����ʵ�������ʱ�����������Ĳ������൱�ڶ���ʵ������з�װ��<br>
 * ������,�����þ�̬����<br>
 * @author Administrator
 */
public class Proxy implements Subject {

  /**��ʵ��ɫ�������ɫ���������ʵ��������������Ҫ���õĶ���*/
  private RealSubject realSubject;

  /**
   * ����������
   */
  public void request() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    //������������ķ���
    realSubject.request();
  }

}
