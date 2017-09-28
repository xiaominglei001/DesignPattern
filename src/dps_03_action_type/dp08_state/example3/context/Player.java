package dps_03_action_type.dp08_state.example3.context;

import dps_03_action_type.dp08_state.example3.concrete_state.UnnormalState;
import dps_03_action_type.dp08_state.example3.state.State;

/**
 * 使用环境（Context）角色：客户程序是通过它来满足自己的需求。<br>
 * 人<br>
 * @author Administrator
 */
public class Player {

  /**抽象状态（State）角色*/
  private State state;

  /**
   * 构造函数
   */
  public Player() {
    state = new UnnormalState(this);
  }

  /**
   * 设置人的状态<br>
   * @param state
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * 投篮<br>
   * 调用状态角色的shot,然后再改变其状态<br>
   */
  public void shot() {
    state.shot();
    state.changeState();
  }

}
