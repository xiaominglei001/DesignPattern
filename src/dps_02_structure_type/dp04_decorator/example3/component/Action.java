package dps_02_structure_type.dp04_decorator.example3.component;

/**
 * 抽象构件（Component）角色:给出一个抽象接口,以规范准备接收附加责任的对象<br>
 * 这里是电脑的动作<br>
 * @author Administrator
 */
public interface Action {

  /**
   * 开机
   */
  public void start();

  /**
   * 关机
   */
  public void shutdown();

}