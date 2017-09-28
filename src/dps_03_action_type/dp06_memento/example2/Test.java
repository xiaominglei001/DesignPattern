package dps_03_action_type.dp06_memento.example2;

import util.ClassUtil;
import dps_03_action_type.dp06_memento.example2.caretaker.Caretaker;
import dps_03_action_type.dp06_memento.example2.originator.Originator;

/**
 * 测试类<br>
 * 多状态备份<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //备忘发起（Originator）角色:
    Originator o = new Originator("900", "350");//初始化
    System.out.println("初始化后:");
    ClassUtil.display(o);

    //创建备忘录对象，并将发起人对象的状态保存起来(备份第1次)
    Caretaker c = new Caretaker();//备忘录管理者角色
    String versionId1 = "001";//版本号1
    c.addMemento(o.createMemento(versionId1));//备份

    //改变发起人对象的状态(改变第1次)
    o.setForce("119");
    o.setQuick("119");
    System.out.println("\n第1次改变后:");
    ClassUtil.display(o);

    //创建备忘录对象，并将发起人对象的状态保存起来(备份第2次)
    String versionId2 = "002";//版本号2
    c.addMemento(o.createMemento(versionId2));//备份

    //改变发起人对象的状态(改变第2次)
    o.setForce("0");
    o.setQuick("0");
    System.out.println("\n第2次改变后:");
    ClassUtil.display(o);

    //恢复发起人的状态(恢复到版本001)
    o.restoreMemento(c.getMemento(versionId1));
    System.out.println("\n恢复到001版本:");
    ClassUtil.display(o);

    //恢复发起人的状态(恢复到版本002)
    o.restoreMemento(c.getMemento(versionId2));
    System.out.println("\n恢复到002版本:");
    ClassUtil.display(o);
  }

}
