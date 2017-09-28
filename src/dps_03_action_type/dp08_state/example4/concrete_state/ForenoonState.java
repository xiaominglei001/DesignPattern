package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * 上午工作状态<br>
 * @author Administrator
 */
public class ForenoonState implements State {

  /**
   * 写程序
   * @param work 
   */
  public void writeProgram(Work work) {
    if (work.getHour() < 12) {
      System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍。");
    } else {
      //超过12点则转入中午工作状态
      work.setState(new NoonState());
      work.writeProgram();
    }
  }

}
