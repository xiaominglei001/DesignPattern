package dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example2.handler.Handler;

/**
 * ���崦���߽�ɫ��Concrete Handler����ʵ�ֳ����ɫ�ж���Ľӿڣ��������������������������ܴ�����������ĺ���ߡ�<br>
 * @author Administrator
 */
public class ConcreteHandler1 extends Handler {

  /**
   * ������,���ô˷�����������
   * @param request 
   */
  public void handleRequest(int request) {
    if (request >= 0 && request < 10) {
      System.out.println(getClass().getSimpleName() + "��������:" + request);
    } else if (successor != null) {
      successor.handleRequest(request);
    } else {
      System.out.println("��������޷�������:" + request);
    }
  }

}