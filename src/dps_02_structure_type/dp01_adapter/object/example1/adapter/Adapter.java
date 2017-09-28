package dps_02_structure_type.dp01_adapter.object.example1.adapter;

import dps_02_structure_type.dp01_adapter.object.example1.adaptee.Adaptee;
import dps_02_structure_type.dp01_adapter.object.example1.target.Target;

/**
 * 适配器（Adapter）角色:把源接口转换成目标接口,这一角色必须是类.<br>
 * @author Administrator
 */
public class Adapter implements Target {

  /**由于是对象的Adapter模式,所以这里不在继承自Adaptee,而是改成成员变量*/
  private Adaptee adaptee;

  /**
   * 构造函数
   */
  public Adapter() {
    adaptee = new Adaptee();
  }

  /**
   * 执行请求
   */
  public void request() {
    adaptee.specificRequest();
  }

}
