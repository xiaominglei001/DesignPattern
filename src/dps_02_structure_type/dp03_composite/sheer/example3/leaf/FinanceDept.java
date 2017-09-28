package dps_02_structure_type.dp03_composite.sheer.example3.leaf;

import util.StringUtil;
import dps_02_structure_type.dp03_composite.sheer.example3.component.Company;

/**
 * 叶子:财务部门<br>
 * @author Administrator
 */
public class FinanceDept extends Company {

  /**
   * 构造函数<br>
   * @param name
   */
  public FinanceDept(String name) {
    super(name);
  }

  /**
   * 增加一个孩子<br>
   * @param c
   */
  @SuppressWarnings("unused")
  public void add(Company c) {
    //叶子节点是没有孩子的,所以这里为空
  }

  /**
   * 删除一个孩子<br>
   * @param c
   */
  @SuppressWarnings("unused")
  public void remove(Company c) {
    //叶子节点是没有孩子的,所以这里为空
  }

  /**
   * 打印出自身的信息,用深度做为参数,深度是多少就打印出几个'-'<br>
   * @param depth
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
  }

  /**
   * 履行职责
   */
  public void lineOfDuty() {
    System.out.println(name + " 公司财务收支管理");
  }

}
