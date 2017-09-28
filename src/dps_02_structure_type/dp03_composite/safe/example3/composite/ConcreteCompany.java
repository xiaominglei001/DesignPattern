package dps_02_structure_type.dp03_composite.safe.example3.composite;

import java.util.ArrayList;
import java.util.List;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example3.component.Company;

/**
 * ����:��˾<br>
 * @author Administrator
 */
public class ConcreteCompany extends Company {

  /**���еĺ���*/
  private List<Company> children;

  /**
   * ���캯��<br>
   * @param name
   */
  public ConcreteCompany(String name) {
    super(name);
    this.children = new ArrayList<Company>();
  }

  /**
   * ����һ������<br>
   * @param c
   */
  public void add(Company c) {
    children.add(c);
  }

  /**
   * ɾ��һ������<br>
   * @param c
   */
  public void remove(Company c) {
    children.remove(c);
  }

  /**
   * ��ӡ���������Ϣ,�������Ϊ����,����Ƕ��پʹ�ӡ������'-'<br>
   * @param depth
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
    for (Company c : children) {
      c.display(depth + 2);
    }
  }

  /**
   * ����ְ��
   */
  public void lineOfDuty() {
    for (Company c : children) {
      c.lineOfDuty();
    }
  }

}
