package dps_03_action_type.dp02_command.example1.concrete_command;

import dps_03_action_type.dp02_command.example1.command.Command;
import dps_03_action_type.dp02_command.example1.receiver.Receiver;

/**
 * 具体命令角色（Concrete Command）：将一个接收者对象绑定于一个动作；调用接收者相应的操作，以实现命令角色声明的执行操作的接口。<br>
 * 具体命令：类似遥控器上的按键对应的不同的电信号<br>
 * @author Administrator
 */
public class ConcreteCommand implements Command {

  /**命令接收者*/
  private Receiver receiver;

  /**
   * 构造函数<br>
   * @param receiver
   */
  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  /**
   * 执行命令
   */
  public void execute() {
    receiver.action();
  }

}
