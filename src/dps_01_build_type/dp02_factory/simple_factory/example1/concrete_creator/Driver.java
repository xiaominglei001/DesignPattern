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
   * @param s
   * @return Car
   * @throws Exception
   */
  public static Car driverCar(String s) throws Exception {
    //�ж��߼������ؾ���Ĳ�Ʒ��ɫ��Client
    if (s.equalsIgnoreCase("Benz"))
      return new Benz();
    else if (s.equalsIgnoreCase("Bmw"))
      return new Bmw();
    else if (s.equalsIgnoreCase("Audi"))
      return new Audi();
    else
      throw new Exception("Lawless car");
  }

}
