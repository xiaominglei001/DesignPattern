package dps_03_action_type.dp05_mediator.example1.concrete_colleague;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * ����ͬ�¶����ɫ��ConcreteColleague�����ӳ���ͬ����̳У�ʵ���Լ���ְ��<br> 
 * ͬ��2<br>
 * @author Administrator
 */
public class ConcreteColleague2 extends Colleague {

  /**
   * ���캯��<br>
   * @param mediator
   */
  public ConcreteColleague2(Mediator mediator) {
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
    System.out.println("ͬ��2�õ���Ϣ:" + message);
  }

}
