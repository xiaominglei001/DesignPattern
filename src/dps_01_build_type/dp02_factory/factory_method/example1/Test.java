package dps_01_build_type.dp02_factory.factory_method.example1;

import dps_01_build_type.dp02_factory.factory_method.example1.concrete_creator.BenzDriver;
import dps_01_build_type.dp02_factory.factory_method.example1.creator.Driver;
import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * ������<br>
 * ����������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���󹤳���ɫ:˾��
    Driver driver = new BenzDriver();
    //�����Ʒ��ɫ:��
    Car car = driver.driverCar();//ȡ���Ķ���
    //�����Ķ���
    car.drive();
  }

}