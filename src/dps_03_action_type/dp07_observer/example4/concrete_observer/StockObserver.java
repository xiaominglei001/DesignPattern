package dps_03_action_type.dp07_observer.example4.concrete_observer;

import dps_03_action_type.dp07_observer.example4.observer.Observer;
import dps_03_action_type.dp07_observer.example4.subject.Subject;

/**
 * 具体观察者角色:喜欢看股市行情的员工<br>
 * @author Administrator
 */
public class StockObserver implements Observer {

  /**名字*/
  private String name;
  /**通知者接口*/
  private Subject sub;

  /**
   * 构造函数<br>
   * @param name
   * @param sub
   */
  public StockObserver(String name, Subject sub) {
    this.name = name;
    this.sub = sub;
  }

  /**
   * 改变自己状态的方法
   */
  public void update() {
    System.out.println(sub.getAction() + "," + name + " 关闭股票行情,继续工作!");
  }

}
