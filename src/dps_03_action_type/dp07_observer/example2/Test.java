package dps_03_action_type.dp07_observer.example2;

import dps_03_action_type.dp07_observer.example2.concrete_observer.Reader;
import dps_03_action_type.dp07_observer.example2.concrete_subject.NewsDispatcher;

/**
 * ������<br>
 * �������۲��߽�ɫ�ͳ�������(��ɹ۲���)��ɫֱ��ʹ��Java�ṩ����ʵ�֣�����Դ�����в�û����������ɫ<br>
 * ��������(��ɹ۲���Subject)��ɫ:java.util.Observable<br>
 * ����۲���(Observer)��ɫ:java.util.Observer<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�������⣨��ɹ۲��ߣ���ɫ:���������ɷ���   
    NewsDispatcher sportNewsDispatcher = new NewsDispatcher();
    //�������⣨��ɹ۲��ߣ���ɫ:it�����ɷ���   
    NewsDispatcher itNewsDispatcher = new NewsDispatcher();

    //����۲��߽�ɫr1,r2,r3   
    Reader r1 = new Reader("�۲���1");
    Reader r2 = new Reader("�۲���2");
    Reader r3 = new Reader("�۲���3");

    //��ӹ۲���   
    sportNewsDispatcher.addObserver(r1);
    sportNewsDispatcher.addObserver(r2);
    itNewsDispatcher.addObserver(r3);

    //�����µ����ŵ�ʱ��֪ͨ�۲���   
    sportNewsDispatcher.addNews("�й���ͻ������ʷ��������籭�ھ�!");
    itNewsDispatcher.addNews("�׹����չ�Sun��java��ʼ�շ�!");
  }

}
