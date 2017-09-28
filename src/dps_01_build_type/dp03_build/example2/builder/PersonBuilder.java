package dps_01_build_type.dp03_build.example2.builder;

import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * �������߽�ɫ:�����ɫ�����淶��Ʒ����ĸ�����ɳɷֵĽ��졣<br>
 * һ����ԣ��˽�ɫ������Ӧ�ó������ҵ�߼���<br>
 * �˵Ĵ�����<br>
 * @author Administrator
 */
public interface PersonBuilder {

  /**
   * ��ͷ
   */
  public void buildHead();

  /**
   * ������
   */
  public void buildBody();

  /**
   * ������
   */
  public void buildArmLeft();

  /**
   * ������
   */
  public void buildArmRight();

  /**
   * ������
   */
  public void buildLegLeft();

  /**
   * ������
   */
  public void buildLegRight();

  /**
   * ���ش�������<br>
   * @return Person
   */
  public Person createPerson();

}
