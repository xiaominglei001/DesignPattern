package dps_01_build_type.dp02_factory.factory_method.example1;

import dps_01_build_type.dp02_factory.factory_method.example1.concrete_creator.BenzDriver;
import dps_01_build_type.dp02_factory.factory_method.example1.creator.Driver;
import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * 测试类<br>
 * 暴发户出场<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象工厂角色:司机
    Driver driver = new BenzDriver();
    //抽象产品角色:车
    Car car = driver.driverCar();//取车的动作
    //开车的动作
    car.drive();
  }

}