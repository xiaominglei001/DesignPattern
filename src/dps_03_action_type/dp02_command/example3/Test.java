package dps_03_action_type.dp02_command.example3;

import dps_03_action_type.dp02_command.example3.command.Command;
import dps_03_action_type.dp02_command.example3.concrete_command.BakeChickenWingCommand;
import dps_03_action_type.dp02_command.example3.concrete_command.BakeMuttonCommand;
import dps_03_action_type.dp02_command.example3.invoker.Waiter;
import dps_03_action_type.dp02_command.example3.receiver.Barbecuer;

/**
 * ������<br>
 * �������Ա�ܴ���������,����ȡ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����ǰ��׼��,����ƻ���3�����⴮,1������,����ȡ����1���⴮
    Barbecuer receiver = new Barbecuer();//�����߽�ɫ:�����⴮��

    Command command1 = new BakeMuttonCommand(receiver);//���������ɫ:�����⴮������
    Command command2 = new BakeMuttonCommand(receiver);//���������ɫ:�����⴮������
    Command command3 = new BakeMuttonCommand(receiver);//���������ɫ:�����⴮������
    Command command4 = new BakeChickenWingCommand(receiver);//��������:�����������

    Waiter waiter = new Waiter();//�����߽�ɫ:����Ա

    //��ʼӪҵ
    waiter.addOrder(command1);//�¶���
    waiter.addOrder(command2);//�¶���
    waiter.addOrder(command3);//�¶���
    waiter.addOrder(command4);//�¶���
    waiter.cancelOrder(command2);//ȡ��1������

    //֪ͨ��ִ������
    waiter.notify_();
  }

}
