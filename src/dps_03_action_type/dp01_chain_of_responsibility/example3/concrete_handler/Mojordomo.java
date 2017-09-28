package dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example3.Request;
import dps_03_action_type.dp01_chain_of_responsibility.example3.handler.Manager;

/**
 * ���崦���߽�ɫ��Concrete Handler����ʵ�ֳ����ɫ�ж���Ľӿڣ��������������������������ܴ�����������ĺ���ߡ�<br>
 * �ܼ�<br>
 * @author Administrator
 */
public class Mojordomo extends Manager {

  /**
   * ���캯��<br>
   * @param name
   */
  public Mojordomo(String name) {
    super(name);
  }

  /**
   * ������,���ô˷�����������
   * @param request 
   */
  public void requestApplication(Request request) {
    String desc = "[" + request.getContent() + " ����" + request.getNumber()
        + "]";
    if ("���".equals(request.getType()) && request.getNumber() <= 5) {
      System.out.println(name + ":" + desc + " ����׼");
    } else if (superior != null) {
      superior.requestApplication(request);
    } else {
      System.out.println(name + ":��������޷�������" + desc);
    }
  }

}