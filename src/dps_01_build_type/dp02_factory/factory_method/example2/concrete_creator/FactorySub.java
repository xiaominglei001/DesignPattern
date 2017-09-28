package dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example2.concrete_product.OperationSub;
import dps_01_build_type.dp02_factory.factory_method.example2.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * ���幤����ɫ�������к;���ҵ���߼��йصĴ��롣��Ӧ�ó�������Դ�����Ӧ�ľ����Ʒ�Ķ���<br>
 * ��������<br>
 * @author Administrator
 */
public class FactorySub implements Factory {

  /**
   * ��������������<br>
   * @return Operation
   */
  public Operation createOperation() {
    return new OperationSub();
  }

}
