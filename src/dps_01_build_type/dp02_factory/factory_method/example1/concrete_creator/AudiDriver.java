package dps_01_build_type.dp02_factory.factory_method.example1.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example1.concrete_product.Audi;
import dps_01_build_type.dp02_factory.factory_method.example1.creator.Driver;
import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * ���幤����ɫ:�µ�˾��<br>
 * @author Administrator
 */
public class AudiDriver implements Driver {

  /**
   * ȡ��������ʵ��<br>
   * @return Car
   */
  public Car driverCar() {
    return new Audi();
  }

}