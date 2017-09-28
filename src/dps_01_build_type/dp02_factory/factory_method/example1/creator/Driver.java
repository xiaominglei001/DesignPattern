package dps_01_build_type.dp02_factory.factory_method.example1.creator;

import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * 抽象工厂角色:司机<br>
 * @author Administrator
 */
public interface Driver {

  /**
   * 取车的动作<br>
   * @return Car
   */
  public Car driverCar();

}
