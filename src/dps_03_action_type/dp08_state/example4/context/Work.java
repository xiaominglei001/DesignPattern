package dps_03_action_type.dp08_state.example4.context;

import dps_03_action_type.dp08_state.example4.concrete_state.ForenoonState;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * ʹ�û�����Context����ɫ���ͻ�������ͨ�����������Լ�������<br>
 * ����<br>
 * @author Administrator
 */
public class Work {

  /**��ǰ״̬*/
  private State current;
  /**�ӵ�����,�Ƿ�ת��״̬������*/
  private double hour;
  /**������ɱ�־,�Ƿ��°������*/
  private boolean finish;

  /**
   * ���캯��
   */
  public Work() {
    //������ʼ��Ϊ���繤��״̬��������9�㿪ʼ�ϰ�
    current = new ForenoonState();
  }

  /**
   * ���õ�ǰ״̬<br>
   * @param state
   */
  public void setState(State state) {
    current = state;
  }

  /**
   * д����
   */
  public void writeProgram() {
    current.writeProgram(this);
  }

  /**
   * @return the finish
   */
  public boolean isFinish() {
    return finish;
  }

  /**
   * @param finish the finish to set
   */
  public void setFinish(boolean finish) {
    this.finish = finish;
  }

  /**
   * @return the hour
   */
  public double getHour() {
    return hour;
  }

  /**
   * @param hour the hour to set
   */
  public void setHour(double hour) {
    this.hour = hour;
  }

}
