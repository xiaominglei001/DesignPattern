package dps_02_structure_type.dp06_flyweight.example1.flyweight;

/**
 * ������Ԫ(Flyweight)��ɫ:�˽�ɫ�����еľ�����Ԫ��Ļ���,Ϊ��Щ��涨����Ҫʵ�ֵĹ����ӿ�<br>
 * @author Administrator
 */
public interface Flyweight {

  /**
   * �����ӿ�,Ҫ������ʵ��<br>
   * @param extrinsicstate �ⲿ״̬
   */
  public void operation(int extrinsicstate);

}