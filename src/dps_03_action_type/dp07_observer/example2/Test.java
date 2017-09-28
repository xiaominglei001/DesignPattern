package dps_03_action_type.dp07_observer.example2;

import dps_03_action_type.dp07_observer.example2.concrete_observer.Reader;
import dps_03_action_type.dp07_observer.example2.concrete_subject.NewsDispatcher;

/**
 * 测试类<br>
 * 这里抽象观察者角色和抽象主题(或可观察者)角色直接使用Java提供的类实现，所以源代码中并没有这两个角色<br>
 * 抽象主题(或可观察者Subject)角色:java.util.Observable<br>
 * 抽象观察者(Observer)角色:java.util.Observer<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体主题（或可观察者）角色:体育新闻派发器   
    NewsDispatcher sportNewsDispatcher = new NewsDispatcher();
    //具体主题（或可观察者）角色:it新闻派发器   
    NewsDispatcher itNewsDispatcher = new NewsDispatcher();

    //具体观察者角色r1,r2,r3   
    Reader r1 = new Reader("观察者1");
    Reader r2 = new Reader("观察者2");
    Reader r3 = new Reader("观察者3");

    //添加观察者   
    sportNewsDispatcher.addObserver(r1);
    sportNewsDispatcher.addObserver(r2);
    itNewsDispatcher.addObserver(r3);

    //当有新的新闻的时候，通知观察者   
    sportNewsDispatcher.addNews("中国队突破了历史获得了世界杯冠军!");
    itNewsDispatcher.addNews("甲骨文收购Sun，java开始收费!");
  }

}
