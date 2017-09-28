package dps_02_structure_type.dp01_adapter.class_.example2.adapter;

import dps_02_structure_type.dp01_adapter.class_.example2.adaptee.Circle;
import dps_02_structure_type.dp01_adapter.class_.example2.target.Shape;

/**
 * 适配器（Adapter）角色:把源接口转换成目标接口,这一角色必须是类.<br>
 * @author Administrator
 */
public class ShapeAdapter extends Circle implements Shape {

  /**
   * 画形状
   */
  public void paint() {
    super.paintCircle();
  }

}
