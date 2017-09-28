package dps_02_structure_type.dp07_proxy.static_.example1;

import dps_02_structure_type.dp07_proxy.static_.example1.proxy.Proxy;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //代理角色
    Proxy proxy = new Proxy();

    //代理发送请求 
    proxy.request();
  }

}
