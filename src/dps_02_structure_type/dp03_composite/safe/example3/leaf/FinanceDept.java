package dps_02_structure_type.dp03_composite.safe.example3.leaf;

import util.StringUtil;
import dps_02_structure_type.dp03_composite.safe.example3.component.Company;

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
