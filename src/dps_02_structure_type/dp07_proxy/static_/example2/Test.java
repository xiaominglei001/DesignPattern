package dps_02_structure_type.dp07_proxy.static_.example2;

import dps_02_structure_type.dp07_proxy.static_.example2.proxy.MathProxy;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ɫ
    MathProxy proxy = new MathProxy();
    System.out.println(proxy.add(10, 20));
    System.out.println(proxy.sub(10, 20));
  }

}
