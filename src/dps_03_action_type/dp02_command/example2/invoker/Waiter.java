package dps_03_action_type.dp02_command.example2.invoker;

import dps_03_action_type.dp02_command.example2.command.Command;

/**
 * 请求者角色（Invoker）：调用命令对象执行这个请求。<br>
 * 服务员:只能处理一个请求<br>
 * @author Administrator
 */
public class Waiter {

  /**命令角色*/
  private Command command;

  /**
   * 下订单<br>
   * @param command
   */
  public void setOrder(Command command) {
    this.command = command;
  }

  /**
   * 通知并执行命令
   */
  public void notify_() {
    command.executeCommand();
  }

}
