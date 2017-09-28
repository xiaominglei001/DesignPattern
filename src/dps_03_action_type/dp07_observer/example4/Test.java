package dps_03_action_type.dp07_observer.example4;

import dps_03_action_type.dp07_observer.example4.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example4.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example4.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example4.observer.Observer;
import dps_03_action_type.dp07_observer.example4.subject.Subject;

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
    Subject subject = new Secretary();

    //����۲��߽�ɫ
    Observer observer1 = new NBAObserver("κ���", subject);//ϲ����NBA��Ա��
    Observer observer2 = new StockObserver("�׹ܲ�", subject);//ϲ�������������Ա��

    //��ӹ۲���   
    subject.add(observer1);
    subject.add(observer2);

    //֪ͨ���й۲���
    subject.notify_("�ϰ������");
  }

}
