package dps_03_action_type.dp02_command.example3.concrete_command;

import dps_03_action_type.dp02_command.example3.command.Command;
import dps_03_action_type.dp02_command.example3.receiver.Barbecuer;

/**
 * 具体命令角色（Concrete Command）：将一个接收者对象绑定于一个动作；调用接收者相应的操作，以实现命令角色声明的执行操作的接口。<br>
 * 烤鸡翅命令<br>
 * @author Administrator
 */
public class BakeChickenWingCommand implements Command {

  /**命令接收者*/
  private Barbecuer receiver;

  /**
   * 构造函数<br>
   * @param receiver
   */
  public BakeChickenWingCommand(Barbecuer receiver) {
    this.receiver = receiver;
  }

  /**
   * 执行命令(烤鸡翅)
   */
  public void executeCommand() {
    receiver.bakeChickenWing();
  }

}
