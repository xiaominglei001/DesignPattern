package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * �°���Ϣ״̬<br>
 * @author Administrator
 */
public class RestState implements State {

  /**
   * д����
   * @param work 
   */
  public void writeProgram(Work work) {
    System.out.println("��ǰʱ�䣺" + work.getHour() + "�� �°�ؼ��ˡ�");
  }

}
