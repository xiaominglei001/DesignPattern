package dps_02_structure_type.dp03_composite.safe.example3.leaf;

import util.StringUtil;
import dps_02_structure_type.dp03_composite.safe.example3.component.Company;

/**
 * Ҷ��:������<br>
 * @author Administrator
 */
public class FinanceDept extends Company {

  /**
   * ���캯��<br>
   * @param name
   */
  public FinanceDept(String name) {
    super(name);
  }

  /**
   * ��ӡ���������Ϣ,�������Ϊ����,����Ƕ��پʹ�ӡ������'-'<br>
   * @param depth
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
  }

  /**
   * ����ְ��
   */
  public void lineOfDuty() {
    System.out.println(name + " ��˾������֧����");
  }

}
