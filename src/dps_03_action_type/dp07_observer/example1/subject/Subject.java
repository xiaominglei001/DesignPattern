package dps_03_action_type.dp07_observer.example1.subject;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp07_observer.example1.observer.Observer;

/**
 * �������⣨��ɹ۲��ߣ���ɫ<br>
 * ����֪ͨ�߽ӿ�<br>
 * @author Administrator
 */
public abstract class Subject {

  /**���й۲���*/
  private List<Observer> observers = new ArrayList<Observer>();

  /**
   * ���һ���۲���<br>
   * @param observer
   */
  public void add(Observer observer) {
    observers.add(observer);
  }

  /**
   * ɾ��һ���۲���<br>
   * @param observer
   */
  public void remove(Observer observer) {
    observers.remove(observer);
  }

  /**
   * ֪ͨ���й۲���<br>
   * @param action
   */
  public void notify_() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
