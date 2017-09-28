package dps_03_action_type.dp08_state.example3.context;

import dps_03_action_type.dp08_state.example3.concrete_state.UnnormalState;
import dps_03_action_type.dp08_state.example3.state.State;

/**
 * ʹ�û�����Context����ɫ���ͻ�������ͨ�����������Լ�������<br>
 * ��<br>
 * @author Administrator
 */
public class Player {

  /**����״̬��State����ɫ*/
  private State state;

  /**
   * ���캯��
   */
  public Player() {
    state = new UnnormalState(this);
  }

  /**
   * �����˵�״̬<br>
   * @param state
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Ͷ��<br>
   * ����״̬��ɫ��shot,Ȼ���ٸı���״̬<br>
   */
  public void shot() {
    state.shot();
    state.changeState();
  }

}
