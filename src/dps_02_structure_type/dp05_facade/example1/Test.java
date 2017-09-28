package dps_02_structure_type.dp05_facade.example1;

import dps_02_structure_type.dp05_facade.example1.facade.Facade;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //门面角色
    Facade facade = new Facade();

    facade.methodA();//方法组A 
    System.out.println();
    facade.methodB();//方法组B 
  }

}
