package dps_01_build_type.dp02_factory.factory_method.example1.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example1.concrete_product.Bmw;
import dps_01_build_type.dp02_factory.factory_method.example1.creator.Driver;
import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * ���幤����ɫ:����˾��<br>
 * @author Administrator
 */
public class BmwDriver implements Driver {

  /**
   * ȡ��������ʵ��<br>
   * @return Car
   */
  public Car driverCar() {
    return new Bmw();
  }

}