package dps_03_action_type.dp02_command.example3.invoker;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import dps_03_action_type.dp02_command.example3.command.Command;

/**
 * 请求者角色（Invoker）：调用命令对象执行这个请求。<br>
 * 服务员:能处理多个请求<br>
 * @author Administrator
 */
public class Waiter {

  /**命令角色集合,为了提高删除效率,这里用Set集合,缺点是内部元素无序的*/
  private Set<Command> orders = new HashSet<Command>();

  /**
   * 下订单<br>
   * @param command
   */
  public void addOrder(Command command) {
    //这里用个简单的判断来模拟一个缺货的条件,实际情况比这要复杂
    if (command.toString().contains("BakeChickenWingCommand")) {
      System.out.println("服务员:鸡翅没有了,请点别的烧烤.");
    } else {
      orders.add(command);
      System.out.println("增加订单:" + command + " 时间:" + new Date());
    }
  }

  /**
   * 取消订单<br>
   * @param command
   */
  public void cancelOrder(Command command) {
    orders.remove(command);
    System.out.println("取消订单:" + command + " 时间:" + new Date());
  }

  /**
   * 通知并全部执行
   */
  public void notify_() {
    //遍历,Set集合内部元素是无序的
    for (Command command : orders) {
      command.executeCommand();
    }
  }

}
