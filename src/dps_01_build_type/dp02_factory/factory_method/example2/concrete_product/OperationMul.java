package dps_01_build_type.dp02_factory.factory_method.example2.concrete_product;

import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * �����Ʒ��ɫ�����幤����ɫ�������Ķ�����Ǵ˽�ɫ��ʵ����<br>
 * �˷�<br>
 * @author Administrator
 */
public class OperationMul implements Operation {

  /**
   * ��ȡ����Ľ��<br>
   * @param a
   * @param b
   * @return double
   */
  public double getResult(double a, double b) {
    return a * b;
  }

}
