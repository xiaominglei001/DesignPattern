package dps_02_structure_type.dp01_adapter.class_.example2.adapter;

import dps_02_structure_type.dp01_adapter.class_.example2.adaptee.Circle;
import dps_02_structure_type.dp01_adapter.class_.example2.target.Shape;

/**
 * ��������Adapter����ɫ:��Դ�ӿ�ת����Ŀ��ӿ�,��һ��ɫ��������.<br>
 * @author Administrator
 */
public class ShapeAdapter extends Circle implements Shape {

  /**
   * ����״
   */
  public void paint() {
    super.paintCircle();
  }

}
