package dps_02_structure_type.dp03_composite.sheer.example3.leaf;

import util.StringUtil;
import dps_02_structure_type.dp03_composite.sheer.example3.component.Company;

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
   * ����һ������<br>
   * @param c
   */
  @SuppressWarnings("unused")
  public void add(Company c) {
    //Ҷ�ӽڵ���û�к��ӵ�,��������Ϊ��
  }

  /**
   * ɾ��һ������<br>
   * @param c
   */
  @SuppressWarnings("unused")
  public void remove(Company c) {
    //Ҷ�ӽڵ���û�к��ӵ�,��������Ϊ��
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
