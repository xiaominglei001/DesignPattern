package dps_01_build_type.dp02_factory.simple_factory.example1;

import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_creator.Driver;
import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * ������<br>
 * ����������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    //�����Ʒ��ɫ:��,����˾���ҽ���������              
    Car car = Driver.driverCar("benz");
    //���������                   
    car.drive();
  }

}