package dps_03_action_type.dp05_mediator.example1.colleague;

import dps_03_action_type.dp05_mediator.example1.mediator.Mediator;

/**
 * 抽象同事类（Colleague）角色:定义出调停者到同事对象的接口。<br>
 * 同事对象只知道调停者而不知道其余的同事对象。<br>
 * @author Administrator
 */
public abstract class Colleague {

  /**抽象调停者*/
  protected Mediator mediator;

  /**
   * 构造函数<br>
   * @param mediator 
   */
  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

}
