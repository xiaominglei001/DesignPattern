package dps_03_action_type.dp08_state.example4.context;

import dps_03_action_type.dp08_state.example4.concrete_state.ForenoonState;
import dps_03_action_type.dp08_state.example4.state.State;

/**
 * 使用环境（Context）角色：客户程序是通过它来满足自己的需求。<br>
 * 工作<br>
 * @author Administrator
 */
public class Work {

  /**当前状态*/
  private State current;
  /**钟点属性,是否转换状态的依据*/
  private double hour;
  /**任务完成标志,是否下班的依据*/
  private boolean finish;

  /**
   * 构造函数
   */
  public Work() {
    //工作初始化为上午工作状态，即上午9点开始上班
    current = new ForenoonState();
  }

  /**
   * 设置当前状态<br>
   * @param state
   */
  public void setState(State state) {
    current = state;
  }

  /**
   * 写程序
   */
  public void writeProgram() {
    current.writeProgram(this);
  }

  /**
   * @return the finish
   */
  public boolean isFinish() {
    return finish;
  }

  /**
   * @param finish the finish to set
   */
  public void setFinish(boolean finish) {
    this.finish = finish;
  }

  /**
   * @return the hour
   */
  public double getHour() {
    return hour;
  }

  /**
   * @param hour the hour to set
   */
  public void setHour(double hour) {
    this.hour = hour;
  }

}
