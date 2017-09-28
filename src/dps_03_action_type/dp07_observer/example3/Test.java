package dps_03_action_type.dp07_observer.example3;

import dps_03_action_type.dp07_observer.example3.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example3.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example3.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example3.observer.Observer;

/**
 * 测试类<br>
 * 这里省略了抽象主题(或可观察者Subject)角色<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体主题（或可观察者）角色:
    Secretary secretary = new Secretary();

    //抽象观察者角色:
    Observer observer1 = new NBAObserver("魏关姹", secretary);//喜欢看NBA的员工
    Observer observer2 = new StockObserver("易管查", secretary);//喜欢看股市行情的员工

    //添加观察者   
    secretary.add(observer1);
    secretary.add(observer2);

    //通知所有观察者
    secretary.notify_("老板回来了");
  }

}
