package dps_03_action_type.dp01_chain_of_responsibility.example2.handler;

/**
 * �������߽�ɫ��Handler������������һ����������Ľӿڡ���Ȼ�������ӵĲ�ͬʵ�֣�Ҳ�����������ɫ��ʵ�ֺ������<br>
 * ���������нӿ�<br>
 * @author Administrator
 */
public abstract class Handler {

  /**�����¼ҵ�����*/
  protected Handler successor;

  /**
   * ������,���ô˷�����������
   * @param request 
   */
  public abstract void handleRequest(int request);

  /**
   * ��ֵ���������ô˷��������¼�<br>
   * @param successor
   */
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

}