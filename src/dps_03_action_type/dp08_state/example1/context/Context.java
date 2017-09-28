package dps_03_action_type.dp08_state.example1.context;

import dps_03_action_type.dp08_state.example1.state.State;

/**
 * 使用环境（Context）角色：客户程序是通过它来满足自己的需求。<br>
 * @author Administrator
 */
public class Context {

  /**抽象状态（State）角色*/
  private State state;

  /**
   * 构造函数<br>
   * @param state 
   */
  public Context(State state) {
    this.state = state;
  }

  /**
   * @return the state
   */
  public State getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(State state) {
    this.state = state;
    System.out.println("当前状态:" + state.getClass().getSimpleName());
  }

  /**
   * 请求
   */
  public void request() {
    state.handle(this);
  }

}
