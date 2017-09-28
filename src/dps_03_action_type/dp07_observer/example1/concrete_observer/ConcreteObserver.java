package dps_03_action_type.dp07_observer.example1.concrete_observer;

import dps_03_action_type.dp07_observer.example1.concrete_subject.ConcreteSubject;
import dps_03_action_type.dp07_observer.example1.observer.Observer;

/**
 * ����۲��߽�ɫ<br>
 * @author Administrator
 */
public class ConcreteObserver implements Observer {

  /**����*/
  private String name;
  /**�۲��ߵ�״̬*/
  private String observerState;
  /**֪ͨ�߽ӿ�*/
  private ConcreteSubject subject;

  /**
   * ���캯��<br>
   * @param subject 
   * @param name
   */
  public ConcreteObserver(ConcreteSubject subject, String name) {
    this.subject = subject;
    this.name = name;
  }

  /**
   * �ı��Լ�״̬�ķ���
   */
  public void update() {
    observerState = subject.getSubjectState();
    System.out.println("�۲���" + name + "����״̬��:" + observerState);
  }

}
