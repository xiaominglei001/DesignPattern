package dps_02_structure_type.dp01_adapter.object.example2.target;

/**
 * 目标（Target）角色:画形状<br>
 * 这是客户所期待的接口,目标可以是具体的或抽象的类,也可以是接口.<br>
 * @author Administrator
 */
public abstract class Shape {

  /***
   * 接口(画形状)
   */
  public void paint() {
    System.out.println("Painted something in super class.");
  }

}
