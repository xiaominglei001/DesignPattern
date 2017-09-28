package dps_03_action_type.dp08_state.example2.context;

import dps_03_action_type.dp08_state.example2.concrete_state.Mad;
import dps_03_action_type.dp08_state.example2.state.MoodState;

/**
 * 使用环境（Context）角色：客户程序是通过它来满足自己的需求。<br>
 * 人<br>
 * @author Administrator
 */
public class Person {

  /**抽象状态（State）角色*/
  private MoodState state;

  /**
   * 构造函数
   */
  public Person() {
    state = new Mad(this);
  }

  /**
   * 设置人的状态<br>
   * @param state
   */
  public void setState(MoodState state) {
    this.state = state;
  }

  /**
   * 干活<br>
   * 调用状态角色的doSomething,然后再改变其状态<br>
   */
  public void doSomething() {
    state.doSomething();
    state.changeState();
  }

}
