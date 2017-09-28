package dps_03_action_type.dp05_mediator.example2.concrete_colleague;

import dps_03_action_type.dp05_mediator.example2.colleague.Colleague;
import dps_03_action_type.dp05_mediator.example2.mediator.Mediator;

/**
 * 具体同事对象角色（ConcreteColleague）：从抽象同事类继承，实现自己的职责。<br>
 * 房客2<br>
 * @author Administrator
 */
public class Lodger2 extends Colleague {

  /**
   * 构造函数<br>
   * @param mediator
   */
  public Lodger2(Mediator mediator) {
    super(mediator);
  }

  /**
   * 房客具体的行为方法,发送信息<br>
   * @param message 
   */
  public void send(String message) {
    mediator.send(message, this);
  }

  /**
   * 房客具体的行为方法,得到信息<br>
   * @param message 
   */
  public void notify(String message) {
    System.out.println("房客2得到信息:" + message);
  }

}
