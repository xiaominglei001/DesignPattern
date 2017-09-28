package dps_01_build_type.dp02_factory.factory_method.example2.concrete_product;

import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。<br>
 * 乘法<br>
 * @author Administrator
 */
public class OperationMul implements Operation {

  /**
   * 获取运算的结果<br>
   * @param a
   * @param b
   * @return double
   */
  public double getResult(double a, double b) {
    return a * b;
  }

}
