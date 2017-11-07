package dps_01_build_type.dp02_factory.simple_factory.example1.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Audi;
import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Benz;
import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Bmw;
import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * 具体工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑。<br>
 * 简单工厂模式中没有抽象工厂角色<br>
 * 司机<br>
 * @author Administrator
 */
public class Driver {

  /**
   * 工厂方法.注意(返回类型为抽象产品角色)<br>
   * @param su
   * @return Car
   * @throws Exception
   */
  public static Car driverCar(String su) throws Exception {
    //判断逻辑，返回具体的产品角色给Client
    if (su.equalsIgnoreCase("Benz"))
      return new Benz();
    else if (su.equalsIgnoreCase("Bmw"))
      return new Bmw();
    else if (su.equalsIgnoreCase("Audi"))
      return new Audi();
    else
      throw new Exception("Lawless car");
  }

}
