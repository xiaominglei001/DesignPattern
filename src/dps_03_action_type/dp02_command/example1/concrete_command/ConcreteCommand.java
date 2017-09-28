package dps_03_action_type.dp02_command.example1.concrete_command;

import dps_03_action_type.dp02_command.example1.command.Command;
import dps_03_action_type.dp02_command.example1.receiver.Receiver;

/**
 * ���������ɫ��Concrete Command������һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ�������ɫ������ִ�в����Ľӿڡ�<br>
 * �����������ң�����ϵİ�����Ӧ�Ĳ�ͬ�ĵ��ź�<br>
 * @author Administrator
 */
public class ConcreteCommand implements Command {

  /**���������*/
  private Receiver receiver;

  /**
   * ���캯��<br>
   * @param receiver
   */
  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  /**
   * ִ������
   */
  public void execute() {
    receiver.action();
  }

}
