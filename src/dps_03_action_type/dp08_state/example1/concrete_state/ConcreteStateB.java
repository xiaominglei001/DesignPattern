package dps_03_action_type.dp08_state.example1.concrete_state;

import dps_03_action_type.dp08_state.example1.context.Context;
import dps_03_action_type.dp08_state.example1.state.State;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * @author Administrator
 */
public class ConcreteStateB implements State {

  /**
   * 处理状态<br>
   * @param context
   */
  public void handle(Context context) {
    context.setState(new ConcreteStateA());
  }

}
