package dps_03_action_type.dp01_chain_of_responsibility.example3.handler;

import dps_03_action_type.dp01_chain_of_responsibility.example3.Request;

/**
 * �������߽�ɫ��Handler������������һ����������Ľӿڡ���Ȼ�������ӵĲ�ͬʵ�֣�Ҳ�����������ɫ��ʵ�ֺ������<br>
 * ���������<br>
 * @author Administrator
 */
public abstract class Manager {

  /**�����ߵ�����*/
  protected String name;
  /**�����ߵ��ϼ�*/
  protected Manager superior;

  /**
   * ���캯��<br>
   * @param name
   */
  public Manager(String name) {
    this.name = name;
  }

  /**
   * ������,���ô˷�����������
   * @param request 
   */
  public abstract void requestApplication(Request request);

  /**
   * ��ֵ���������ô˷��������ϼ�<br>
   * @param superior
   */
  public void setSuperior(Manager superior) {
    this.superior = superior;
  }

}