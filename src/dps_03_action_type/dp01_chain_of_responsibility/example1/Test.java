package dps_03_action_type.dp01_chain_of_responsibility.example1;

import dps_03_action_type.dp01_chain_of_responsibility.example1.concrete_handler.ConcreteHandler;
import dps_03_action_type.dp01_chain_of_responsibility.example1.handler.Handler;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // 这里用同一个类ConcreteHandler的不同对象来模拟两个不同处理角色
    //抽象处理者角色（Handler）：
    Handler handler1 = new ConcreteHandler();//具体处理者角色
    Handler handler2 = new ConcreteHandler();//具体处理者角色

    handler1.setSuccessor(handler2);//设置下家
    handler1.handleRequest();//处理请求 
  }

}
