package dps_02_structure_type.dp06_flyweight.example3;

/**
 * ��������Ԫģʽ�Ľ�ɫ,�����װ�û���Ϣ<br>
 * @author Administrator
 */
public class User {

  /**����*/
  private String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public User(String name) {
    super();
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

}