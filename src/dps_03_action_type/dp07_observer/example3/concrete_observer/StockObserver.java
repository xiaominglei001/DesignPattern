package dps_03_action_type.dp07_observer.example3.concrete_observer;

import dps_03_action_type.dp07_observer.example3.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example3.observer.Observer;

/**
 * ����۲��߽�ɫ:ϲ�������������Ա��<br>
 * @author Administrator
 */
public class StockObserver implements Observer {

  /**����*/
  private String name;
  /**ǰ̨*/
  private Secretary sub;

  /**
   * ���캯��<br>
   * @param name
   * @param sub
   */
  public StockObserver(String name, Secretary sub) {
    this.name = name;
    this.sub = sub;
  }

  /**
   * �ı��Լ�״̬�ķ���
   */
  public void update() {
    System.out.println(sub.getAction() + "," + name + " �رչ�Ʊ����,��������!");
  }

}
