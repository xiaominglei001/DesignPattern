package dps_03_action_type.dp07_observer.example5.concrete_observer;

/**
 * ����۲��߽�ɫ:ϲ�������������Ա��<br>
 * ��ʵ��Ӧ����,�۲��߿����Ǳ����Ѿ�д�õ���,�޷�������иı�,����˵����ʵ��ͨ�ýӿ�Observer,<br>
 * ��������ֻ��һ����ͨ����,C#����ί��������������,������Secretary���÷���������<br>
 * @author Administrator
 */
public class StockObserver {

  /**
   * �ı��Լ�״̬�ķ���
   * @param action 
   */
  public void updateStock(String action) {
    System.out.println(action + ",�رչ�Ʊ����,��������!");
  }

}
