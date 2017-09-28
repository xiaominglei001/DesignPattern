package dps_03_action_type.dp02_command.example3.invoker;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import dps_03_action_type.dp02_command.example3.command.Command;

/**
 * �����߽�ɫ��Invoker���������������ִ���������<br>
 * ����Ա:�ܴ���������<br>
 * @author Administrator
 */
public class Waiter {

  /**�����ɫ����,Ϊ�����ɾ��Ч��,������Set����,ȱ�����ڲ�Ԫ�������*/
  private Set<Command> orders = new HashSet<Command>();

  /**
   * �¶���<br>
   * @param command
   */
  public void addOrder(Command command) {
    //�����ø��򵥵��ж���ģ��һ��ȱ��������,ʵ���������Ҫ����
    if (command.toString().contains("BakeChickenWingCommand")) {
      System.out.println("����Ա:����û����,������տ�.");
    } else {
      orders.add(command);
      System.out.println("���Ӷ���:" + command + " ʱ��:" + new Date());
    }
  }

  /**
   * ȡ������<br>
   * @param command
   */
  public void cancelOrder(Command command) {
    orders.remove(command);
    System.out.println("ȡ������:" + command + " ʱ��:" + new Date());
  }

  /**
   * ֪ͨ��ȫ��ִ��
   */
  public void notify_() {
    //����,Set�����ڲ�Ԫ���������
    for (Command command : orders) {
      command.executeCommand();
    }
  }

}
