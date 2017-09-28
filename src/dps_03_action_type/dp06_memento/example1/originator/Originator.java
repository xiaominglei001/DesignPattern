package dps_03_action_type.dp06_memento.example1.originator;

import dps_03_action_type.dp06_memento.example1.memento.Memento;

/**
 * 备忘发起（Originator）角色：“备忘发起角色”创建一个备忘录，<br>
 * 用以记录当前时刻它的内部状态。在需要时使用备忘录恢复内部状态。<br>
 * @author Administrator
 */
public class Originator {

  /**
   * 状态,可以是任意属性值
   */
  private String state;

  /**
   * 构造函数,初始化一个状态<br>
   * @param state
   */
  public Originator(String state) {
    this.state = state;
  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * 创建备忘录<br>
   * @return Memento
   */
  public Memento createMemento() {
    return new Memento(state);
  }

  /**
   * 根据备忘录完成恢复<br>
   * @param memento
   */
  public void restoreMemento(Memento memento) {
    state = memento.getState();
    System.out.println("恢复发起人的状态！");
  }

}
