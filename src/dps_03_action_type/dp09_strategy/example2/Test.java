package dps_03_action_type.dp09_strategy.example2;

import dps_03_action_type.dp09_strategy.example2.context.CashContext;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //环境角色,客户端调用对象,假设(1:正常收费 2:打折 3:满x返x)
    CashContext context = new CashContext(3);
    double unitPrice = 301;//单价
    double amount = 1;//数量
    double totalPrice = context.getResult(unitPrice * amount);//计算后的总价钱
    System.out.println("您一共需要支付 " + totalPrice + " 元");
  }

}
