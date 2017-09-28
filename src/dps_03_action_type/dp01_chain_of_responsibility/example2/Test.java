package dps_03_action_type.dp01_chain_of_responsibility.example2;

import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler1;
import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler2;
import dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler.ConcreteHandler3;
import dps_03_action_type.dp01_chain_of_responsibility.example2.handler.Handler;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象处理者角色（Handler）：
    Handler handler1 = new ConcreteHandler1();//具体处理者角色
    Handler handler2 = new ConcreteHandler2();//具体处理者角色
    Handler handler3 = new ConcreteHandler3();//具体处理者角色

    // 设置下家
    handler1.setSuccessor(handler2);
    handler2.setSuccessor(handler3);

    //设置个数组做测试
    int[] arr = { 2, 5, 14, 22, 18, 3, 27, 20, 100, 3560 };
    for (int i : arr) {
      handler1.handleRequest(i);//处理请求 
    }

  }

}
