package dps_02_structure_type.dp03_composite.safe.example1.component;

/**
 * ����(Component)���νṹ�Ľڵ����<br>
 * Ϊ���еĶ�����ͳһ�Ľӿڣ��������ԣ���Ϊ�ȵĶ��壩<br>
 * �ṩ�����ӽڵ����Ľӿڷ���<br>
 * [��ѡ]�ṩ�����ڵ����Ľӿڷ���<br>
 * @author Administrator
 */
public abstract class Component {

  /**�ڵ�����*/
  protected String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public Component(String name) {
    this.name = name;
  }

  /**
   * ��ӡ���ڵ���Ϣ
   * @param depth 
   */
  public abstract void display(int depth);

}