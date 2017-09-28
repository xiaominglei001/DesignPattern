package dps_03_action_type.dp02_command.example1;

import dps_03_action_type.dp02_command.example1.command.Command;
import dps_03_action_type.dp02_command.example1.concrete_command.ConcreteCommand;
import dps_03_action_type.dp02_command.example1.invoker.Invoker;
import dps_03_action_type.dp02_command.example1.receiver.Receiver;

/**
 * 测试类<br>
 * 类似看电视的人<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Receiver receiver = new Receiver();//接收者角色:类似电视机
    Command command = new ConcreteCommand(receiver);//具体命令角色：类似遥控器上的按键对应的不同的电信号
    Invoker invoker = new Invoker(command);//请求者角色:类似遥控器
    invoker.action();//执行
  }

}
