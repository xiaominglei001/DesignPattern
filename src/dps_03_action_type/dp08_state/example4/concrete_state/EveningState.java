package dps_03_action_type.dp08_state.example4.concrete_state;

import dps_03_action_type.dp08_state.example4.context.Work;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口<br>
 * 晚间工作状态<br>
 * @author Administrator
 */
public class EveningState implements State {

  /**
   * 写程序
   * @param work 
   */
  public void writeProgram(Work work) {
    if (work.isFinish()) {
      //如果完成任务则转入下班状态
      work.setState(new RestState());
      work.writeProgram();
    } else {
      if (work.getHour() < 21) {
        System.out.println("当前时间：" + work.getHour() + "点 加班哦，疲累之极。");
      } else {
        //超过21点则转入睡眠状态
        work.setState(new SleepingState());
        work.writeProgram();
      }
    }

  }

}
