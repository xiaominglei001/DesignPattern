package dps_02_structure_type.dp01_adapter.class_.example2;

import dps_02_structure_type.dp01_adapter.class_.example2.adapter.ShapeAdapter;
import dps_02_structure_type.dp01_adapter.class_.example2.target.Shape;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Ŀ�꣨Target����ɫ: ����״�Ľӿ�
    Shape s = new ShapeAdapter();
    s.paint();//����״
  }

}
