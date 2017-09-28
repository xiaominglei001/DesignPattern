package dps_03_action_type.dp01_chain_of_responsibility.example1.handler;

/**
 * �������߽�ɫ��Handler������������һ����������Ľӿڡ���Ȼ�������ӵĲ�ͬʵ�֣�Ҳ�����������ɫ��ʵ�ֺ������<br>
 * ��������Ľӿ�<br>
 * @author Administrator
 */
public abstract class Handler {

  /**�����¼ҵ�����*/
  protected Handler successor;

  /**
   * ������,���ô˷�����������
   */
  public abstract void handleRequest();

  /**
   * ��ֵ���������ô˷��������¼�<br>
   * @param successor
   */
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

}