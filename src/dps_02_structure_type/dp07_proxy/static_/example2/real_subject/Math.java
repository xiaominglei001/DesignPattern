package dps_02_structure_type.dp07_proxy.static_.example2.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example2.subject.IMath;

/**
 * 真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。<br>
 * 计算器的实现类<br>
 * @author Administrator
 */
public class Math implements IMath {

  /**
   * 加法<br>
   * @param x
   * @param y
   * @return double
   */
  public double add(double x, double y) {
    return x + y;
  }

  /**
   * 减法<br>
   * @param x
   * @param y
   * @return double
   */
  public double sub(double x, double y) {
    return x - y;
  }

}