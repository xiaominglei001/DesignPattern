package dps_01_build_type.dp02_factory.factory_method.example2.creator;

import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * ���󹤳���ɫ�� ���ǹ�������ģʽ�ĺ��ģ�����Ӧ�ó����޹ء��Ǿ��幤����ɫ����ʵ�ֵĽӿڻ��߱���̳еĸ��ࡣ<br>
 * �������������ʵ��<br>
 * @author Administrator
 */
public interface Factory {

  /**
   * ����������<br>
   * @return Operation
   */
  public Operation createOperation();

}
