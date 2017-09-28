package dps_02_structure_type.dp03_composite.safe.example2.leaf;

import dps_02_structure_type.dp03_composite.safe.example2.component.AbsFile;

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

}
