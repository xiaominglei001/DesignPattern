package dps_02_structure_type.dp01_adapter.class_.example1.adapter;

import dps_02_structure_type.dp01_adapter.class_.example1.adaptee.Adaptee;
import dps_02_structure_type.dp01_adapter.class_.example1.target.Target;

/**
 * ��������Adapter����ɫ:��Դ�ӿ�ת����Ŀ��ӿ�,��һ��ɫ��������.<br>
 * @author Administrator
 */
public class Adapter extends Adaptee implements Target {

  /**
   * ����
   */
  public void request() {
    super.specificRequest();
  }

}
