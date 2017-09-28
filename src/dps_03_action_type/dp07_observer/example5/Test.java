package dps_03_action_type.dp07_observer.example5;

import dps_03_action_type.dp07_observer.example5.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example5.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example5.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example5.subject.Subject;

/**
 * ������<br>
 * ��ʵ��Ӧ����,�۲��߿����Ǳ����Ѿ�д�õ���,�޷�������иı�,����˵����ʵ��ͨ�ýӿ�Observer,
 * Ҳ����˵����û�г���۲��߽�ɫ,������ȻҪ֪ͨ�۲���,������ͨ���ӿڵ���update��,
 * C#����ί��������������,������Secretary���÷���������
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   * @throws NoSuchMethodException 
   * @throws SecurityException 
   */
  public static void main(String[] args) throws Exception {
    //�������⣨��ɹ۲��ߣ���ɫ:ǰ̨
    Subject subject = new Secretary();

    //����۲��߽�ɫ
    Object observer1 = new NBAObserver();//ϲ����NBA��Ա��
    Object observer2 = new StockObserver();//ϲ�������������Ա��

    //��ί�е���󶨸�������,�������˼��,������subject.notify_֪ͨ���ʱ,
    //ϣ�������ɫͨ������observer1.updateNBAObserver
    //��observer2.updateStock������֪ͨ,�����������ಢû��ʵ��ͳһ�ӿ�,����Ҫ�÷�������
    subject.bind(observer1, observer1.getClass().getMethod("updateNBAObserver",
        String.class));
    subject.bind(observer2, observer2.getClass().getMethod("updateStock",
        String.class));

    //֪ͨ���
    subject.notify_("�ϰ������");
  }

}
