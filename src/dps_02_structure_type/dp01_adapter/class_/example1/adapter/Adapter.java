package dps_02_structure_type.dp01_adapter.class_.example1.adapter;

import dps_02_structure_type.dp01_adapter.class_.example1.adaptee.Adaptee;
import dps_02_structure_type.dp01_adapter.class_.example1.target.Target;

/**
 * 适配器（Adapter）角色:把源接口转换成目标接口,这一角色必须是类.<br>
 * @author Administrator
 */
public class Adapter extends Adaptee implements Target {

  /**
   * 请求
   */
  public void request() {
    super.specificRequest();
  }

}
