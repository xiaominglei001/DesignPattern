package dps_03_action_type.dp02_command.example3;

import dps_03_action_type.dp02_command.example3.command.Command;
import dps_03_action_type.dp02_command.example3.concrete_command.BakeChickenWingCommand;
import dps_03_action_type.dp02_command.example3.concrete_command.BakeMuttonCommand;
import dps_03_action_type.dp02_command.example3.invoker.Waiter;
import dps_03_action_type.dp02_command.example3.receiver.Barbecuer;

/**
 * 测试类<br>
 * 这里服务员能处理多个请求,并能取消订单<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //开店前的准备,这里计划烤3个羊肉串,1个鸡翅,后来取消了1羊肉串
    Barbecuer receiver = new Barbecuer();//接收者角色:烤羊肉串者

    Command command1 = new BakeMuttonCommand(receiver);//具体命令角色:烤羊肉串的命令
    Command command2 = new BakeMuttonCommand(receiver);//具体命令角色:烤羊肉串的命令
    Command command3 = new BakeMuttonCommand(receiver);//具体命令角色:烤羊肉串的命令
    Command command4 = new BakeChickenWingCommand(receiver);//具体命令:烤鸡翅的命令

    Waiter waiter = new Waiter();//请求者角色:服务员

    //开始营业
    waiter.addOrder(command1);//下订单
    waiter.addOrder(command2);//下订单
    waiter.addOrder(command3);//下订单
    waiter.addOrder(command4);//下订单
    waiter.cancelOrder(command2);//取消1个订单

    //通知并执行命令
    waiter.notify_();
  }

}
