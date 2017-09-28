package dps_03_action_type.dp06_memento.example1.caretaker;

import dps_03_action_type.dp06_memento.example1.memento.Memento;

/**
 * 备忘录管理者（Caretaker）角色：负责保存好备忘录。不能对备忘录的内容进行操作或检查。<br>
 * @author Administrator
 */
public class Caretaker {

  /**备忘录*/
  private Memento saveMemento;

  /**
   * @return the saveMemento
   */
  public Memento getSaveMemento() {
    return saveMemento;
  }

  /**
   * @param saveMemento the saveMemento to set
   */
  public void setSaveMemento(Memento saveMemento) {
    this.saveMemento = saveMemento;
    System.out.println("将发起人对象的状态保存起来了！");
  }

}
