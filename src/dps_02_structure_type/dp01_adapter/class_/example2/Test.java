package dps_02_structure_type.dp01_adapter.class_.example2;

import dps_02_structure_type.dp01_adapter.class_.example2.adapter.ShapeAdapter;
import dps_02_structure_type.dp01_adapter.class_.example2.target.Shape;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //目标（Target）角色: 画形状的接口
    Shape s = new ShapeAdapter();
    s.paint();//画形状
  }

}
