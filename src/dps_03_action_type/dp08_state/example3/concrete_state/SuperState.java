package dps_03_action_type.dp08_state.example3.concrete_state;

import dps_03_action_type.dp08_state.example3.context.Player;
import dps_03_action_type.dp08_state.example3.state.State;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * ����״̬<br>
 * @author Administrator
 */
public class SuperState implements State {

  /**ʹ�û�����Context����ɫ:��*/
  private Player p;

  /**
   * ���캯��
   * @param p
   */
  public SuperState(Player p) {
    this.p = p;
  }

  /**
   * Ͷ��
   */
  public void shot() {
    System.out.println("����״̬Ͷ��:10��10...");
  }

  /**
   * �ı�ʹ�û�����Context����ɫ��״̬
   */
  public void changeState() {
    p.setState(new UnnormalState(p));
  }

}
