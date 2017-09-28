package dps_02_structure_type.dp03_composite.safe.example3.component;

/**
 * 抽象:树形结构的节点抽象<br>
 * 为所有的对象定义统一的接口（公共属性，行为等的定义）<br>
 * 提供管理子节点对象的接口方法<br>
 * [可选]提供管理父节点对象的接口方法<br>
 * @author Administrator
 */
public abstract class Company {

  /**名字*/
  protected String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public Company(String name) {
    this.name = name;
  }

  /**
   * 打印出自身的信息<br>
   * @param depth
   */
  public abstract void display(int depth);

  /**
   * 履行职责
   */
  public abstract void lineOfDuty();

}