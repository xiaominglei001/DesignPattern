package dps_03_action_type.dp02_command.example3.receiver;

/**
 * 接收者角色（Receiver）：知道如何实施与执行一个请求相关的操作。<br>
 * 烤羊肉串者<br>
 * @author Administrator
 */
public class Barbecuer {

  /**
   * 烤羊肉串
   */
  public void bakeMutton() {
    System.out.println("烤羊肉串.");
  }

  /**
   * 烤鸡翅
   */
  public void bakeChickenWing() {
    System.out.println("烤鸡翅.");
  }

}
