package dps_03_action_type.dp08_state.example4.state;

import dps_03_action_type.dp08_state.example4.context.Work;

/**
 * ����״̬��State����ɫ������һ���ӿ��Է�װ��ʹ�û�����ɫ��һ���ض�״̬��ص���Ϊ��<br>
 * @author Administrator
 */
public interface State {

  /**
   * �ɻ�
   * @param work 
   */
  public void writeProgram(Work work);

}