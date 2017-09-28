package dps_02_structure_type.dp05_facade.example3.facade;

import dps_02_structure_type.dp05_facade.example3.subsystem.Alarm;
import dps_02_structure_type.dp05_facade.example3.subsystem.Camera;
import dps_02_structure_type.dp05_facade.example3.subsystem.Light;

/**
 * 门面角色:一个系统的控制台,作为保安系统的用户界面.<br>
 * 注意:在门面模式中,通常只需要一个门面类,并且此门面类只有一个实例,换言之它是一个单例类.<br>
 * 这里我们用单例模式(懒汉式)来创建门面的实例,供客户端调用<br>
 * @author Administrator
 */
public class SecurityConsole {

  /**照相机*/
  private static Camera camera1, camera2;
  /**电灯*/
  private static Light light1, light2, light3;
  /**报警器*/
  private static Alarm alarm;
  /**控制台*/
  private static SecurityConsole intsance;

  /**
   * 私有构造函数,避免从外部创建实例
   */
  private SecurityConsole() {
  }

  /**
   * @return SecurityConsole
   */
  public synchronized static SecurityConsole getInstance() {
    if (intsance == null) {
      intsance = new SecurityConsole();
    }
    return intsance;
  }

  /**
   * 静态块做初始化工作(在创建实例之前做,而且只做一次)
   */
  static {
    camera1 = new Camera();
    camera2 = new Camera();
    light1 = new Light();
    light2 = new Light();
    light3 = new Light();
    alarm = new Alarm();
  }

  /**
   * 控制台的一个按纽:开启一切
   */
  public void Activate() {
    camera1.turnOn();
    camera2.turnOn();
    light1.turnOn();
    light2.turnOn();
    light3.turnOn();
    alarm.activate();
  }

  /**
   * 控制台的一个按纽:关闭一切
   */
  public void Deactivate() {
    camera1.turnOff();
    camera2.turnOff();
    light1.turnOff();
    light2.turnOff();
    light3.turnOff();
    alarm.deactivate();
  }

}
