package dps_02_structure_type.dp05_facade.example3;

import dps_02_structure_type.dp05_facade.example3.facade.SecurityConsole;

/**
 * 测试类<br> 
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //门面角色:系统控制台
    SecurityConsole console = SecurityConsole.getInstance();
    //开启一切
    console.Activate();
    System.out.println();
    //关闭一切
    console.Deactivate();
  }

}
