package dps_03_action_type.dp08_state.example2;

import dps_03_action_type.dp08_state.example2.context.Person;

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
    Person p = new Person();
    for (int i = 0; i < 10; i++) {
      //�ɻ�
      p.doSomething();
      //��Ϣһ��ģ��״̬���л�����ʱ��
      Thread.sleep(500);
    }
  }

}
