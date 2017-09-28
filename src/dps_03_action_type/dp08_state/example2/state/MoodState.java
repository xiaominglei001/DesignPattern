package dps_03_action_type.dp08_state.example2.state;

/**
 * 抽象状态（State）角色：定义一个接口以封装与使用环境角色的一个特定状态相关的行为。<br>
 * @author Administrator
 */
public interface MoodState {

  /**
   * 干活
   */
  public void doSomething();

  /**
   * 改变使用环境（Context）角色的状态
   */
  public void changeState();

}