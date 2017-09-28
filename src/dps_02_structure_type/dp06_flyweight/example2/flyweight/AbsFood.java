package dps_02_structure_type.dp06_flyweight.example2.flyweight;

/**
 * ������Ԫ(Flyweight)��ɫ:�˽�ɫ�����еľ�����Ԫ��Ļ���,Ϊ��Щ��涨����Ҫʵ�ֵĹ����ӿ�<br>
 * ������ʳ��<br>
 * @author Administrator
 */
public abstract class AbsFood {

  /**����*/
  protected String name;

  /**
   * @param name
   */
  public AbsFood(String name) {
    this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * �����ӿ�,Ҫ������ʵ��
   */
  public abstract void display();

}