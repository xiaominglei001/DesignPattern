package dps_03_action_type.dp08_state.example2.state;

/**
 * ����״̬��State����ɫ������һ���ӿ��Է�װ��ʹ�û�����ɫ��һ���ض�״̬��ص���Ϊ��<br>
 * @author Administrator
 */
public interface MoodState {

  /**
   * �ɻ�
   */
  public void doSomething();

  /**
   * �ı�ʹ�û�����Context����ɫ��״̬
   */
  public void changeState();

}