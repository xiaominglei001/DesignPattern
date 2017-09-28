package dps_03_action_type.dp05_mediator.example3;

import dps_03_action_type.dp05_mediator.example3.concrete_colleague.USA;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.Iraq;
import dps_03_action_type.dp05_mediator.example3.concrete_mediator.UnitedNationsSecurityCouncil;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ͣ��Ҳ���н��ߣ�ConcreteMediator����ɫ:���Ϲ���ȫ���»�
    UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

    //����ͬ�¶����ɫ��ConcreteColleague���������������ͬ����ʶ�н��߶���
    USA usa = new USA(unsc);//����
    Iraq iraq = new Iraq(unsc);//������

    //���н�����ʶ��������ͬ�������
    unsc.setColleague1(usa);
    unsc.setColleague2(iraq);

    //����ͬ�������ķ�����Ϣ����ͨ���н���ת��
    usa.declare("��׼���ƺ�����������Ҫ����ս����");
    iraq.declare("����û�к�������Ҳ�������ԡ�");
  }

}
