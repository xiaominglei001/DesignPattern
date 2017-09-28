package dps_03_action_type.dp05_mediator.example1.mediator;

import dps_03_action_type.dp05_mediator.example1.colleague.Colleague;

/**
 * 抽象调停者也称中介者（Mediator）角色：定义出同事对象到调停者对象的接口，<br>
 * 其中主要的方法是一个（或多个）事件方法。在某些情况下，这个抽象对象可以省略。<br>
 * @author Administrator
 */
public abstract class Mediator {

  /**
   * 定义一个的发送消息方法，得到同事的对象和发送信息<br>
   * @param message 
   * @param colleague
   */
  public abstract void send(String message, Colleague colleague);

}
