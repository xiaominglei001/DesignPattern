package dps_02_structure_type.dp01_adapter.object.example3.target;

/**
 * Ŀ�꣨Target����ɫ:��Ա<br>
 * ���ǿͻ����ڴ��Ľӿ�,Ŀ������Ǿ���Ļ�������,Ҳ�����ǽӿ�.<br>
 * @author Administrator
 */
public abstract class Player {

  /**����*/
  protected String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public Player(String name) {
    this.name = name;
  }

  /**
   * ����
   */
  public abstract void attack();

  /**
   * ����
   */
  public abstract void defense();

}
