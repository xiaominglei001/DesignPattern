package dps_03_action_type.dp02_command.example2;

import dps_03_action_type.dp02_command.example2.command.Command;
import dps_03_action_type.dp02_command.example2.concrete_command.BakeChickenWingCommand;
import dps_03_action_type.dp02_command.example2.concrete_command.BakeMuttonCommand;
import dps_03_action_type.dp02_command.example2.invoker.Waiter;
import dps_03_action_type.dp02_command.example2.receiver.Barbecuer;

/**
 * ������<br>
 * �������Աֻ�ܴ���һ����<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����ǰ��׼��
    Barbecuer receiver = new Barbecuer();//�����߽�ɫ:�����⴮��
    
    Command command1 = new BakeMuttonCommand(receiver);//���������ɫ:�����⴮������
    Command command2 = new BakeChickenWingCommand(receiver);//���������ɫ:�����������
    
    Waiter waiter = new Waiter();//�����߽�ɫ:����Ա

    //��ʼӪҵ
    waiter.setOrder(command1);//�¶���
    waiter.notify_();//֪ͨ��ִ������

    waiter.setOrder(command2);//�¶���
    waiter.notify_();//֪ͨ��ִ������
  }

}
