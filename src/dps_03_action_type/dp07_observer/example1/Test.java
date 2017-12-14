package dps_03_action_type.dp07_observer.example1;

import dps_03_action_type.dp07_observer.example1.concrete_observer.ConcreteObserver;
import dps_03_action_type.dp07_observer.example1.concrete_subject.ConcreteSubject;

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
    ConcreteSubject subject = new ConcreteSubject();
    subject.add(new ConcreteObserver(subject,"X"));//添加三个观察者
    subject.add(new ConcreteObserver(subject,"Y"));
    subject.add(new ConcreteObserver(subject,"Z"));
    
    subject.setSubjectState("ABC");//改变被观察者的状态
    subject.notify_();//通知观察者
  }

}
