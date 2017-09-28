package dps_02_structure_type.dp01_adapter.object.example2.adapter;

import dps_02_structure_type.dp01_adapter.object.example2.adaptee.Circle;
import dps_02_structure_type.dp01_adapter.object.example2.target.Shape;

/**
 * 适配器（Adapter）角色:把源接口转换成目标接口,这一角色必须是类.<br>
 * @author Administrator
 */
public class ShapeAdapter extends Shape {

  /**由于是对象的Adapter模式,所以这里不在继承自Circle,而是改成成员变量*/
  private Circle circle;

  /**
   * 构造函数
   */
  public ShapeAdapter() {
    circle = new Circle();
  }

  /**
   * 画形状
   */
  public void paint() {
    super.paint();
    circle.paintCircle();
  }

}
