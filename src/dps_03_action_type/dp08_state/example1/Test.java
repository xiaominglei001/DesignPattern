package dps_03_action_type.dp08_state.example1;

import dps_03_action_type.dp08_state.example1.concrete_state.ConcreteStateA;
import dps_03_action_type.dp08_state.example1.context.Context;

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
    //ʹ�û�����Context����ɫ
    Context c = new Context(new ConcreteStateA());//��ʼ״̬
    for (int i = 0; i < 5; i++) {
      //����
      c.request();
      //��Ϣһ��ģ��״̬���л�����ʱ��
      Thread.sleep(500);
    }
  }

}
