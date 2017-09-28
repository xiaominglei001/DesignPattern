package dps_02_structure_type.dp03_composite.sheer.example2.component;

import java.util.List;

/**
 * ����:File��Folder�Ĺ�ͨ�ӿڽ���,�൱��Component.<br>
 * ���νṹ�Ľڵ����<br>
 * Ϊ���еĶ�����ͳһ�Ľӿڣ��������ԣ���Ϊ�ȵĶ��壩<br>
 * �ṩ�����ӽڵ����Ľӿڷ���<br>
 * [��ѡ]�ṩ�����ڵ����Ľӿڷ���<br>
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

  /**
   * ����һ������<br>
   * @param file
   * @return boolean
   */
  public abstract boolean addChild(AbsFile file);

  /**
   * ɾ��һ������<br>
   * @param file
   * @return boolean
   */
  public abstract boolean removeChild(AbsFile file);

  /**
   * ��ȡ���еĺ���<br>
   * @return List<IFile>
   */
  public abstract List<AbsFile> getChildren();

}