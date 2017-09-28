package dps_03_action_type.dp02_command.example3.concrete_command;

import dps_03_action_type.dp02_command.example3.command.Command;
import dps_03_action_type.dp02_command.example3.receiver.Barbecuer;

/**
 * ���������ɫ��Concrete Command������һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ�������ɫ������ִ�в����Ľӿڡ�<br>
 * ����������<br>
 * @author Administrator
 */
public class BakeChickenWingCommand implements Command {

  /**���������*/
  private Barbecuer receiver;

  /**
   * ���캯��<br>
   * @param receiver
   */
  public BakeChickenWingCommand(Barbecuer receiver) {
    this.receiver = receiver;
  }

  /**
   * ִ������(������)
   */
  public void executeCommand() {
    receiver.bakeChickenWing();
  }

}
