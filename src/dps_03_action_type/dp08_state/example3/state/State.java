package dps_03_action_type.dp08_state.example3.state;

/**
 * ����״̬��State����ɫ������һ���ӿ��Է�װ��ʹ�û�����ɫ��һ���ض�״̬��ص���Ϊ��<br>
 * @author Administrator
 */
public interface State {

  /**
   * Ͷ��
   */
  public void shot();

  /**
   * �ı�ʹ�û�����Context����ɫ��״̬
   */
  public void changeState();

}