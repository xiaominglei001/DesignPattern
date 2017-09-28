package dps_03_action_type.dp08_state.example2.concrete_state;

import dps_03_action_type.dp08_state.example2.context.Person;
import dps_03_action_type.dp08_state.example2.state.MoodState;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * ����<br>
 * @author Administrator
 */
public class Happy implements MoodState {

  /**ʹ�û�����Context����ɫ:��*/
  private Person p;

  /**
   * ���캯��
   * @param p
   */
  public Happy(Person p) {
    this.p = p;
  }

  /**
   * �ɻ�
   */
  public void doSomething() {
    System.out.println("I'm happy,just do it!");
  }

  /**
   * �ı�ʹ�û�����Context����ɫ��״̬
   */
  public void changeState() {
    p.setState(new Mad(p));
  }

}
