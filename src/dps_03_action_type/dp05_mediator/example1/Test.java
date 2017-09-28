package dps_03_action_type.dp05_mediator.example1;

import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague1;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague2;
import dps_03_action_type.dp05_mediator.example1.concrete_mediator.ConcreteMediator;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:�����н���
    ConcreteMediator m = new ConcreteMediator();

    //����ͬ�¶����ɫ��ConcreteColleague���������������ͬ����ʶ�н��߶���
    ConcreteColleague1 c1 = new ConcreteColleague1(m);
    ConcreteColleague2 c2 = new ConcreteColleague2(m);

    //���н�����ʶ��������ͬ�������
    m.setColleague1(c1);
    m.setColleague2(c2);

    //����ͬ�������ķ�����Ϣ����ͨ���н���ת��
    c1.send("�Թ�������");
    c2.send("û���أ���������?");
  }

}
