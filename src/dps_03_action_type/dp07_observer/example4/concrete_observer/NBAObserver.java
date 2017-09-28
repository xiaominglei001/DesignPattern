package dps_03_action_type.dp07_observer.example4.concrete_observer;

import dps_03_action_type.dp07_observer.example4.observer.Observer;
import dps_03_action_type.dp07_observer.example4.subject.Subject;

/**
 * ����۲��߽�ɫ:ϲ����NBA��Ա��<br>
 * @author Administrator
 */
public class NBAObserver implements Observer {

  /**����*/
  private String name;
  /**֪ͨ�߽ӿ�*/
  private Subject sub;

  /**
   * ���캯��<br>
   * @param name
   * @param sub
   */
  public NBAObserver(String name, Subject sub) {
    this.name = name;
    this.sub = sub;
  }

  /**
   * �ı��Լ�״̬�ķ���
   */
  public void update() {
    System.out.println(sub.getAction() + "," + name + " �ر�NBAֱ��,��������!");
  }

}
