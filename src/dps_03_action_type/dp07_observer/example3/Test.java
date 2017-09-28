package dps_03_action_type.dp07_observer.example3;

import dps_03_action_type.dp07_observer.example3.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example3.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example3.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example3.observer.Observer;

/**
 * ������<br>
 * ����ʡ���˳�������(��ɹ۲���Subject)��ɫ<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�������⣨��ɹ۲��ߣ���ɫ:
    Secretary secretary = new Secretary();

    //����۲��߽�ɫ:
    Observer observer1 = new NBAObserver("κ���", secretary);//ϲ����NBA��Ա��
    Observer observer2 = new StockObserver("�׹ܲ�", secretary);//ϲ�������������Ա��

    //��ӹ۲���   
    secretary.add(observer1);
    secretary.add(observer2);

    //֪ͨ���й۲���
    secretary.notify_("�ϰ������");
  }

}
