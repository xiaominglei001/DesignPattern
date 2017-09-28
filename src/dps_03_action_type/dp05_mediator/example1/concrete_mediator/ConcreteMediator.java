package dps_03_action_type.dp05_mediator.example1.concrete_mediator;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague1;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague2;
import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * 具体调停者也称中介者（ConcreteMediator）角色:实现了抽象超类所声明的事件方法。<br>
 * 具体调停者知晓所有的具体同事类，它从具体同事对象接收消息，向具体同事对象发出命令。<br>
 * @author Administrator
 */
public class ConcreteMediator extends Mediator {

  /**同事1*/
  private ConcreteColleague1 colleague1;
  /**同事2*/
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
   * 协调工作:发送消息<br>
   * @param message
   * @param colleague
   */
  public void send(String message, Colleague colleague) {
    //如果是同事1发出的信息就调用同事2来接收,反之亦然
    if (colleague == colleague1) {
      colleague2.notify(message);
    } else {
      colleague1.notify(message);
    }
  }

}
