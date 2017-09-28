package dps_03_action_type.dp06_memento.example2.originator;

import dps_03_action_type.dp06_memento.example2.memento.Memento;

/**
 * 备忘发起（Originator）角色：“备忘发起角色”创建一个备忘录，<br>
 * 用以记录当前时刻它的内部状态。在需要时使用备忘录恢复内部状态。<br>
 * @author Administrator
 */
public class Originator {

  /**状态属性,力量*/
  private String force;

  /**状态属性,敏捷度*/
  private String quick;

  /**
   * 构造函数,初始化一个状态<br>
   * @param force
   * @param quick
   */
  public Originator(String force, String quick) {
    this.force = force;
    this.quick = quick;
  }

  /**
   * @return the force
   */
  public String getForce() {
    return force;
  }

  /**
   * @param force the force to set
   */
  public void setForce(String force) {
    this.force = force;
  }

  /**
   * @return the quick
   */
  public String getQuick() {
    return quick;
  }

  /**
   * @param quick the quick to set
   */
  public void setQuick(String quick) {
    this.quick = quick;
  }

  /**
   * 创建备忘录<br>
   * @param versionId 
   * @return Memento
   */
  public Memento createMemento(String versionId) {
    return new Memento(versionId, force, quick);
  }

  /**
   * 根据备忘录完成恢复<br>
   * @param memento
   */
  public void restoreMemento(Memento memento) {
    force = memento.getForce();
    quick = memento.getQuick();
    System.out.println("恢复发起人[" + memento.getVersionId() + "]的状态！");
  }

}
