package dps_03_action_type.dp08_state.example1.state;

import dps_03_action_type.dp08_state.example1.context.Context;

/**
 * ����״̬��State����ɫ������һ���ӿ��Է�װ��ʹ�û�����ɫ��һ���ض�״̬��ص���Ϊ��<br>
 * @author Administrator
 */
public interface State {

  /**
   * �ɻ�<br>
   * @param context 
   */
  public void handle(Context context);

}