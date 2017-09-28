package dps_03_action_type.dp06_memento.example1.originator;

import dps_03_action_type.dp06_memento.example1.memento.Memento;

/**
 * ��������Originator����ɫ�������������ɫ������һ������¼��<br>
 * ���Լ�¼��ǰʱ�������ڲ�״̬������Ҫʱʹ�ñ���¼�ָ��ڲ�״̬��<br>
 * @author Administrator
 */
public class Originator {

  /**
   * ״̬,��������������ֵ
   */
  private String state;

  /**
   * ���캯��,��ʼ��һ��״̬<br>
   * @param state
   */
  public Originator(String state) {
    this.state = state;
  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * ��������¼<br>
   * @return Memento
   */
  public Memento createMemento() {
    return new Memento(state);
  }

  /**
   * ���ݱ���¼��ɻָ�<br>
   * @param memento
   */
  public void restoreMemento(Memento memento) {
    state = memento.getState();
    System.out.println("�ָ������˵�״̬��");
  }

}
