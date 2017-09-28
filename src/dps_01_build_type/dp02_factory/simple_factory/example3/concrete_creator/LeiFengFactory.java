package dps_01_build_type.dp02_factory.simple_factory.example3.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_product.Undergraduate;
import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_product.Volunteer;
import dps_01_build_type.dp02_factory.simple_factory.example3.product.LeiFeng;

/**
 * ���幤�����ɫ�����Ǳ�ģʽ�ĺ��ģ�����һ������ҵ�߼����ж��߼���<br>
 * �򵥹���ģʽ��û�г��󹤳���ɫ<br>
 * ����ѧ�׷�xx�Ĺ���<br>
 * @author Administrator
 */
public class LeiFengFactory {

  /**
   * ����ѧ�׷��־Ը��<br>
   * @param type 
   * @return LeiFeng
   * @throws Exception 
   */
  public static LeiFeng createLeiFeng(int type) throws Exception {
    //����(1:ѧ�� 2:־Ը��)
    switch (type) {
    case 1:
      return new Undergraduate();//����ѧ�׷��ѧ��
    case 2:
      return new Volunteer();//����ѧ�׷��־Ը��
    default:
      throw new Exception("��֧�ֵ��׷�����.");
    }
  }

}