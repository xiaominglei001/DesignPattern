package dps_03_action_type.dp02_command.example1.command;

/**
 * 命令角色（Command）：声明执行操作的接口。有java接口或者抽象类来实现。<br>
 * 类似电信号<br>
 * @author Administrator
 */
public interface Command {

  /**
   * 执行命令
   */
  public void execute();

}