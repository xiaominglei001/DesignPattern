package dps_03_action_type.dp05_mediator.example1.concrete_colleague;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * ����ͬ�¶����ɫ��ConcreteColleague�����ӳ���ͬ����̳У�ʵ���Լ���ְ��<br>
 * ͬ��1<br>
 * @author Administrator
 */
public class ConcreteColleague1 extends Colleague {

  /**
   * ���캯��<br>
   * @param mediator
   */
  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  /**
   * ������Ϣ<br>
   * @param message 
   */
  public void send(String message) {
    //ͨ�����н��߷��ͳ�ȥ��
    mediator.send(message, this);
  }

  /**
   * ��ȡ��Ϣ<br>
   * @param message
   */
  public void notify(String message) {
    System.out.println("ͬ��1�õ���Ϣ:" + message);
  }

}
