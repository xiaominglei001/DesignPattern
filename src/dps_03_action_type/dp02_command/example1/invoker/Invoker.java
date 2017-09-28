package dps_03_action_type.dp02_command.example1.invoker;

import dps_03_action_type.dp02_command.example1.command.Command;

/**
 * 请求者角色（Invoker）：调用命令对象执行这个请求。<br>
 * 类似遥控器<br>
 * @author Administrator
 */
public class Invoker {

  /**命令角色*/
  private Command command;

  /**
   * 构造函数<br>
   * @param command
   */
  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * 真正地执行命令
   */
  public void action() {
    command.execute();
  }

}
