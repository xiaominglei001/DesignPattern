package dps_03_action_type.dp02_command.example1.invoker;

import dps_03_action_type.dp02_command.example1.command.Command;

/**
 * �����߽�ɫ��Invoker���������������ִ���������<br>
 * ����ң����<br>
 * @author Administrator
 */
public class Invoker {

  /**�����ɫ*/
  private Command command;

  /**
   * ���캯��<br>
   * @param command
   */
  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * ������ִ������
   */
  public void action() {
    command.execute();
  }

}
