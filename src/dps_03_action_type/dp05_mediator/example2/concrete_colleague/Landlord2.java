package dps_03_action_type.dp05_mediator.example2.concrete_colleague;

import dps_03_action_type.dp05_mediator.example2.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example2.mediator.Mediator;

/**
 * ����ͬ�¶����ɫ��ConcreteColleague�����ӳ���ͬ����̳У�ʵ���Լ���ְ��<br>
 * ����2<br>
 * @author Administrator
 */
public class Landlord2 extends Colleague {

  /**
   * ���캯��<br>
   * @param mediator
   */
  public Landlord2(Mediator mediator) {
    super(mediator);
  }

  /**
   * �����������Ϊ����,������Ϣ<br>
   * @param message 
   */
  public void send(String message) {
    mediator.send(message, this);
  }

  /**
   * �����������Ϊ����,�õ���Ϣ<br>
   * @param message 
   */
  public void notify(String message) {
    System.out.println("����2�õ���Ϣ:" + message);
  }

}
