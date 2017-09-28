package dps_03_action_type.dp02_command.example1;

import dps_03_action_type.dp02_command.example1.command.Command;
import dps_03_action_type.dp02_command.example1.concrete_command.ConcreteCommand;
import dps_03_action_type.dp02_command.example1.invoker.Invoker;
import dps_03_action_type.dp02_command.example1.receiver.Receiver;

/**
 * ������<br>
 * ���ƿ����ӵ���<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Receiver receiver = new Receiver();//�����߽�ɫ:���Ƶ��ӻ�
    Command command = new ConcreteCommand(receiver);//���������ɫ������ң�����ϵİ�����Ӧ�Ĳ�ͬ�ĵ��ź�
    Invoker invoker = new Invoker(command);//�����߽�ɫ:����ң����
    invoker.action();//ִ��
  }

}
