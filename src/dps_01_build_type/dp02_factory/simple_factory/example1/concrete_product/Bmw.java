package dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product;

import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * 具体产品角色:宝马车<br>
 * @author Administrator
 */
public class Bmw implements Car {

  /**
   * 开车动作的实现
   */
  public void drive() {
    System.out.println("Driving Bmw ");
  }

}
