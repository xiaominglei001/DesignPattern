package dps_02_structure_type.dp03_composite.safe.example2.component;

/**
 * ����:File��Folder�Ĺ�ͨ�ӿڽ���,�൱��Component.<br>
 * ���νṹ�Ľڵ����<br>
 * Ϊ���еĶ�����ͳһ�Ľӿڣ��������ԣ���Ϊ�ȵĶ��壩<br>
 * @author Administrator
 */
public abstract class AbsFile {

  /**�ļ����ļ�����*/
  private String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public AbsFile(String name) {
    this.name = name;
  }

  /**
   * ��ӡ���ļ��������ļ���
   */
  public void printName() {
    System.out.println(name);
  }

}