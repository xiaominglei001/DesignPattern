package dps_01_build_type.dp02_factory.factory_method.example2.concrete_product;

import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * �����Ʒ��ɫ�����幤����ɫ�������Ķ�����Ǵ˽�ɫ��ʵ����<br>
 * �ӷ�<br>
 * @author Administrator
 */
public class OperationAdd implements Operation {

  /**
   * ��ȡ����Ľ��<br>
   * @param a
   * @param b
   * @return double
   */
  public double getResult(double a, double b) {
    return a + b;
  }

}
