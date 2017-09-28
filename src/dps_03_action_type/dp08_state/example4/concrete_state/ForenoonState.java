package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * ���繤��״̬<br>
 * @author Administrator
 */
public class ForenoonState implements State {

  /**
   * д����
   * @param work 
   */
  public void writeProgram(Work work) {
    if (work.getHour() < 12) {
      System.out.println("��ǰʱ�䣺" + work.getHour() + "�� ���繤��������ٱ���");
    } else {
      //����12����ת�����繤��״̬
      work.setState(new NoonState());
      work.writeProgram();
    }
  }

}
