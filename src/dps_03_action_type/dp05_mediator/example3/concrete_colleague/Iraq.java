package dps_03_action_type.dp05_mediator.example3.concrete_colleague;

import dps_03_action_type.dp05_mediator.example3.colleague.Country;
import dps_03_action_type.dp05_mediator.example3.mediator.UnitedNations;

/**
 * ����ͬ�¶����ɫ��ConcreteColleague�����ӳ���ͬ����̳У�ʵ���Լ���ְ��<br>
 * ������<br>
 * @author Administrator
 */
public class Iraq extends Country {

  /**
   * ���캯��<br>
   * @param mediator
   */
  public Iraq(UnitedNations mediator) {
    super(mediator);
  }

  /**
   * ����<br>
   * @param message 
   */
  public void declare(String message) {
    //ͨ�����н��߷��ͳ�ȥ��
    mediator.declare(message, this);
  }

  /**
   * �����Ϣ<br>
   * @param message
   */
  public void getMessage(String message) {
    System.out.println("�����˻�öԷ���Ϣ:" + message);
  }

}
