package dps_03_action_type.dp01_chain_of_responsibility.example1.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example1.handler.Handler;

/**
 * ���崦���߽�ɫ��Concrete Handler����ʵ�ֳ����ɫ�ж���Ľӿڣ��������������������������ܴ�����������ĺ���ߡ�<br>
 * @author Administrator
 */
public class ConcreteHandler extends Handler {

  /**
   * ������,���ô˷�����������,�¼�Ϊ���Լ�����,�¼Ҳ�Ϊ��,�����¼Ҵ���.
   */
  public void handleRequest() {
    if (successor == null) {
      System.out.println("The request is handled here.");
    } else {
      System.out.println("The request is passed to [ " + successor + " ]");
      successor.handleRequest();
    }
  }

}