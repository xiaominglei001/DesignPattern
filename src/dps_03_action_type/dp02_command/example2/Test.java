package dps_03_action_type.dp02_command.example2;

import dps_03_action_type.dp02_command.example2.command.Command;
import dps_03_action_type.dp02_command.example2.concrete_command.BakeChickenWingCommand;
import dps_03_action_type.dp02_command.example2.concrete_command.BakeMuttonCommand;
import dps_03_action_type.dp02_command.example2.invoker.Waiter;
import dps_03_action_type.dp02_command.example2.receiver.Barbecuer;

/**
 * 测试类<br>
 * 这里服务员只能处理单一请求<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //开店前的准备
    Barbecuer receiver = new Barbecuer();//接收者角色:烤羊肉串者
    
    Command command1 = new BakeMuttonCommand(receiver);//具体命令角色:烤羊肉串的命令
    Command command2 = new BakeChickenWingCommand(receiver);//具体命令角色:烤鸡翅的命令
    
    Waiter waiter = new Waiter();//请求者角色:服务员

    //开始营业
    waiter.setOrder(command1);//下订单
    waiter.notify_();//通知并执行命令

    waiter.setOrder(command2);//下订单
    waiter.notify_();//通知并执行命令
  }

}
