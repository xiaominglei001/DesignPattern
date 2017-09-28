package dps_03_action_type.dp08_state.example4.state;

import dps_03_action_type.dp08_state.example4.context.Work;

/**
 * 抽象状态（State）角色：定义一个接口以封装与使用环境角色的一个特定状态相关的行为。<br>
 * @author Administrator
 */
public interface State {

  /**
   * 干活
   * @param work 
   */
  public void writeProgram(Work work);

}