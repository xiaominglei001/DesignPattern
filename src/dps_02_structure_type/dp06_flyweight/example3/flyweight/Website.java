package dps_02_structure_type.dp06_flyweight.example3.flyweight;

import dps_02_structure_type.dp06_flyweight.example3.User;

/**
 * ������Ԫ(Flyweight)��ɫ:�˽�ɫ�����еľ�����Ԫ��Ļ���,Ϊ��Щ��涨����Ҫʵ�ֵĹ����ӿ�<br>
 * ��������վ<br>
 * @author Administrator
 */
public interface Website {

  /**
   * ʹ�÷���,��Ҫ�����û�����user<br>
   * @param user 
   */
  public void use(User user);

}