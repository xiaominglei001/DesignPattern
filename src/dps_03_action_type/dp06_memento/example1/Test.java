package dps_03_action_type.dp06_memento.example1;

import dps_03_action_type.dp06_memento.example1.caretaker.Caretaker;
import dps_03_action_type.dp06_memento.example1.originator.Originator;

/**
 * 测试类<br>
 * 单一状态备份<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //备忘发起（Originator）角色:
    Originator o = new Originator("A");//初始化
    System.out.println("初始化后:" + o.getState());

    //创建备忘录对象，并将发起人对象的状态保存起来(备份)
    Caretaker c = new Caretaker();//备忘录管理者角色
    c.setSaveMemento(o.createMemento());

    //改变发起人对象的状态为B(改变)
    o.setState("B");
    System.out.println("\n改变后:" + o.getState() + "\n");

    //恢复发起人的状态(恢复)
    o.restoreMemento(c.getSaveMemento());
    System.out.println("恢复后:" + o.getState());
  }

}
