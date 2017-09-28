package dps_03_action_type.dp08_state.example1.concrete_state;

import dps_03_action_type.dp08_state.example1.context.Context;
import dps_03_action_type.dp08_state.example1.state.State;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * @author Administrator
 */
public class ConcreteStateB implements State {

  /**
   * ����״̬<br>
   * @param context
   */
  public void handle(Context context) {
    context.setState(new ConcreteStateA());
  }

}
