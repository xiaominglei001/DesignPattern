package dps_02_structure_type.dp01_adapter.class_.example1;

import dps_02_structure_type.dp01_adapter.class_.example1.adapter.Adapter;
import dps_02_structure_type.dp01_adapter.class_.example1.target.Target;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //目标（Target）角色:请求
    Target target = new Adapter();
    target.request();//发出请求
  }

}
