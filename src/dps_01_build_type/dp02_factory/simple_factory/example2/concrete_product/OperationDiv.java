package dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product;

import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

/**
 * 具体产品角色：工厂角色所创建的对象就是此角色的实例。<br>
 * 除法<br>
 * @author Administrator
 */
public class OperationDiv implements Operation {

  /**
   * 获取运算的结果<br>
   * @param a
   * @param b
   * @return double
   */
  public double getResult(double a, double b) {
    return a / b;
  }

}
