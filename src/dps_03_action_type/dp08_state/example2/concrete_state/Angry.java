package dps_03_action_type.dp08_state.example2.concrete_state;

import dps_03_action_type.dp08_state.example2.context.Person;
import dps_03_action_type.dp08_state.example2.state.MoodState;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * ����<br>
 * @author Administrator
 */
public class Angry implements MoodState {

  /**ʹ�û�����Context����ɫ:��*/
  private Person p;

  /**
   * ���캯��
   * @param p
   */
  public Angry(Person p) {
    this.p = p;
  }

  /**
   * �ɻ�
   */
  public void doSomething() {
    System.out.println("I'm angry,do it later!");
  }

  /**
   * �ı�ʹ�û�����Context����ɫ��״̬
   */
  public void changeState() {
    p.setState(new Happy(p));
  }

}
