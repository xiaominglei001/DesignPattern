package dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product;

import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

/**
 * �����Ʒ��ɫ��������ɫ�������Ķ�����Ǵ˽�ɫ��ʵ����<br>
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
