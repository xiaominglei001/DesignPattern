package dps_03_action_type.dp01_chain_of_responsibility.example1;

import dps_03_action_type.dp01_chain_of_responsibility.example1.concrete_handler.ConcreteHandler;
import dps_03_action_type.dp01_chain_of_responsibility.example1.handler.Handler;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // ������ͬһ����ConcreteHandler�Ĳ�ͬ������ģ��������ͬ�����ɫ
    //�������߽�ɫ��Handler����
    Handler handler1 = new ConcreteHandler();//���崦���߽�ɫ
    Handler handler2 = new ConcreteHandler();//���崦���߽�ɫ

    handler1.setSuccessor(handler2);//�����¼�
    handler1.handleRequest();//�������� 
  }

}
