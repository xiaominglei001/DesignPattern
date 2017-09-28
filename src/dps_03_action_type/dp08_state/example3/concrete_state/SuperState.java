package dps_03_action_type.dp08_state.example3.concrete_state;

import dps_03_action_type.dp08_state.example3.context.Player;
import dps_03_action_type.dp08_state.example3.state.State;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * 超常状态<br>
 * @author Administrator
 */
public class SuperState implements State {

  /**使用环境（Context）角色:人*/
  private Player p;

  /**
   * 构造函数
   * @param p
   */
  public SuperState(Player p) {
    this.p = p;
  }

  /**
   * 投篮
   */
  public void shot() {
    System.out.println("超常状态投篮:10中10...");
  }

  /**
   * 改变使用环境（Context）角色的状态
   */
  public void changeState() {
    p.setState(new UnnormalState(p));
  }

}
