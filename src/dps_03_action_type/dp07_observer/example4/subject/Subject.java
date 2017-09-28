package dps_03_action_type.dp07_observer.example4.subject;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp07_observer.example4.observer.Observer;

/**
 * �������⣨��ɹ۲��ߣ���ɫ<br>
 * ����֪ͨ�߽ӿ�<br>
 * @author Administrator
 */
public abstract class Subject {

  /**���й۲���*/
  private List<Observer> observers = new ArrayList<Observer>();
  /**�ɹ۲��ߵĶ���*/
  private String action;

  /**
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * @param action the action to set
   */
  public void setAction(String action) {
    this.action = action;
  }

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
  public void notify_(String action) {
    setAction(action);
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
