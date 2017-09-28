package dps_03_action_type.dp05_mediator.example3.concrete_mediator;

import dps_03_action_type.dp05_mediator.example3.colleague.Country;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.USA;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.Iraq;
import dps_03_action_type.dp05_mediator.example3.mediator.UnitedNations;

/**
 * 具体调停者也称中介者（ConcreteMediator）角色:实现了抽象超类所声明的事件方法。<br>
 * 具体调停者知晓所有的具体同事类，它从具体同事对象接收消息，向具体同事对象发出命令。<br>
 * 联合国安全理事会<br>
 * @author Administrator
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

  /**美国*/
  private USA colleague1;
  /**伊拉克*/
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
   * 协调工作:声明<br>
   * @param message
   * @param colleague
   */
  public void declare(String message, Country colleague) {
    //如果是同事1发出的信息就调用同事2来接收,反之亦然
    if (colleague == colleague1) {
      colleague2.getMessage(message);
    } else {
      colleague1.getMessage(message);
    }
  }

}
