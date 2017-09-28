package dps_02_structure_type.dp05_facade.example3.subsystem;

/**
 * 子系统角色:报警器<br>
 * @author Administrator
 */
public class Alarm {

  /**
   * 开启报警器
   */
  public void activate() {
    System.out.println("Activating the alarm.");
  }

  /**
   * 关闭报警器
   */
  public void deactivate() {
    System.out.println("Deactivating the alarm.");
  }

  /**
   * 正在发出警报
   */
  public void ring() {
    System.out.println("Ringing the alarm.");
  }

  /**
   * 停止警报
   */
  public void stopRing() {
    System.out.println("Stop the alarm.");
  }

}
