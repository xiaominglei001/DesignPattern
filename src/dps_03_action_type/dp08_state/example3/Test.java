package dps_03_action_type.dp08_state.example3;

import dps_03_action_type.dp08_state.example3.context.Player;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    //ʹ�û�����Context����ɫ����
    Player p = new Player();
    for (int i = 0; i < 10; i++) {
      //Ͷ��
      p.shot();
      //��Ϣһ��ģ��״̬���л�����ʱ��
      Thread.sleep(500);
    }
  }

}
