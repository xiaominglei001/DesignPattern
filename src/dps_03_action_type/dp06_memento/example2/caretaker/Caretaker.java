package dps_03_action_type.dp06_memento.example2.caretaker;

import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp06_memento.example2.memento.Memento;

/**
 * 备忘录管理者（Caretaker）角色：负责保存好备忘录。不能对备忘录的内容进行操作或检查。<br>
 * @author Administrator
 */
public class Caretaker {

  /**备忘录集合*/
  private static final Map<String, Memento> history = new HashMap<String, Memento>();

  /**
   * 获取一个以前备份过的状态<br>
   * @param versionId 
   * @return Memento
   */
  public Memento getMemento(String versionId) {
    return history.get(versionId);
  }

  /**
   * 备份一个状态<br>
   * @param m
   */
  public void addMemento(Memento m) {
    history.put(m.getVersionId(), m);
    System.out.println("将发起人对象[" + m.getVersionId() + "]的状态保存起来了！");
  }

}
