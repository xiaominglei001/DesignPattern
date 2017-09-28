package dps_03_action_type.dp05_mediator.example3.concrete_colleague;

import dps_03_action_type.dp05_mediator.example3.colleague.Country;
import dps_03_action_type.dp05_mediator.example3.mediator.UnitedNations;

/**
 * 具体同事对象角色（ConcreteColleague）：从抽象同事类继承，实现自己的职责。<br>
 * 美国<br>
 * @author Administrator
 */
public class USA extends Country {

  /**
   * 构造函数<br>
   * @param mediator
   */
  public USA(UnitedNations mediator) {
    super(mediator);
  }

  /**
   * 声明<br>
   * @param message 
   */
  public void declare(String message) {
    //通常是中介者发送出去的
    mediator.declare(message, this);
  }

  /**
   * 获得信息<br>
   * @param message
   */
  public void getMessage(String message) {
    System.out.println("美国获得对方信息:" + message);
  }

}
