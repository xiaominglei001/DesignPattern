package dps_03_action_type.dp05_mediator.example1.concrete_colleague;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * 具体同事对象角色（ConcreteColleague）：从抽象同事类继承，实现自己的职责。<br>
 * 同事1<br>
 * @author Administrator
 */
public class ConcreteColleague1 extends Colleague {

  /**
   * 构造函数<br>
   * @param mediator
   */
  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  /**
   * 发送信息<br>
   * @param message 
   */
  public void send(String message) {
    //通常是中介者发送出去的
    mediator.send(message, this);
  }

  /**
   * 获取信息<br>
   * @param message
   */
  public void notify(String message) {
    System.out.println("同事1得到信息:" + message);
  }

}
