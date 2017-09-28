package dps_03_action_type.dp07_observer.example1;

import dps_03_action_type.dp07_observer.example1.concrete_observer.ConcreteObserver;
import dps_03_action_type.dp07_observer.example1.concrete_subject.ConcreteSubject;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���⣨��ɹ۲��ߣ���ɫ:ǰ̨
    ConcreteSubject subject = new ConcreteSubject();
    subject.add(new ConcreteObserver(subject,"X"));
    subject.add(new ConcreteObserver(subject,"Y"));
    subject.add(new ConcreteObserver(subject,"Z"));
    
    subject.setSubjectState("ABC");
    subject.notify_();
  }

}
