package dps_02_structure_type.dp07_proxy.static_.example2.subject;

/**
 * 抽象角色：声明真实对象和代理对象的共同接口；<br>
 * 计算器<br>
 * @author Administrator
 */
public interface IMath {

  /**
   * 加法<br>
   * @param x
   * @param y
   * @return double
   */
  public double add(double x, double y);

  /**
   * 减法<br>
   * @param x
   * @param y
   * @return double
   */
  public double sub(double x, double y);

}
