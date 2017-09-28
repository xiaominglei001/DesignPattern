package dps_02_structure_type.dp03_composite.safe.example3.composite;

import java.util.ArrayList;
import java.util.List;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example3.component.Company;

/**
 * 树干:公司<br>
 * @author Administrator
 */
public class ConcreteCompany extends Company {

  /**所有的孩子*/
  private List<Company> children;

  /**
   * 构造函数<br>
   * @param name
   */
  public ConcreteCompany(String name) {
    super(name);
    this.children = new ArrayList<Company>();
  }

  /**
   * 增加一个孩子<br>
   * @param c
   */
  public void add(Company c) {
    children.add(c);
  }

  /**
   * 删除一个孩子<br>
   * @param c
   */
  public void remove(Company c) {
    children.remove(c);
  }

  /**
   * 打印出自身的信息,用深度做为参数,深度是多少就打印出几个'-'<br>
   * @param depth
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
    for (Company c : children) {
      c.display(depth + 2);
    }
  }

  /**
   * 履行职责
   */
  public void lineOfDuty() {
    for (Company c : children) {
      c.lineOfDuty();
    }
  }

}
