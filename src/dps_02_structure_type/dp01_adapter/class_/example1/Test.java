package dps_02_structure_type.dp01_adapter.class_.example1;

import dps_02_structure_type.dp01_adapter.class_.example1.adapter.Adapter;
import dps_02_structure_type.dp01_adapter.class_.example1.target.Target;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Ŀ�꣨Target����ɫ:����
    Target target = new Adapter();
    target.request();//��������
  }

}
