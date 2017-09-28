package dps_02_structure_type.dp01_adapter.object.example2.adapter;

import dps_02_structure_type.dp01_adapter.object.example2.adaptee.Circle;
import dps_02_structure_type.dp01_adapter.object.example2.target.Shape;

/**
 * ��������Adapter����ɫ:��Դ�ӿ�ת����Ŀ��ӿ�,��һ��ɫ��������.<br>
 * @author Administrator
 */
public class ShapeAdapter extends Shape {

  /**�����Ƕ����Adapterģʽ,�������ﲻ�ڼ̳���Circle,���Ǹĳɳ�Ա����*/
  private Circle circle;

  /**
   * ���캯��
   */
  public ShapeAdapter() {
    circle = new Circle();
  }

  /**
   * ����״
   */
  public void paint() {
    super.paint();
    circle.paintCircle();
  }

}
