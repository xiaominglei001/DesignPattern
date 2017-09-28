package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * 下午工作状态<br>
 * @author Administrator
 */
public class AfternoonState implements State {

  /**
   * 写程序
   * @param work 
   */
  public void writeProgram(Work work) {
    if (work.getHour() < 17) {
      System.out.println("当前时间：" + work.getHour() + "点 下午状态还不错，继续努力。");
    } else {
      //超过17点则转入晚间工作状态
      work.setState(new EveningState());
      work.writeProgram();
    }
  }

}
