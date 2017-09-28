package dps_03_action_type.dp07_observer.example2.concrete_observer;

import java.util.Observable;
import java.util.Observer;

//Observer�ļ򵥹��ܽ��� 
//update(Observable o, Object arg) ObserverΨһ�ķ������ڱ�֪ͨʱ��Observable���� 
/**
 * ����۲��߽�ɫ:����,�Ķ�����<br>
 * @author Administrator
 */
public class Reader implements Observer {

  /**�۲��ߵ�����*/
  private String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public Reader(String name) {
    this.name = name;
  }

  /**
   * �۲��߸�������״̬<br>
   * @param o 
   * @param arg 
   */
  public void update(@SuppressWarnings("unused")
  Observable o, Object arg) {
    String news = (String) arg;
    System.out.println(name + " : " + news);
  }

}
