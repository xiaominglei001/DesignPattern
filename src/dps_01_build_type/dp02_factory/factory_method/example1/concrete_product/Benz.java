package dps_01_build_type.dp02_factory.factory_method.example1.concrete_product;

import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * 具体产品角色:奔驰车<br>
 * @author Administrator
 */
public class Benz implements Car {

  /**
   * 开车动作的实现
   */
  public void drive() {
    System.out.println("Driving Benz ");
  }

}
