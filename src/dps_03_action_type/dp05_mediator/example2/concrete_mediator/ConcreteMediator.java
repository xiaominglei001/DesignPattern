package dps_03_action_type.dp05_mediator.example2.concrete_mediator;

import dps_03_action_type.dp05_mediator.example2.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord2;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger2;
import dps_03_action_type.dp05_mediator.example2.mediator.Mediator;

/**
 * �����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:ʵ���˳��������������¼�������<br>
 * �����ͣ��֪�����еľ���ͬ���࣬���Ӿ���ͬ�¶��������Ϣ�������ͬ�¶��󷢳����<br>
 * @author Administrator
 */
public class ConcreteMediator extends Mediator {

  /**����1*/
  private Landlord1 landlord1;
  /**����2*/
  private Landlord2 landlord2;

  /**����2*/
  private Lodger1 lodger1;
  /**����2*/
  private Lodger2 lodger2;

  /**
   * @param landlord1 the landlord1 to set
   */
  public void setLandlord1(Landlord1 landlord1) {
    this.landlord1 = landlord1;
  }

  /**
   * @param landlord2 the landlord2 to set
   */
  public void setLandlord2(Landlord2 landlord2) {
    this.landlord2 = landlord2;
  }

  /**
   * @param lodger1 the lodger1 to set
   */
  public void setLodger1(Lodger1 lodger1) {
    this.lodger1 = lodger1;
  }

  /**
   * @param lodger2 the lodger2 to set
   */
  public void setLodger2(Lodger2 lodger2) {
    this.lodger2 = lodger2;
  }

  /**
   * �Ѹ���ͬ�½�����֯,Э��<br>
   * @param message 
   * @param colleague
   */
  public void send(String message, Colleague colleague) {
    //����Ƿ�����������Ϣ�������з���������,��֮��Ȼ
    if (colleague == landlord1 || colleague == landlord2) {
      lodger1.notify(message);
      lodger2.notify(message);
    } else {
      landlord1.notify(message);
      landlord2.notify(message);
    }
  }

}
