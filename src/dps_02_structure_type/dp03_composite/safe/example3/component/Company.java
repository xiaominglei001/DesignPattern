package dps_02_structure_type.dp03_composite.safe.example3.component;

/**
 * ����:���νṹ�Ľڵ����<br>
 * Ϊ���еĶ�����ͳһ�Ľӿڣ��������ԣ���Ϊ�ȵĶ��壩<br>
 * �ṩ�����ӽڵ����Ľӿڷ���<br>
 * [��ѡ]�ṩ�����ڵ����Ľӿڷ���<br>
 * @author Administrator
 */
public abstract class Company {

  /**����*/
  protected String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public Company(String name) {
    this.name = name;
  }

  /**
   * ��ӡ���������Ϣ<br>
   * @param depth
   */
  public abstract void display(int depth);

  /**
   * ����ְ��
   */
  public abstract void lineOfDuty();

}