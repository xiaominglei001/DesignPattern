package dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product;

import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * 具体产品角色:奥迪车<br>
 * @author Administrator
 */
public class Audi implements Car {

  /**
   * 开车动作的实现
   */
  public void drive() {
    System.out.println("Driving Audi ");
  }

}
