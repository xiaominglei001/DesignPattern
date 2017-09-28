package dps_03_action_type.dp01_chain_of_responsibility.example2;

import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler1;
import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler2;
import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler3;
import dps_03_action_type.dp01_chain_of_responsibility.example2.handler.Handler;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�������߽�ɫ��Handler����
    Handler handler1 = new ConcreteHandler1();//���崦���߽�ɫ
    Handler handler2 = new ConcreteHandler2();//���崦���߽�ɫ
    Handler handler3 = new ConcreteHandler3();//���崦���߽�ɫ

    // �����¼�
    handler1.setSuccessor(handler2);
    handler2.setSuccessor(handler3);

    //���ø�����������
    int[] arr = { 2, 5, 14, 22, 18, 3, 27, 20, 100, 3560 };
    for (int i : arr) {
      handler1.handleRequest(i);//�������� 
    }

  }

}
