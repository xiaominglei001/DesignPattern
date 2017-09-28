package dps_02_structure_type.dp03_composite.safe.example3.leaf;

import util.StringUtil;
import dps_02_structure_type.dp03_composite.safe.example3.component.Company;

/**
 * Ҷ��:������Դ����<br>
 * @author Administrator
 */
public class HRDept extends Company {

  /**
   * ���캯��<br>
   * @param name
   */
  public HRDept(String name) {
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
    System.out.println(name + " Ա����Ƹ��ѵ����");
  }

}
