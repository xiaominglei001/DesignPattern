package dps_03_action_type.dp08_state.example1.state;

import dps_03_action_type.dp08_state.example1.context.Context;

/**
 * 抽象状态（State）角色：定义一个接口以封装与使用环境角色的一个特定状态相关的行为。<br>
 * @author Administrator
 */
public interface State {

  /**
   * 干活<br>
   * @param context 
   */
  public void handle(Context context);

}