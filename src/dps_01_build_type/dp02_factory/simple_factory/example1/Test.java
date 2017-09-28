package dps_01_build_type.dp02_factory.simple_factory.example1;

import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_creator.Driver;
import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * 测试类<br>
 * 暴发户出场<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    //抽象产品角色:车,告诉司机我今天坐奔驰              
    Car car = Driver.driverCar("benz");
    //下命令：开车                   
    car.drive();
  }

}