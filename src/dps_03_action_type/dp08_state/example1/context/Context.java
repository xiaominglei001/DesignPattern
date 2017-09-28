package dps_03_action_type.dp08_state.example1.context;

import dps_03_action_type.dp08_state.example1.state.State;

/**
 * ʹ�û�����Context����ɫ���ͻ�������ͨ�����������Լ�������<br>
 * @author Administrator
 */
public class Context {

  /**����״̬��State����ɫ*/
  private State state;

  /**
   * ���캯��<br>
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
    System.out.println("��ǰ״̬:" + state.getClass().getSimpleName());
  }

  /**
   * ����
   */
  public void request() {
    state.handle(this);
  }

}
