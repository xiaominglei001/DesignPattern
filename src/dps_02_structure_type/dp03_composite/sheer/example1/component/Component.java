package dps_02_structure_type.dp03_composite.sheer.example1.component;

/**
 * 抽象(Component)树形结构的节点抽象<br>
 * 为所有的对象定义统一的接口（公共属性，行为等的定义）<br>
 * 提供管理子节点对象的接口方法<br>
 * [可选]提供管理父节点对象的接口方法<br>
 * @author Administrator
 */
public abstract class Component {

  /**节点名字*/
  protected String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public Component(String name) {
    this.name = name;
  }

  /**
   * 增加一个孩子<br>
   * @param c 
   */
  public abstract void add(Component c);

  /**
   * 删除一个孩子<br>
   * @param c 
   */
  public abstract void remove(Component c);

  /**
   * 打印出节点信息
   * @param depth 
   */
  public abstract void display(int depth);

}