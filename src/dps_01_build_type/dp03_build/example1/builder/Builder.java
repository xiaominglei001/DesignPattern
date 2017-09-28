package dps_01_build_type.dp03_build.example1.builder;

import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * �������߽�ɫ:�����ɫ�����淶��Ʒ����ĸ�����ɳɷֵĽ��졣<br>
 * һ����ԣ��˽�ɫ������Ӧ�ó������ҵ�߼���<br>
 * @author Administrator
 */
public interface Builder {

  /**
   * ���첿��A
   */
  public void buildPartA();

  /**
   * ���첿��B
   */
  public void buildPartB();

  /**
   * ���ش����Ĳ�Ʒ<br>
   * @return Person
   */
  public Product getResult();

}
