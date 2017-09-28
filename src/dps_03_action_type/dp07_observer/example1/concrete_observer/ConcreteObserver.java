package dps_03_action_type.dp07_observer.example1.concrete_observer;

import dps_03_action_type.dp07_observer.example1.concrete_subject.ConcreteSubject;
import dps_03_action_type.dp07_observer.example1.observer.Observer;

/**
 * 具体观察者角色<br>
 * @author Administrator
 */
public class ConcreteObserver implements Observer {

  /**名字*/
  private String name;
  /**观察者的状态*/
  private String observerState;
  /**通知者接口*/
  private ConcreteSubject subject;

  /**
   * 构造函数<br>
   * @param subject 
   * @param name
   */
  public ConcreteObserver(ConcreteSubject subject, String name) {
    this.subject = subject;
    this.name = name;
  }

  /**
   * 改变自己状态的方法
   */
  public void update() {
    observerState = subject.getSubjectState();
    System.out.println("观察者" + name + "的新状态是:" + observerState);
  }

}
