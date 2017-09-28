package dps_02_structure_type.dp05_facade.example1.facade;

import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem1;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem2;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem3;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem4;

/**
 * �����ɫ<br>
 * @author Administrator
 */
public class Facade {

  /**��ϵͳ1*/
  private Subsystem1 s1;
  /**��ϵͳ2*/
  private Subsystem2 s2;
  /**��ϵͳ3*/
  private Subsystem3 s3;
  /**��ϵͳ4*/
  private Subsystem4 s4;

  /**
   * ���캯��
   */
  public Facade() {
    s1 = new Subsystem1();
    s2 = new Subsystem2();
    s3 = new Subsystem3();
    s4 = new Subsystem4();
  }

  /**
   * ������A
   */
  public void methodA() {
    System.out.println("������A():");
    s1.method1();
    s2.method2();
    s4.method4();
  }

  /**
   * ������B
   */
  public void methodB() {
    System.out.println("������B():");
    s2.method2();
    s3.method3();
  }

}
