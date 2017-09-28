package dps_03_action_type.dp05_mediator.example3.concrete_mediator;

import dps_03_action_type.dp05_mediator.example3.colleague.Country;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.USA;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.Iraq;
import dps_03_action_type.dp05_mediator.example3.mediator.UnitedNations;

/**
 * �����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:ʵ���˳��������������¼�������<br>
 * �����ͣ��֪�����еľ���ͬ���࣬���Ӿ���ͬ�¶��������Ϣ�������ͬ�¶��󷢳����<br>
 * ���Ϲ���ȫ���»�<br>
 * @author Administrator
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

  /**����*/
  private USA colleague1;
  /**������*/
  private Iraq colleague2;

  /**
   * @param colleague1 the colleague1 to set
   */
  public void setColleague1(USA colleague1) {
    this.colleague1 = colleague1;
  }

  /**
   * @param colleague2 the colleague2 to set
   */
  public void setColleague2(Iraq colleague2) {
    this.colleague2 = colleague2;
  }

  /**
   * Э������:����<br>
   * @param message
   * @param colleague
   */
  public void declare(String message, Country colleague) {
    //�����ͬ��1��������Ϣ�͵���ͬ��2������,��֮��Ȼ
    if (colleague == colleague1) {
      colleague2.getMessage(message);
    } else {
      colleague1.getMessage(message);
    }
  }

}
