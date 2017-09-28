package dps_02_structure_type.dp05_facade.example1.facade;

import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem1;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem2;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem3;
import dps_02_structure_type.dp05_facade.example1.subsystem.Subsystem4;

/**
 * 门面角色<br>
 * @author Administrator
 */
public class Facade {

  /**子系统1*/
  private Subsystem1 s1;
  /**子系统2*/
  private Subsystem2 s2;
  /**子系统3*/
  private Subsystem3 s3;
  /**子系统4*/
  private Subsystem4 s4;

  /**
   * 构造函数
   */
  public Facade() {
    s1 = new Subsystem1();
    s2 = new Subsystem2();
    s3 = new Subsystem3();
    s4 = new Subsystem4();
  }

  /**
   * 方法组A
   */
  public void methodA() {
    System.out.println("方法组A():");
    s1.method1();
    s2.method2();
    s4.method4();
  }

  /**
   * 方法组B
   */
  public void methodB() {
    System.out.println("方法组B():");
    s2.method2();
    s3.method3();
  }

}
