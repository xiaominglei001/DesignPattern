package dps_02_structure_type.dp03_composite.sheer.example2.leaf;

import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;

/**
 * 叶子:树形结构的叶节点,Component的实现子类<br>
 * @author Administrator
 */
public class File extends AbsFile {

  /**
   * 构造函数<br>
   * @param name
   */
  public File(String name) {
    super(name);
  }

  /**
   * 实际上这个方法在File里面是没有意义的<br>
   * @param file 
   * @return boolean
   */
  public boolean addChild(@SuppressWarnings("unused")
  AbsFile file) {
    return false;
  }

  /**
   * 实际上这个方法在File里面是没有意义的<br>
   * @param file 
   * @return boolean
   */
  public boolean removeChild(@SuppressWarnings("unused")
  AbsFile file) {
    return false;
  }

  /**
   * 实际上这个方法在File里面是没有意义的<br>
   * @return List<IFile>
   */
  public List<AbsFile> getChildren() {
    return null;
  }

}
