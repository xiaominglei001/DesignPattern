package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * ����״̬��Concrete State����ɫ��ʵ��״̬��ɫ����Ľӿ�<br>
 * ��乤��״̬<br>
 * @author Administrator
 */
public class EveningState implements State {

  /**
   * д����
   * @param work 
   */
  public void writeProgram(Work work) {
    if (work.isFinish()) {
      //������������ת���°�״̬
      work.setState(new RestState());
      work.writeProgram();
    } else {
      if (work.getHour() < 21) {
        System.out.println("��ǰʱ�䣺" + work.getHour() + "�� �Ӱ�Ŷ��ƣ��֮����");
      } else {
        //����21����ת��˯��״̬
        work.setState(new SleepingState());
        work.writeProgram();
      }
    }

  }

}
