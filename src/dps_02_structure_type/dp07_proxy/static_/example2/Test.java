package dps_02_structure_type.dp07_proxy.static_.example2;

import dps_02_structure_type.dp07_proxy.static_.example2.proxy.MathProxy;

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
    MathProxy proxy = new MathProxy();
    System.out.println(proxy.add(10, 20));
    System.out.println(proxy.sub(10, 20));
  }

}
