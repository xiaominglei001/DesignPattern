package dps_01_build_type.dp02_factory.factory_method.example3.creator;

import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * ���󹤳���ɫ�� ���ǹ�������ģʽ�ĺ��ģ�����Ӧ�ó����޹ء��Ǿ��幤����ɫ����ʵ�ֵĽӿڻ��߱���̳еĸ��ࡣ<br>
 * ���������׷�ĳ��󷽷�<br>
 * @author Administrator
 *
 */
public interface Factory {

  /**
   * �����׷�<br>
   * @return LeiFeng
   */
  public LeiFeng createLeiFeng();

}
