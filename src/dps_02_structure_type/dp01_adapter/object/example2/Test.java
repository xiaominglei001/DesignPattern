package dps_02_structure_type.dp01_adapter.object.example2;

import dps_02_structure_type.dp01_adapter.object.example2.adapter.ShapeAdapter;
import dps_02_structure_type.dp01_adapter.object.example2.target.Shape;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Ŀ�꣨Target����ɫ:����״
    Shape s = new ShapeAdapter();
    s.paint();//����״
  }

}
