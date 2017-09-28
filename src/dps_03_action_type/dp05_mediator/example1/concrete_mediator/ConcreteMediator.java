package dps_03_action_type.dp05_mediator.example1.concrete_mediator;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague1;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague2;
import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * �����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:ʵ���˳��������������¼�������<br>
 * �����ͣ��֪�����еľ���ͬ���࣬���Ӿ���ͬ�¶��������Ϣ�������ͬ�¶��󷢳����<br>
 * @author Administrator
 */
public class ConcreteMediator extends Mediator {

  /**ͬ��1*/
  private ConcreteColleague1 colleague1;
  /**ͬ��2*/
  private ConcreteColleague2 colleague2;

  /**
   * @param colleague1 the colleague1 to set
   */
  public void setColleague1(ConcreteColleague1 colleague1) {
    this.colleague1 = colleague1;
  }

  /**
   * @param colleague2 the colleague2 to set
   */
  public void setColleague2(ConcreteColleague2 colleague2) {
    this.colleague2 = colleague2;
  }

  /**
   * Э������:������Ϣ<br>
   * @param message
   * @param colleague
   */
  public void send(String message, Colleague colleague) {
    //�����ͬ��1��������Ϣ�͵���ͬ��2������,��֮��Ȼ
    if (colleague == colleague1) {
      colleague2.notify(message);
    } else {
      colleague1.notify(message);
    }
  }

}
