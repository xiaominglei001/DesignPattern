package dps_03_action_type.dp01_chain_of_responsibility.example2.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example2.handler.Handler;

/**
 * 具体处理者角色（Concrete Handler）：实现抽象角色中定义的接口，并处理它所负责的请求。如果不能处理则访问它的后继者。<br>
 * @author Administrator
 */
public class ConcreteHandler1 extends Handler {

  /**
   * 处理方法,调用此方法处理请求
   * @param request 
   */
  public void handleRequest(int request) {
    if (request >= 0 && request < 10) {
      System.out.println(getClass().getSimpleName() + "处理请求:" + request);
    } else if (successor != null) {
      successor.handleRequest(request);
    } else {
      System.out.println("这个请求无法被处理:" + request);
    }
  }

}