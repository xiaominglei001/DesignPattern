package dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example3.Request;
import dps_03_action_type.dp01_chain_of_responsibility.example3.handler.Manager;

/**
 * ���崦���߽�ɫ��Concrete Handler����ʵ�ֳ����ɫ�ж���Ľӿڣ��������������������������ܴ�����������ĺ���ߡ�<br>
 * �ܾ���:�ܾ����Ǵ����ս���,Ȩ�޾���ȫ������Ҫ����<br>
 * @author Administrator
 */
public class GeneralManager extends Manager {

  /**
   * ���캯��<br>
   * @param name
   */
  public GeneralManager(String name) {
    super(name);
  }

  /**
   * ������,���ô˷�����������
   * @param request 
   */
  public void requestApplication(Request request) {
    String desc = "[" + request.getContent() + " ����" + request.getNumber()
        + "]";
    if ("���".equals(request.getType())) {
      System.out.println(name + ":" + desc + " ����׼");
    } else if ("��н".equals(request.getType()) && request.getNumber() <= 500) {
      System.out.println(name + ":" + desc + " ����׼");
    } else if ("��н".equals(request.getType()) && request.getNumber() > 500) {
      System.out.println(name + ":" + desc + " �Ժ���˵");
    } else {
      System.out.println(name + ":��������޷�������" + desc);
    }
  }

}