package dps_02_structure_type.dp05_facade.example3;

import dps_02_structure_type.dp05_facade.example3.facade.SecurityConsole;

/**
 * ������<br> 
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ɫ:ϵͳ����̨
    SecurityConsole console = SecurityConsole.getInstance();
    //����һ��
    console.Activate();
    System.out.println();
    //�ر�һ��
    console.Deactivate();
  }

}
