package dps_03_action_type.dp07_observer.example5.concrete_observer;

/**
 * ����۲��߽�ɫ:ϲ����NBA��Ա��<br>
 * ��ʵ��Ӧ����,�۲��߿����Ǳ����Ѿ�д�õ���,�޷�������иı�,����˵����ʵ��ͨ�ýӿ�Observer,<br>
 * ��������ֻ��һ����ͨ����,C#����ί��������������,������Secretary���÷���������<br>
 * @author Administrator
 */
public class NBAObserver {

  /**
   * �ı��Լ�״̬�ķ���
   * @param action 
   */
  public void updateNBAObserver(String action) {
    System.out.println(action + ",�ر�NBAֱ��,��������!");
  }

}
