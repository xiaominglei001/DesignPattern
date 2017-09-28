package dps_02_structure_type.dp03_composite.sheer.example2.composite;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;

/**
 * ����:�ļ���,�ļ������������ļ���,�ļ�,�൱��Composite.<br>
 * @author Administrator
 */
public class Folder extends AbsFile {

  /**���еĺ���*/
  private List<AbsFile> children;

  /**
   * ���캯��<br>
   * @param name
   */
  public Folder(String name) {
    super(name);
    this.children = new ArrayList<AbsFile>();
  }

  /**
   * ����һ������<br>
   * @param file
   * @return boolean
   */
  public boolean addChild(AbsFile file) {
    return children.add(file);
  }

  /**
   * ɾ��һ������<br>
   * @param file
   * @return boolean
   */
  public boolean removeChild(AbsFile file) {
    return children.remove(file);
  }

  /**
   * ��ȡ���еĺ���<br>
   * @return List<IFile>
   */
  public List<AbsFile> getChildren() {
    return children;
  }

}
