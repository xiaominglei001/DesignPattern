package dps_03_action_type.dp02_command.example2.invoker;

import dps_03_action_type.dp02_command.example2.command.Command;

/**
 * �����߽�ɫ��Invoker���������������ִ���������<br>
 * ����Ա:ֻ�ܴ���һ������<br>
 * @author Administrator
 */
public class Waiter {

  /**�����ɫ*/
  private Command command;

  /**
   * �¶���<br>
   * @param command
   */
  public void setOrder(Command command) {
    this.command = command;
  }

  /**
   * ֪ͨ��ִ������
   */
  public void notify_() {
    command.executeCommand();
  }

}
