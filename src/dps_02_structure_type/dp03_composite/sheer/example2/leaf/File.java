package dps_02_structure_type.dp03_composite.sheer.example2.leaf;

import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;

/**
 * Ҷ��:���νṹ��Ҷ�ڵ�,Component��ʵ������<br>
 * @author Administrator
 */
public class File extends AbsFile {

  /**
   * ���캯��<br>
   * @param name
   */
  public File(String name) {
    super(name);
  }

  /**
   * ʵ�������������File������û�������<br>
   * @param file 
   * @return boolean
   */
  public boolean addChild(@SuppressWarnings("unused")
  AbsFile file) {
    return false;
  }

  /**
   * ʵ�������������File������û�������<br>
   * @param file 
   * @return boolean
   */
  public boolean removeChild(@SuppressWarnings("unused")
  AbsFile file) {
    return false;
  }

  /**
   * ʵ�������������File������û�������<br>
   * @return List<IFile>
   */
  public List<AbsFile> getChildren() {
    return null;
  }

}
