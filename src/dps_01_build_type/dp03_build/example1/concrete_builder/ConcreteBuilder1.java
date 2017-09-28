package dps_01_build_type.dp03_build.example1.concrete_builder;

import dps_01_build_type.dp03_build.example1.builder.Builder;
import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * ���彨���߽�ɫ:<br>
 * ���������ɫ������Ӧ�ó��������ص��࣬������ָ���ߵĵ����´�����Ʒʵ����<br>
 * �����ɫ��ʵ�ֳ������߽�ɫ�ṩ�ķ�����ǰ���£��ﵽ��ɲ�Ʒ��װ���ṩ��Ʒ�Ĺ��ܡ�<br>
 * @author Administrator
 */
public class ConcreteBuilder1 implements Builder {

  /**��Ʒ��ɫ*/
  private Product product = new Product();

  /**
   * ���첿��A
   */
  public void buildPartA() {
    product.add("����A");
  }

  /**
   * ���첿��B
   */
  public void buildPartB() {
    product.add("����B");
  }

  /**
   * ���ش����Ĳ�Ʒ<br>
   * @return Person
   */
  public Product getResult() {
    return product;
  }

}
