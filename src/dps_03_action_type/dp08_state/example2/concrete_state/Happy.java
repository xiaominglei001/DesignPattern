package dps_03_action_type.dp08_state.example2.concrete_state;

import dps_03_action_type.dp08_state.example2.context.Person;
import dps_03_action_type.dp08_state.example2.state.MoodState;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * 高兴<br>
 * @author Administrator
 */
public class Happy implements MoodState {

  /**使用环境（Context）角色:人*/
  private Person p;

  /**
   * 构造函数
   * @param p
   */
  public Happy(Person p) {
    this.p = p;
  }

  /**
   * 干活
   */
  public void doSomething() {
    System.out.println("I'm happy,just do it!");
  }

  /**
   * 改变使用环境（Context）角色的状态
   */
  public void changeState() {
    p.setState(new Mad(p));
  }

}
