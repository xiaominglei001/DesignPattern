package dps_03_action_type.dp08_state.example2.context;

import dps_03_action_type.dp08_state.example2.concrete_state.Mad;
import dps_03_action_type.dp08_state.example2.state.MoodState;

/**
 * ʹ�û�����Context����ɫ���ͻ�������ͨ�����������Լ�������<br>
 * ��<br>
 * @author Administrator
 */
public class Person {

  /**����״̬��State����ɫ*/
  private MoodState state;

  /**
   * ���캯��
   */
  public Person() {
    state = new Mad(this);
  }

  /**
   * �����˵�״̬<br>
   * @param state
   */
  public void setState(MoodState state) {
    this.state = state;
  }

  /**
   * �ɻ�<br>
   * ����״̬��ɫ��doSomething,Ȼ���ٸı���״̬<br>
   */
  public void doSomething() {
    state.doSomething();
    state.changeState();
  }

}
