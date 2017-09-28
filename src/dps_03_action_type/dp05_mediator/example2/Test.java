package dps_03_action_type.dp05_mediator.example2;

import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord2;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger2;
import dps_03_action_type.dp05_mediator.example2.concrete_mediator.ConcreteMediator;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:�����н�
    ConcreteMediator m = new ConcreteMediator();

    //����ͬ�¶����ɫ��ConcreteColleague�������ĸ������ͬ����ʶ�����н�
    Landlord1 d1 = new Landlord1(m);
    Landlord2 d2 = new Landlord2(m);
    Lodger1 r1 = new Lodger1(m);
    Lodger2 r2 = new Lodger2(m);

    //�÷����н���ʶ��������ͬ�������
    m.setLandlord1(d1);
    m.setLandlord2(d2);
    m.setLodger1(r1);
    m.setLodger2(r2);

    //����ͬ�������ķ�����Ϣ����ͨ�������н�ת��
    d1.send("���Ƿ���1,���к÷�����.");
    d2.send("���Ƿ���2,��������������.");

    r1.send("���Ƿ���1,�����н���,�н�����!");
    r1.send("���Ƿ���2,���в���,������˭��?");
  }

}
