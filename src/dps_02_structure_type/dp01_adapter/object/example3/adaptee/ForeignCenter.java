package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

/***
 * Դ��Adaptee����ɫ:��Ҫ�������<br>
 * �⼮�з�<br>
 * @author Administrator
 */
public class ForeignCenter {

  /**����:�����Զ����ù��캯����������ǰ������Ա��Ĳ�ͬ*/
  private String name;

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
   * ����
   */
  public void ����() {
    System.out.println("�⼮�з� " + name + " ����");
  }

  /**
   * ����
   */
  public void ����() {
    System.out.println("�⼮�з� " + name + " ����");
  }

}
