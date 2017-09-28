package dps_03_action_type.dp01_chain_of_responsibility.example3;

import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.CommonManager;
import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.GeneralManager;
import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.Mojordomo;
import dps_03_action_type.dp01_chain_of_responsibility.example3.handler.Manager;

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
    Manager jinli = new CommonManager("����");//���崦���߽�ɫ��Concrete Handler��:����
    Manager zongjian = new Mojordomo("�ڽ�");//���崦���߽�ɫ��Concrete Handler��:�ܼ�
    Manager zongjingli = new GeneralManager("�Ӿ���");//���崦���߽�ɫ��Concrete Handler��:�ܾ���

    //�����ϼ�
    jinli.setSuperior(zongjian);
    zongjian.setSuperior(zongjingli);

    //��������ϸ��
    Request request1 = new Request("���", "С�����", 1);
    Request request2 = new Request("���", "С�����", 4);
    Request request3 = new Request("��н", "С�������н", 500);
    Request request4 = new Request("��н", "С�������н", 1000);
    Request request5 = new Request("����", "С����������", 99999999);

    //��ʼ����,�������ɾ�����,������˭�����߿ͻ��˲���֪��
    jinli.requestApplication(request1);
    jinli.requestApplication(request2);
    jinli.requestApplication(request3);
    jinli.requestApplication(request4);
    jinli.requestApplication(request5);
  }

}
