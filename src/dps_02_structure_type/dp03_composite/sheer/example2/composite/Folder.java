package dps_02_structure_type.dp03_composite.sheer.example2.composite;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;

/**
 * 树干:文件夹,文件夹下面有子文件夹,文件,相当于Composite.<br>
 * @author Administrator
 */
public class Folder extends AbsFile {

  /**所有的孩子*/
  private List<AbsFile> children;

  /**
   * 构造函数<br>
   * @param name
   */
  public Folder(String name) {
    super(name);
    this.children = new ArrayList<AbsFile>();
  }

  /**
   * 增加一个孩子<br>
   * @param file
   * @return boolean
   */
  public boolean addChild(AbsFile file) {
    return children.add(file);
  }

  /**
   * 删除一个孩子<br>
   * @param file
   * @return boolean
   */
  public boolean removeChild(AbsFile file) {
    return children.remove(file);
  }

  /**
   * 获取所有的孩子<br>
   * @return List<IFile>
   */
  public List<AbsFile> getChildren() {
    return children;
  }

}
