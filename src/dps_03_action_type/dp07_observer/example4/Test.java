package dps_03_action_type.dp07_observer.example4;

import dps_03_action_type.dp07_observer.example4.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example4.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example4.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example4.observer.Observer;
import dps_03_action_type.dp07_observer.example4.subject.Subject;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //主题（或可观察者）角色:前台
    Subject subject = new Secretary();

    //抽象观察者角色
    Observer observer1 = new NBAObserver("魏关姹", subject);//喜欢看NBA的员工
    Observer observer2 = new StockObserver("易管查", subject);//喜欢看股市行情的员工

    //添加观察者   
    subject.add(observer1);
    subject.add(observer2);

    //通知所有观察者
    subject.notify_("老板回来了");
  }

}
