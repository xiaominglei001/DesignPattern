package dps_02_structure_type.dp03_composite.sheer.example2.component;

import java.util.List;

/**
 * 抽象:File与Folder的共通接口界面,相当于Component.<br>
 * 树形结构的节点抽象<br>
 * 为所有的对象定义统一的接口（公共属性，行为等的定义）<br>
 * 提供管理子节点对象的接口方法<br>
 * [可选]提供管理父节点对象的接口方法<br>
 * @author Administrator
 */
public abstract class AbsFile {

  /**文件名文件夹名*/
  private String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public AbsFile(String name) {
    this.name = name;
  }

  /**
   * 打印出文件夹名或文件名
   */
  public void printName() {
    System.out.println(name);
  }

  /**
   * 增加一个孩子<br>
   * @param file
   * @return boolean
   */
  public abstract boolean addChild(AbsFile file);

  /**
   * 删除一个孩子<br>
   * @param file
   * @return boolean
   */
  public abstract boolean removeChild(AbsFile file);

  /**
   * 获取所有的孩子<br>
   * @return List<IFile>
   */
  public abstract List<AbsFile> getChildren();

}