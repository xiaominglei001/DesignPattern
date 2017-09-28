package dps_01_build_type.dp02_factory.simple_factory.example2.product;

/**
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。<br>
 * 运算<br>
 * @author Administrator
 */
public interface Operation {

  /**
   * 获取运算的结果<br>
   * @param a
   * @param b
   * @return double
   */
  public double getResult(double a, double b);

}
