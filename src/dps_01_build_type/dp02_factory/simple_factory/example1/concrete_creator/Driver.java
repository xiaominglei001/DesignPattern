package dps_01_build_type.dp02_factory.simple_factory.example1.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Audi;
import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Benz;
import dps_01_build_type.dp02_factory.simple_factory.example1.concrete_product.Bmw;
import dps_01_build_type.dp02_factory.simple_factory.example1.product.Car;

/**
 * ���幤�����ɫ�����Ǳ�ģʽ�ĺ��ģ�����һ������ҵ�߼����ж��߼���<br>
 * �򵥹���ģʽ��û�г��󹤳���ɫ<br>
 * ˾��<br>
 * @author Administrator
 */
public class Driver {

  /**
   * ��������.ע��(��������Ϊ�����Ʒ��ɫ)<br>
   * @param su
   * @return Car
   * @throws Exception
   */
  public static Car driverCar(String su) throws Exception {
    //�ж��߼������ؾ���Ĳ�Ʒ��ɫ��Client
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
