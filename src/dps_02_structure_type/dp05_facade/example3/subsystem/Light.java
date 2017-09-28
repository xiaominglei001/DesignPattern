package dps_02_structure_type.dp05_facade.example3.subsystem;

/**
 * 子系统角色:电灯<br>
 * @author Administrator
 */
public class Light {

  /**
   * 开灯
   */
  public void turnOn() {
    System.out.println("Turning on the light.");
  }

  /**
   * 关灯
   */
  public void turnOff() {
    System.out.println("Turning off the light.");
  }

  /**
   * 换灯泡
   */
  public void changeBulb() {
    System.out.println("Changing the light-bulb.");
  }

}
