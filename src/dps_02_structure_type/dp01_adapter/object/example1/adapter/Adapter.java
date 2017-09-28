package dps_02_structure_type.dp01_adapter.object.example1.adapter;

import dps_02_structure_type.dp01_adapter.object.example1.adaptee.Adaptee;
import dps_02_structure_type.dp01_adapter.object.example1.target.Target;

/**
 * ��������Adapter����ɫ:��Դ�ӿ�ת����Ŀ��ӿ�,��һ��ɫ��������.<br>
 * @author Administrator
 */
public class Adapter implements Target {

  /**�����Ƕ����Adapterģʽ,�������ﲻ�ڼ̳���Adaptee,���Ǹĳɳ�Ա����*/
  private Adaptee adaptee;

  /**
   * ���캯��
   */
  public Adapter() {
    adaptee = new Adaptee();
  }

  /**
   * ִ������
   */
  public void request() {
    adaptee.specificRequest();
  }

}
