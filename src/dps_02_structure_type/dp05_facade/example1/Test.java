package dps_02_structure_type.dp05_facade.example1;

import dps_02_structure_type.dp05_facade.example1.facade.Facade;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ɫ
    Facade facade = new Facade();

    facade.methodA();//������A 
    System.out.println();
    facade.methodB();//������B 
  }

}
