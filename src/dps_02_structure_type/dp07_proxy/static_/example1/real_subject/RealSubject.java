package dps_02_structure_type.dp07_proxy.static_.example1.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example1.subject.Subject;

/**
 * ��ʵ��ɫ�������ɫ���������ʵ��������������Ҫ���õĶ���<br>
 * @author Administrator
 */
public class RealSubject implements Subject {

  /**
   * ��������
   */
  public void request() {
    System.out.println("��ʵ������.");
  }

}